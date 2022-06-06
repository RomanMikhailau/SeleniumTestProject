package pageobject.headermenuduckswebsitewithproperyfiles;

import org.openqa.selenium.WebDriver;
import pageobject.object.HomePage;

public class SubCategoryPage extends HomePage {

    public SubCategoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        return super.hasOpened(driver, "Subcategory | My Store1");
    }
}

