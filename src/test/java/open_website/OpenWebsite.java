package open_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OpenWebsite {
    protected ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

    public void openWebsiteTestBall() {
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
    }

    public void openWebsiteClickIcon() {
        driver.get("http://pbclibrary.org/mousing/click3.htm");
    }

    public void openWebsite() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void openWebsiteAndClickToAlert() {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement clickToAlert = driver.findElement(By.linkText("JavaScript Alerts"));
        clickToAlert.click();
    }
    public void openWebsiteDuck() {
        driver.get("https://litecart.stqa.ru/en/");
    }
    public void openSubCategoryRubberDucksLink() {
        openWebsiteDuck();
        WebElement RubberDucksLink = driver.findElement(By.xpath("//*[@id='site-menu']//*[@class='category-1']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(RubberDucksLink).moveByOffset(0, 55).click().perform();
    }
}
