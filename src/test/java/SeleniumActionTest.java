import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumActionTest {
    WebDriver driver = new ChromeDriver();

    public void openWebsite() {
        driver.get("http://pbclibrary.org/mousing/click3.htm");
    }

    @Test
    public void clickToIconActionTest() {
        openWebsite();
        WebElement ieIcon = driver.findElement(By.name("icon1"));
        WebElement wordIcon = driver.findElement(By.name("icon2"));
        WebElement powerPointIcon = driver.findElement(By.name("icon3"));

        Actions builder = new Actions(driver);

        builder.doubleClick(ieIcon).doubleClick(wordIcon).doubleClick(powerPointIcon).perform();

    }
}
