package pageobject.htmlelementsduckswebsite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobject.helpers.WebDriverContainer;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverContainer.getDriver();

        driver.get("https://litecart.stqa.ru/en/");
    }

//    @AfterMethod
//    public void tearDown() {
//        WebDriverContainer.closeDriver();
//    }
}
