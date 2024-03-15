package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait3;

    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait3() {
        if(wait3 == null) {
            wait3 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }
        return wait3;
    }
    @BeforeMethod
    protected void beforeMethod() {
        FirefoxOptions options = new FirefoxOptions();
        //      options.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver(options);

        getDriver().get("https://sokolovjewelry.kz/");
}
        @AfterMethod
        protected void afterMethod()  {
                driver.quit();
            }
        }
