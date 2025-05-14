package homework.seleniumDemos.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebElementsInteractions {

    @Test
    public void presentWebElementsSynchronizations(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .withMessage("Time out as the condition is not met")
                .ignoring(NoSuchElementException.class);

        //driver.manage().window().minimize();
        WebElement username = driver.findElement(By.id("identifierId"));
        username.sendKeys("seleniumdemonstrator@gmail.com");
        //driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

        //driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test123!");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("Test123!");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();

        driver.quit();
    }

    @Test
    public void findWebElementsCollection (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> labels = driver.findElements(with(By.tagName("label")).below(By.xpath("//*[@id=\"load_form\"]/h3")));


        for(WebElement label: labels) {

            System.out.println(label.getText());
        }
        driver.quit();
    }

}
