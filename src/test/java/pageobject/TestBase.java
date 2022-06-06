package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobject.helpers.WebDriverContainer;


public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverContainer.getDriver();

        driver.manage().window().maximize();

        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
