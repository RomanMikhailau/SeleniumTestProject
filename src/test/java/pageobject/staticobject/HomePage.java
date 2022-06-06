package pageobject.staticobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    private static By successMessage = By.cssSelector(".notice.success");

    public static boolean successMessageIsVisible(WebDriver driver) {
       return driver.findElement(successMessage).isDisplayed();
    }
    public static boolean hasOpened(WebDriver driver) {
        return hasOpened(driver, "Online Store | My Store1");
    }
}
