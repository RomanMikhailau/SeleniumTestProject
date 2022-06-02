package test_website_internet;

import open_website.OpenWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSetting extends OpenWebsite {

    public String getFindText() {
        WebElement element = driver.findElement(By.xpath("//div[@id='content']//p[@id='result']"));
        String text = element.getText();
        return text;
    }

    public WebElement alertButtonClick(String alertButton) {
        WebElement findButton = driver.findElement(By.cssSelector(String.format("[onclick = '%s']", alertButton)));
        findButton.click();
        return findButton;

    }
}