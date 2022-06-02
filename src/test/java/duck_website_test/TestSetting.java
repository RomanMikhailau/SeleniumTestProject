package duck_website_test;

import open_website.OpenWebsite;
import org.openqa.selenium.By;

public class TestSetting extends OpenWebsite {

    public String getDuckLabel(String duck) {
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .sticker", duck))).getText();
    }
    public String getDuckPrice (String price) {
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .campaign-price", price))).getText();

    }
    public String getDuckPriceGreenDuck (String price) {
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .price-wrapper", price))).getText();

    }
}
