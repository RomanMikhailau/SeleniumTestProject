package pageobject.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HomePage{

    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(name = "login")
    private WebElement loginButton;
    @FindBy(css = ".notice.errors")
    private WebElement errorMessage;

    public  void setEmail(String email) {
        emailInput.sendKeys(email);
    }

    public  void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public  void clickLoginButton() {
        loginButton.click();
    }

    public  void attemptLogin(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public boolean loginErrorMessageIsVisible() {
        return errorMessage.isDisplayed();
    }

    public boolean hasOpened(WebDriver driver){
        return super.hasOpened(driver, "Online Store | My Store1");
    }

}
