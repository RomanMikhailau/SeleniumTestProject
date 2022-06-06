package pageobject.headermenuduckswebsitewithproperyfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static pageobject.helpers.Locators.getLocator;

public class HeaderMenu {
    private WebDriver driver;

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void rubberDucksLinkClick() throws Exception {
        driver.findElement(getLocator("HeaderMenu.rubberDucksLink")).click();
    }

    public void subCategoryLinkClick() throws Exception {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(getLocator("HeaderMenu.rubberDucksLink")));
        builder.moveByOffset(0,55).click().perform();

    }

    public void deliveryInformationLinkClick() throws Exception {
        driver.findElement(getLocator("HeaderMenu.deliveryInformationLink")).click();
    }

    public void termsAndConditionsLinkClick() throws Exception {
        driver.findElement(getLocator("HeaderMenu.termsAndConditionsLink")).click();
    }

}
