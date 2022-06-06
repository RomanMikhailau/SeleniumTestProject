package pageobject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.duckswebsite.headermenu.*;

import static pageobject.object.HomePage.testLogin;

public class DucksWebsiteTest extends TestBase {

    @Test
    public void rubberDucksLinkTest() {
        testLogin(driver);
        HeaderMenu rubberDucksLink = new HeaderMenu(driver);
        rubberDucksLink.rubberDucksLinkClick();
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void SubCategoryLinkTest() {
        testLogin(driver);
        HeaderMenu subCategoryLink = new HeaderMenu(driver);
        subCategoryLink.subCategoryLinkClick();
        SubCategoryPage subCategoryPage = new SubCategoryPage(driver);
        Assert.assertTrue(subCategoryPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void deliveryInformationLinkTest() {
        testLogin(driver);
        HeaderMenu deliveryInformationLink = new HeaderMenu(driver);
        deliveryInformationLink.deliveryInformationLinkClick();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void termsAndConditionsLinkTest() {
        testLogin(driver);
        HeaderMenu termsAndConditionsLink = new HeaderMenu(driver);
        termsAndConditionsLink.termsAndConditionsLinkClick();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Page has not opened");

    }

    @Test
    public void isOpenedPageSortByNameTrue() {
        SortedMenu name = new SortedMenu();
        name.getDuckLabel(driver,"Yellow Duck");
        Assert.assertEquals(name.getDuckLabel(driver,"Yellow Duck"), "SALE", "Something went wrong");
    }

    @Test
    public void isOpenedPageSortByPriceTrue() {
        SortedMenu price = new SortedMenu();
        price.getDuckPrice(driver,"Yellow Duck");
        Assert.assertEquals(price.getDuckPrice(driver,"Yellow Duck"), "13.14 €");
    }
}
