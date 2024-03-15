package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private final WebDriver driver;
    private WebDriverWait wait3;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait3() {
        if (wait3 == null) {
            wait3 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }
        return wait3;
    }
}
