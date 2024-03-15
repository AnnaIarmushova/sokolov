package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CataloguePage extends BasePage {

    @FindBy(css = "[href=\"/jewelry-catalog/earrings/\"]")
    private WebElement earringsCategorySubItem;

    public CataloguePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public WebElement getEarringsCategorySubItem() {
        return earringsCategorySubItem;
    }

    public EarringsPage earringsCategorySubItemClick() {
        getWait3().until(ExpectedConditions.visibilityOf(getEarringsCategorySubItem())).click();
        return new EarringsPage(getDriver());
    }
}



