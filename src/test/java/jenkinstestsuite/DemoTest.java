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
        // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.setHeadless(true);
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        chromeOptions.addArguments("window-size=1920,1080");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--allow-insecure-localhost");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("google", Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());

        driver.close();
        driver.quit();
    }
}
