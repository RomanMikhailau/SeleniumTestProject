import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumAlertTest {

    WebDriver driver = new ChromeDriver();



    public void openWebsiteAndClickToAlert() {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement clickToAlert = driver.findElement(By.linkText("JavaScript Alerts"));
        clickToAlert.click();
    }

    @Test
    public void alertTest() {
        openWebsiteAndClickToAlert();
        WebElement alertButton = driver.findElement(By.cssSelector("[onclick = 'jsAlert()']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "I am a JS Alert");
        alert.accept();
        WebElement element = driver.findElement(By.xpath("//p[@id='result']"));
        String text = element.getText();
        System.out.println(text);
        Assert.assertEquals(text, "You successfully clicked an alert");
    }

    @Test
    public void alertTestConfirm() {
        openWebsiteAndClickToAlert();
        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick = 'jsConfirm()']"));
        confirmButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement element = driver.findElement(By.xpath("//p[@id='result']"));
        String text = element.getText();
        Assert.assertEquals(text, "You clicked: Cancel");
    }

    @Test
    public void alertTestPrompt() {
        openWebsiteAndClickToAlert();
        WebElement promptButton = driver.findElement(By.cssSelector("[onclick = 'jsPrompt()']"));
        promptButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello!");
        alert.accept();
        WebElement element = driver.findElement(By.xpath("//p[@id='result']"));
        String text = element.getText();
        Assert.assertEquals(text, "You entered: Hello!");
    }
}
