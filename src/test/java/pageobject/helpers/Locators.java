package pageobject.helpers;

import org.openqa.selenium.By;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Locators {
    private static Properties locators;

    static {
        locators = new Properties();

        InputStream is = Locators.class.getResourceAsStream("/locators.properties");

        try {
            locators.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Could not read from locators.properties file\n" + e.getMessage());
        }
    }

    public static By getLocator(String element) throws Exception {
        String locator = locators.getProperty(element);
        String[] subStrings = locator.split("=", 2);


        LocatorTypes locatorType = LocatorTypes.valueOf(subStrings[0]);
        String selector = subStrings[1];


        switch (locatorType) {
            case id: return By.id(selector);
            case name: return By.name(selector);
            case className: return By.className(selector);
            case tagName: return By.tagName(selector);
            case linkText: return By.linkText(selector);
            case partialLinkText: return By.partialLinkText(selector);
            case css : return By.cssSelector(selector);
            case xpath: return By.xpath(selector);
            default: throw new Exception("no such location type");
        }
    }
}




