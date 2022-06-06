package pageobject.htmlelementsduckswebsite;

import org.openqa.selenium.WebDriver;

public class PageBase {

    public boolean hasOpened(WebDriver driver, String title) {
        return driver.getTitle().equals(title);
    }
}
