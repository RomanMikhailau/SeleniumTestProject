package pageobject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.staticobject.HomePage;
import pageobject.staticobject.LoginPage;

public class StaticPageObjectTest extends TestBase{

    @Test
    public void successfulLoginTest() {
        LoginPage.attemptLogin(driver, "Danik11092013@gmail.com", "Test123!");

        Assert.assertTrue(HomePage.successMessageIsVisible(driver), "Login is not successful");
    }

    @Test
    public void unsuccessfulLoginTest() {
        LoginPage.attemptLogin(driver,"Danik11092013@gmail.com", "Test123");

        Assert.assertTrue(LoginPage.loginErrorMessageIsVisible(driver), "Login is not found");
    }

    @Test
    public void homePageLoadedTest() {
        LoginPage.attemptLogin(driver,"Danik11092013@gmail.com", "Test123!");
        Assert.assertTrue(HomePage.hasOpened(driver), "Page has not opened");
    }
}
