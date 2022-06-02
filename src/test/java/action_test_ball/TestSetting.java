package action_test_ball;

import open_website.OpenWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSetting extends OpenWebsite{

    public WebElement findBall(){
        WebElement ball = driver.findElement(By.id("ball"));
        return ball;
    }
    public WebElement findGate(){
        WebElement goal = driver.findElement(By.id("gate"));
        return goal;
    }
}