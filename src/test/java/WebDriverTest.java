import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebDriverTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void webDriverTestClick() {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement linkToCheckboxes = driver.findElement(By.linkText("Drag and Drop"));
        linkToCheckboxes.click();
    }

    @Test
    public void webDriverTestPrintLink() {
        driver.get("https://the-internet.herokuapp.com/");
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
