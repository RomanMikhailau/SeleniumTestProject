package pageobject;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.pagefactory.HomePage;
import pageobject.pagefactory.LoginPage;

public class PageFactoryTest extends TestBase{

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.attemptLogin("Danik11092013@gmail.com", "Test123!");

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login is not successful");

    }

    @Test
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.attemptLogin("Danik11092013@gmail.com", "Test1234");

        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Login is not found");
    }

    @Test
    public void homePageLoadedTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        loginPage.attemptLogin("Danik11092013@gmail.com", "Test123!");
        Assert.assertTrue(homePage.hasOpened(driver), "Page has not opened");
    }
}
