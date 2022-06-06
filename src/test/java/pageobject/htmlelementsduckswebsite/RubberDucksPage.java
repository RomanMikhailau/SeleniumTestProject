package pageobject.htmlelementsduckswebsite;

import org.openqa.selenium.WebDriver;
import pageobject.object.HomePage;

public class RubberDucksPage extends HomePage {

    public RubberDucksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        return super.hasOpened(driver, "Rubber Ducks | My Store1");
    }
}
