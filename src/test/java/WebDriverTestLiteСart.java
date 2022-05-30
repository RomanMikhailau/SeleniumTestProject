import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverTestLiteСart {
    WebDriver driver = new ChromeDriver();

    public void openWebsite() {
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void openRubberDucks() {
        openWebsite();
        WebElement RubberDucksLink = driver.findElement(By.xpath("//*[@id='site-menu']//*[@class='category-1']"));
        RubberDucksLink.click();
        String rubberDucksLinkTitle = driver.getTitle();
        Assert.assertEquals(rubberDucksLinkTitle, "Rubber Ducks | My Store1");
    }

    @Test
    public void openDeliveryInformation() {
        openWebsite();
        WebElement deliveryInformation = driver.findElement(By.cssSelector(".page-2"));
        deliveryInformation.click();
        WebElement information = driver.findElement(By.xpath("//*[@class='content'][h1]"));
        information.isDisplayed();
    }

    @Test
    public void openTermsConditions() {
        openWebsite();
        WebElement termsCondition = driver.findElement(By.cssSelector(".page-4"));
        termsCondition.click();
        WebElement information = driver.findElement(By.xpath("//*[@class='content'][h1]"));
        information.isDisplayed();
    }

}
