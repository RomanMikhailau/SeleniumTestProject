package pageobject.htmlelementsduckswebsite;

import org.openqa.selenium.WebDriver;
import pageobject.object.HomePage;

public class TermsAndConditionsPage extends HomePage {

    public InformationMenu informationMenu;

    public TermsAndConditionsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        return super.hasOpened(driver, "Terms & Conditions | My Store1");
    }
}


