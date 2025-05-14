package Lecture18.alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsDemostrations {

    public static final String URL_ALERTS = "https://www.selenium.dev/documentation/webdriver/interactions/alerts/";

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(13));

    @BeforeMethod
    public void initBrowser(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void verifySimpleAlertInteraction() throws InterruptedException {
        //Navigation go to the requested URK
        driver.get(URL_ALERTS);
        String actual_url_loaded = driver.getCurrentUrl();
        wait.until(ExpectedConditions.urlContains("webdriver/interactions/alerts/"));
        Assert.assertEquals(URL_ALERTS,actual_url_loaded);

        //Start to interact with simple alert
        WebElement simpleAlertbutton = driver.findElement(By.linkText("See an example alert"));
        wait.until(ExpectedConditions.visibilityOf(simpleAlertbutton));
        simpleAlertbutton.click();

        //2 Flows
        Alert simpleAlert = wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(999);
        simpleAlert.accept(); //when we want to accept the alert
        Thread.sleep(999);

    }

    @Test
    public void verifyConfirmationAlertInteraction() throws InterruptedException {
        //Navigation go to the requested URK
        driver.get(URL_ALERTS);
        String actual_url_loaded = driver.getCurrentUrl();
        wait.until(ExpectedConditions.urlContains("webdriver/interactions/alerts/"));
        Assert.assertEquals(URL_ALERTS,actual_url_loaded);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)","");

        //Start to interact with simple alert
        WebElement confirmationAlertbutton = driver.findElement(By.linkText("See a sample confirm"));
        wait.until(ExpectedConditions.visibilityOf(confirmationAlertbutton));

        confirmationAlertbutton.click();

        Alert simpleAlert = wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(999);
        simpleAlert.accept();
        Thread.sleep(999);

        //Thread.sleep(999);
        //simpleAlert.dismiss(); //when we want to dismiss the alert
        //Thread.sleep(999);
    }


    @AfterMethod
    public void killBroswer(){
        if (driver!=null){
            driver.quit();
        }
    }
}
