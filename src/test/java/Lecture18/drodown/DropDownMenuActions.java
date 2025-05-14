package homework.seleniumDemos.drodown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropDownMenuActions {
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
    public void verifyCheckBoxesWorkFlowWithSelenium() throws InterruptedException {

        //1 Test case local vars
        //1 .1. Navigation vars
        String DROPDOWN_URL = BASE_URL+"Dropdown-Checkboxes-RadioButtons/index.html";
        String EXPEXTED_DROPDOWN_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";

        //Test Case navigation
        driver.get(DROPDOWN_URL);

        // User selenium library Select
        Select dropDOwnMenuSelectionOption = new Select(driver.findElement(By.id("dropdowm-menu-1")));

        //DropDown interactions
        //Select a dropdown  option by index
        dropDOwnMenuSelectionOption.selectByIndex(1);
        Thread.sleep(WAIT);

        dropDOwnMenuSelectionOption.selectByIndex(2);
        Thread.sleep(WAIT);

        dropDOwnMenuSelectionOption.selectByIndex(3);
        Thread.sleep(WAIT);

        //Select a dropdown by Visible value
        dropDOwnMenuSelectionOption.selectByVisibleText("JAVA");
        Thread.sleep(WAIT);

        //Select a dropdown option by Value
        dropDOwnMenuSelectionOption.selectByValue("c#");
        Thread.sleep(WAIT);

    }

    @Test
    public void verifyMultiselectionOfCheckBoxesWorkFlowWithSelenium() throws InterruptedException {

        //1 Test case local vars
        //1 .1. Navigation vars
        String CHECKBOX_URL = BASE_URL+"Dropdown-Checkboxes-RadioButtons/index.html";
        String EXPEXTED_CHECKBOX_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
        //1.2. WebElements locatorStrategies
        String idLocatorForAlertWindow = "alertButton";

        //1.3. Texts and Messages or Alerts etc.

        //Test Case navigation
        driver.get(CHECKBOX_URL);

        //Test Case navigation verification
        wait.until(ExpectedConditions.urlContains(EXPEXTED_CHECKBOX_URL));

        //Test case selenium interactions
        // We need to create a webElement with the Selenium library
        WebElement checkBox1 = driver.findElement(By.xpath("//input[contains(@value,'option-1')]"));
        wait.until(ExpectedConditions.visibilityOf(checkBox1));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox1));

        WebElement checkBox2 = driver.findElement(By.xpath("//input[contains(@value,'option-2')]"));
        wait.until(ExpectedConditions.visibilityOf(checkBox2));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox2));
        //Test Case real functionality checks
        checkBox1.click();
        checkBox2.click();

        //Test case verifications
        boolean isCHeckBox1Selected = checkBox1.isSelected();
        boolean isCHeckBo21Selected = checkBox2.isSelected();
        Assert.assertTrue(isCHeckBox1Selected);
        Assert.assertTrue(isCHeckBo21Selected);

        Thread.sleep(WAIT);
    }


    @AfterTest
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
