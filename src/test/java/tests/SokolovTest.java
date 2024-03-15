package tests;

import model.CataloguePage;
import model.EarringsPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import runner.BaseTest;
import model.MainPage;

public class SokolovTest extends BaseTest {

    @Test
    public void addToBasketTest() {

        MainPage mainPage = new MainPage(getDriver());

        mainPage.catalogueButtonClick();

        CataloguePage cataloguePage = new CataloguePage(getDriver());

        cataloguePage.earringsCategorySubItemClick();

        EarringsPage earringsPage = new EarringsPage(getDriver());

        earringsPage
                .maxPriceInput("50000")
                .chooseSilverMaterial()
                .chooseSingleSubcategory()
                .chooseWomenGender()
                .StockFilterClick();
    }


}






//        WebElement hoverable = driver.findElement(By.id("hover"));
//        new Actions(driver)
//                .moveToElement(hoverable)
//                .perform();


