package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(css = "[data-qa=\"header_catalog_nav_open_btn\"]")
    private WebElement catalogueButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public WebElement getСatalogueButton() {
        return catalogueButton;
    }
}
