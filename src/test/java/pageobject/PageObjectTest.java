package pageobject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.object.HomePage;
import pageobject.object.LoginPage;

public class PageObjectTest extends TestBase{

    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("Danik11092013@gmail.com", "Test123!");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login is not successful");
    }

    @Test
    public void unSuccessfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.attemptLogin("Danik11092013@gmail.com", "Test123");

        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Login is not found");
    }

    @Test
    public void homePageLoadedTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.attemptLogin("Danik11092013@gmail.com", "Test123!");
        Assert.assertTrue(homePage.hasOpened(), "Page has not opened");
    }

}
