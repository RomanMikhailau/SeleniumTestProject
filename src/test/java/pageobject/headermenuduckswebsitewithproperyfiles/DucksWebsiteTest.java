package pageobject.headermenuduckswebsitewithproperyfiles;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pageobject.object.HomePage.testLogin;

public class DucksWebsiteTest extends TestBase {

    @Test
    public void rubberDucksLinkTest() throws Exception {
        testLogin(driver);
        HeaderMenu rubberDucksLink = new HeaderMenu(driver);
        rubberDucksLink.rubberDucksLinkClick();
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void SubCategoryLinkTest() throws Exception {
        testLogin(driver);
        HeaderMenu subCategoryLink = new HeaderMenu(driver);
        subCategoryLink.subCategoryLinkClick();
        SubCategoryPage subCategoryPage = new SubCategoryPage(driver);
        Assert.assertTrue(subCategoryPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void deliveryInformationLinkTest() throws Exception {
        testLogin(driver);
        HeaderMenu deliveryInformationLink = new HeaderMenu(driver);
        deliveryInformationLink.deliveryInformationLinkClick();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void termsAndConditionsLinkTest() throws Exception {
        testLogin(driver);
        HeaderMenu termsAndConditionsLink = new HeaderMenu(driver);
        termsAndConditionsLink.termsAndConditionsLinkClick();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Page has not opened");

    }

    @Test
    public void isOpenedPageSortByNameTrue() {
        pageobject.duckswebsite.headermenu.SortedMenu name = new pageobject.duckswebsite.headermenu.SortedMenu();
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
