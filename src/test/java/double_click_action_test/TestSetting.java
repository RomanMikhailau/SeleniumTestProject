package double_click_action_test;

import open_website.OpenWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSetting extends OpenWebsite {

    protected WebElement findIeIcon() {
        WebElement ieIcon = driver.findElement(By.name("icon1"));
        return ieIcon;
    }

    protected WebElement findWordIcon() {
        WebElement wordIcon = driver.findElement(By.name("icon2"));
        return wordIcon;
    }

    protected WebElement findPowerPointIcon() {
        WebElement powerPointIcon = driver.findElement(By.name("icon3"));
        return powerPointIcon;
    }
}
