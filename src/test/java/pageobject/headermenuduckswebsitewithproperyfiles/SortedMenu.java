package pageobject.headermenuduckswebsitewithproperyfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortedMenu {

    public String getDuckLabel(WebDriver driver, String duck) {
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .sticker", duck))).getText();
    }

    public String getDuckPrice(WebDriver driver, String duck) {
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .campaign-price", duck))).getText();

    }
}
