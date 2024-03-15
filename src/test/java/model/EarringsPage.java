package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EarringsPage extends BasePage {
    @FindBy(css = "[data-qa=\"max_price\"]")
    private WebElement maxPriceInputField;
    @FindBy(css = "[id=\"silver\"]")
    private WebElement silverMaterialCheckbox;
    @FindBy(css = "[id=\"single\"]")
    private WebElement singleSubcategoryCheckbox;
    @FindBy(css = "[id=\"women\"]")
    private WebElement womenGenderRadioButton;
    @FindBy(css = "[data-qa=\"filter_section_stock\"]")
    private WebElement stockFilterSection;

    @FindBy(css = "[data-qa=\"one_value\"]")
    private WebElement stockFilterSectionCheckbox;

    @FindBy(css = "[class=\"ProductListItem_product__loEv1\"]")
    private WebElement itemHover;

    @FindBy(css = "[data-qa=\"add_to_basket\"]")
    private WebElement addToBasketButton;

    public EarringsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public WebElement getMaxPriceInputField() {
        return maxPriceInputField;
    }

    public WebElement getSilverMaterialCheckbox() {
        return silverMaterialCheckbox;
    }

    public WebElement getSingleSubcategoryCheckbox() {
        return singleSubcategoryCheckbox;
    }

    public WebElement getWomenGenderRadioButton() {
        return womenGenderRadioButton;
    }

    public WebElement getStockFilterSection() {
        return stockFilterSection;
    }

    public WebElement getStockFilterSectionCheckbox() {
        return stockFilterSectionCheckbox;
    }

    public WebElement getItemHover() {
        return itemHover;
    }

    public WebElement getAddToBasketButton() {
        return addToBasketButton;
    }

    public EarringsPage maxPriceInput(String maxPrice) {
        new Actions(getDriver())
                .doubleClick(getWait3().until(ExpectedConditions.visibilityOf(getMaxPriceInputField())))
                .perform();
        getMaxPriceInputField().click();
        getMaxPriceInputField().sendKeys(maxPrice);
        return this;
    }
    public EarringsPage chooseSilverMaterial() {
        getSilverMaterialCheckbox().click();
        return this;
    }
    public EarringsPage chooseSingleSubcategory() {
        getWait3().until(ExpectedConditions.elementToBeClickable(getSingleSubcategoryCheckbox())).click();
        return this;
    }
    public EarringsPage chooseWomenGender() {
        getWait3().until(ExpectedConditions.elementToBeClickable(getWomenGenderRadioButton())).click();
        return this;
    }
    public EarringsPage StockFilterClick() {
        getStockFilterSection().click();
        getStockFilterSectionCheckbox().click();
        return this;
    }
}
