package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BasePage {

    @FindBy(css = "[href=\"/jewelry-catalog/product/94170234/\"]")
    private WebElement itemTitle;
    public BasketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public WebElement getItemTitle() {
        return itemTitle;
    }


}
