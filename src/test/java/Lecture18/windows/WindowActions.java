package homework.seleniumDemos.windows;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowActions {

    @Test
    public void provideWindowsActionDemo(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getWindowHandles().size());

        Set<String> winids = driver.getWindowHandles();
        Iterator<String> iterator = winids.iterator();

        List<String> winIndex = new ArrayList<String>();
        while (iterator.hasNext()) {

            winIndex.add(iterator.next());
        }

        driver.switchTo().window(winIndex.get(0));
        System.out.println("First window title is :" + driver.getTitle());

        driver.close();

        driver.switchTo().window(winIndex.get(1));
        System.out.println("second window title is :" + driver.getTitle());

        driver.close();

        driver.switchTo().window(winIndex.get(2));
        System.out.println("third window title is :" + driver.getTitle());

        driver.quit();
    }

}
