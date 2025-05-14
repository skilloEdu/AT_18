package homework.seleniumDemos.iframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class IFramesActions {

    @Test
    public void provideDemoForIFrames() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://webdriveruniversity.com/IFrame/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        System.out.println("THE TOTAL NUMBER OF IFrames in this page are");
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //Switch to frame by IFrameName
        driver.switchTo().frame("frame");
        driver.findElement(By.xpath("//a[contains(text(),'Our Products')]")).click();

        driver.quit();
    }
}
