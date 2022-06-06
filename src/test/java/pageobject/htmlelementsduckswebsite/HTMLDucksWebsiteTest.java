package pageobject.htmlelementsduckswebsite;

import org.testng.Assert;
import org.testng.annotations.Test;


import static pageobject.helpers.WebDriverContainer.getDriver;
import static pageobject.htmlelementsduckswebsite.HomePage.testLogin;


public class HTMLDucksWebsiteTest extends TestBase {

    LoginPage loginPage = new LoginPage(getDriver());
    TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(getDriver());

    @Test
    public void rubberDucksLinkTest() {

        loginPage.headerMenu.deliveryInformationButtonClick();

        loginPage.headerMenu.rubberDucksButtonClick();

        loginPage.headerMenu.subCategoryMenuItemClick();

        loginPage.headerMenu.deliveryInformationButtonClick();

        loginPage.headerMenu.termsAndConditionsButtonClick();
    }

    @Test
    public void SubCategoryLinkTest() {
        testLogin(driver);
        loginPage.headerMenu.subCategoryMenuItemClick();
        SubCategoryPage subCategoryPage = new SubCategoryPage(driver);
        Assert.assertTrue(subCategoryPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void deliveryInformationLinkTest() {
        testLogin(driver);
        loginPage.headerMenu.deliveryInformationButtonClick();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Page has not opened");
    }

    @Test
    public void termsAndConditionsLinkTest() {
        testLogin(driver);
        loginPage.headerMenu.termsAndConditionsButtonClick();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Page has not opened");

    }

    @Test
    public void isOpenedPageSortByNameTrue() {
        loginPage.headerMenu.subCategoryMenuItemClick();
        SortedMenu name = new SortedMenu();
        name.getDuckLabel(driver, "Yellow Duck");
        Assert.assertEquals(name.getDuckLabel(driver, "Yellow Duck"), "SALE", "Something went wrong");
    }

    @Test
    public void isOpenedPageSortByPriceTrue() {
        loginPage.headerMenu.subCategoryMenuItemClick();
        SortedMenu price = new SortedMenu();
        price.getDuckPrice(driver, "Yellow Duck");
        Assert.assertEquals(price.getDuckPrice(driver, "Yellow Duck"), "13.14 €");
    }
    @Test
    public void test1() {
        deliveryInformationLinkTest();
        termsAndConditionsPage.informationMenu.aboutUsButton();

    }
}
