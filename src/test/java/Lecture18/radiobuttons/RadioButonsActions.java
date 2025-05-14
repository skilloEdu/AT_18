package homework.seleniumDemos.radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButonsActions {

    //Test cases consts
    private final static String BASE_URL = "https://webdriveruniversity.com/";
    private final int WAIT = 3333;
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));

    @BeforeTest
    public void tearUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("*** THE BROWSER HAS STARTED ****");
    }

    @Test
    public void verifyRadioButtonWorkFlowWithSelenium() throws InterruptedException {

        //1 Test case local vars
        //1 .1. Navigation vars
        String RADIOBUTTONS_URL = BASE_URL+"Dropdown-Checkboxes-RadioButtons/index.html";
        String EXPECTED_RADIOBUTTONS_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
        //1.2. WebElements locatorStrategies

        //1.3. Texts and Messages or Alerts etc.

        //Test Case navigation
        driver.get(RADIOBUTTONS_URL);

        //Test Case navigation verification
        wait.until(ExpectedConditions.urlContains(EXPECTED_RADIOBUTTONS_URL));

        //Test case selenium interactions
        // We need to create a webElement with the Selenium library
        WebElement greenRadioButton = driver.findElement(By.xpath("//input[contains(@type, 'radio') and contains(@value, 'green')]"));

        wait.until(ExpectedConditions.visibilityOf(greenRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(greenRadioButton));

        //Test Case real functionality
        greenRadioButton.click();

        //Test case verifications
        boolean isGreenRadioButtonSelected = greenRadioButton.isSelected();
        Assert.assertTrue(isGreenRadioButtonSelected);
        Thread.sleep(WAIT);
    }

    @Test
    public void verifyRadioButtonCanBeSelectedAndDeselected() throws InterruptedException {

        //1 Test case local vars
        //1 .1. Navigation vars
        String RADIOBUTTONS_URL = BASE_URL+"Dropdown-Checkboxes-RadioButtons/index.html";
        String EXPECTED_RADIOBUTTONS_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
        //1.2. WebElements locatorStrategies

        //1.3. Texts and Messages or Alerts etc.

        //Test Case navigation
        driver.get(RADIOBUTTONS_URL);

        //Test Case navigation verification
        wait.until(ExpectedConditions.urlContains(EXPECTED_RADIOBUTTONS_URL));

        //Test case selenium interactions
        // We need to create a webElement with the Selenium library
        WebElement greenRadioButton = driver.findElement(By.xpath("//input[contains(@type, 'radio') and contains(@value, 'green')]"));
        WebElement blueRadioButton = driver.findElement(By.xpath("//input[contains(@type, 'radio') and contains(@value, 'blue')]"));

        wait.until(ExpectedConditions.visibilityOf(greenRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(greenRadioButton));

        //Test Case real functionality
        greenRadioButton.click();

        //Test case verifications
        boolean isGreenRadioButtonSelected = greenRadioButton.isSelected();
        Assert.assertTrue(isGreenRadioButtonSelected);

        //Select other radioButton in order to select the previous one
        blueRadioButton.click();

        //Verify the previous radio button in not anymore selected
        isGreenRadioButtonSelected = greenRadioButton.isSelected();
        Assert.assertFalse(isGreenRadioButtonSelected);
        Thread.sleep(WAIT);
    }

    @AfterTest
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
