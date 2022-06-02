package test_website_internet;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumAlertTest extends TestSetting {

    @Test
    public void alertTest() {
        openWebsiteAndClickToAlert();
        alertButtonClick("jsAlert()");
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "I am a JS Alert");
        alert.accept();
        Assert.assertEquals(getFindText(), "You successfully clicked an alert");
    }

    @Test
    public void alertTestConfirm() {
        openWebsiteAndClickToAlert();
        alertButtonClick("jsConfirm()");
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Assert.assertEquals(getFindText(), "You clicked: Cancel");
    }

    @Test
    public void alertTestPrompt() {
        openWebsiteAndClickToAlert();
        alertButtonClick("jsPrompt()");
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello!");
        alert.accept();
        Assert.assertEquals(getFindText(), "You entered: Hello!");
    }
}
