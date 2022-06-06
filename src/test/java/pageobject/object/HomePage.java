package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    protected By successMessage = By.cssSelector(".notice.success");

    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void testLogin(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("veronika.doroshevich@mail.ru", "8635");
    }
    public boolean successMessageIsVisible() {
       return driver.findElement(successMessage).isDisplayed();
    }

    public boolean hasOpened(){
        return super.hasOpened(driver, "Online Store | My Store1");
    }

}
