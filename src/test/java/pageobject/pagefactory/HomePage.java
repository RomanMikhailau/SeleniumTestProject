package pageobject.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    @FindBy(css = ".notice.success")
    private WebElement successMessage;


    public boolean successMessageIsVisible() {
        return successMessage.isDisplayed();
    }

    public boolean hasOpened(WebDriver driver){
        return super.hasOpened(driver, "Online Store | My Store1");
    }
}
