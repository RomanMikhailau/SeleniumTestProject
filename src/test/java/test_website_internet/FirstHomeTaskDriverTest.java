package test_website_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FirstHomeTaskDriverTest extends TestSetting {

    @Test
    public void webDriverTestClick() {
        openWebsite();
        WebElement linkToCheckboxes = driver.findElement(By.linkText("Drag and Drop"));
        linkToCheckboxes.click();
    }

    @Test
    public void webDriverTestPrintLink() {
        openWebsite();
        List<WebElement> allLinksOnThePage = driver.findElements(By.tagName("a"));
        int a = 0;
        for (WebElement link : allLinksOnThePage) {
            a++;
            System.out.println(a + "." + link.getText());
        }
        System.out.println("\t\tOn the page - " + allLinksOnThePage.size() + " links");
        driver.quit();
    }
}
