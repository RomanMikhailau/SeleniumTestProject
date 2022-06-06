package pageobject.staticobject;

import org.openqa.selenium.WebDriver;

public class PageBase  {

    public static boolean hasOpened(WebDriver driver, String title) {
        return driver.getTitle().equals(title);
    }
}
