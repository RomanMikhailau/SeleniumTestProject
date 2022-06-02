package duck_website_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkClickAndSwitchTest extends TestSetting {

    @Test
    public void openRubberDucks() {
        openWebsiteDuck();
        WebElement RubberDucksLink = driver.findElement(By.xpath("//*[@id='site-menu']//*[@class='category-1']"));
        RubberDucksLink.click();
        String rubberDucksLinkTitle = driver.getTitle();
        Assert.assertEquals(rubberDucksLinkTitle, "Rubber Ducks | My Store1");
    }

    @Test
    public void openDeliveryInformation() {
        openWebsiteDuck();
        WebElement deliveryInformation = driver.findElement(By.cssSelector(".page-2"));
        deliveryInformation.click();
        WebElement information = driver.findElement(By.xpath("//*[@class='content'][h1]"));
        information.isDisplayed();
    }

    @Test
    public void openTermsConditions() {
        openWebsiteDuck();
        WebElement termsCondition = driver.findElement(By.cssSelector(".page-4"));
        termsCondition.click();
        WebElement information = driver.findElement(By.xpath("//*[@class='content'][h1]"));
        information.isDisplayed();
    }

    @Test
    public void testClickIconNameAndSort() {
        openSubCategoryRubberDucksLink();
        WebElement sortName = driver.findElement(By.xpath("//*[text()='Name']"));
        sortName.click();
        WebElement sortPrice = driver.findElement(By.xpath("//*[text()='Price']"));
        sortPrice.click();

    }

}
