package pageobject.headermenuduckswebsitewithproperyfiles;

import org.openqa.selenium.WebDriver;
import pageobject.object.HomePage;

public class DeliveryInformationPage extends HomePage {

    public DeliveryInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        return super.hasOpened(driver, "Delivery Information | My Store1");
    }
}

