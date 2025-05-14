package Lecture15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class SeleniumTest {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(13));

    @BeforeMethod
    public void initBrowser(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void verifySeleniumStarts() throws InterruptedException {

        //MAIN TEST ROLES
        String TEST_USER_NAME = "TestingDemos";
        String TEST_USER_PASSWORD = "Test123!";

        String LOGIN_PAGE_URL = "http://training.skillo-bg.com:4300/users/login";
        // UI MAP
        // LOGIN FORM
        // 1.2. USER NAME
        String USER_NAME_INPUT_FIELD_CSS = "#defaultLoginFormUsername";
        String PASSWORD_INPUT_FIELD_CSS = "#defaultLoginFormPassword";
        String SIGN_IN_BUTTON_CSS = "#sign-in-button";

        System.out.println("STEP 1 : The user has landed on Skillo login page");
        driver.get(LOGIN_PAGE_URL);

        System.out.println("STEP 2 : The has provided username");
        //1 Declaration of a webElement that will be used
        WebElement user_name_input_field = driver.findElement(By.cssSelector(USER_NAME_INPUT_FIELD_CSS));
        //1.2. User action
        typeTextIn(user_name_input_field,TEST_USER_NAME);

        //2. PASSWORD TO BE PROVIDED
        System.out.println("STEP 3 : The has provided password");
        WebElement password_input_field = driver.findElement(By.cssSelector("#defaultLoginFormPassword123"));
        typeTextIn(password_input_field, TEST_USER_PASSWORD);

        System.out.println("STEP 4 : The pressed the button for sign in");
        WebElement signIn_button = driver.findElement(By.cssSelector(SIGN_IN_BUTTON_CSS));
        clickOn(signIn_button);

    }

    @AfterMethod
    public void killBroswer(){
        if (driver!=null){
            driver.quit();
        }
    }

    public void typeTextIn(WebElement element, String text){
        //First check if the element is ready = visible
        wait.until(ExpectedConditions.visibilityOf(element));
        //For input fields make sure there is no already provided text that will be in
        // with the provided test data
        element.clear();
        //Provide the needed text
        element.sendKeys(text);
    }

    public void clickOn(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

}
