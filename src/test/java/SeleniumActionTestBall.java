import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumActionTestBall {

    WebDriver driver = new ChromeDriver();

    public void openWebsite() {
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
    }

    @Test
    public void actionTestBallInGoal() {
        openWebsite();
        WebElement ball = driver.findElement(By.id("ball"));
        WebElement goal = driver.findElement(By.id("gate"));

        Actions builder = new Actions(driver);

        builder.dragAndDrop(ball, goal).perform();
    }

    @Test
    public void actionTestMoveBall() {
        openWebsite();
        WebElement ball = driver.findElement(By.id("ball"));

        Actions builder = new Actions(driver);

        builder.dragAndDropBy(ball, 593, 250).perform();
    }

    @Test
    public void actionTestMoveBall2() {
        openWebsite();
        WebElement ball = driver.findElement(By.id("ball"));

        Actions builder = new Actions(driver);

        builder.clickAndHold(ball).moveByOffset(-100, 100).release().perform();
    }
}
