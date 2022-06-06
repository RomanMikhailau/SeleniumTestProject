package pageobject.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.Browsers;

public class WebDriverContainer {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));

            switch (browser) {
                case chrome:
                    driver = new ChromeDriver();
                    break;
            }
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver != null) {
            driver.quit();
        }
    }
}
