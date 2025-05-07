package Lecture15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SeleniumTest {


    @Test
    public void verifySeleniumStarts() throws InterruptedException {

        // MAIN TEST ROLES
        String USER_NAME = "TestingDemos";
        String PASSWORD = "Test123!";

        String LOGIN_PAGE_URL = "http://training.skillo-bg.com:4300/users/login";
        // UI MAP
        // LOGIN FORM
        // 1.2. USER NAME
        String USER_NAME_INPUT_FIELD_CSS = "#defaultLoginFormUsername";
        String PASSWORD_INPUT_FIELD_CSS = "#defaultLoginFormPassword";
        String SIGN_IN_BUTTON_CSS = "#sign-in-button";


        //USER ACTIONS
        WebDriver driver = new ChromeDriver();
        driver.get(LOGIN_PAGE_URL);

        //1 Declaration of a webElement that will be used
        WebElement userName = driver.findElement(By.cssSelector(USER_NAME_INPUT_FIELD_CSS));

        //2 Some User actions - click on the webElem
        userName.click();
        Thread.sleep(1000);

        //3 User Actions clear input field
        userName.clear();
        Thread.sleep(1000);

        //4 User Actions provide text
        userName.sendKeys(USER_NAME);

        WebElement password = driver.findElement(By.cssSelector("#defaultLoginFormPassword"));

        password.click();
        password.clear();
        password.sendKeys("Test123!");

        WebElement signIn = driver.findElement(By.cssSelector(SIGN_IN_BUTTON_CSS));
        signIn.click();

        driver.quit();

    }
}
