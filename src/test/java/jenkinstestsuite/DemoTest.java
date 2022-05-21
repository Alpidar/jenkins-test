package jenkinstestsuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void search(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("google", Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());

        driver.close();
        driver.quit();
    }
}
