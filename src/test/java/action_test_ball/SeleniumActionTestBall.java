package action_test_ball;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumActionTestBall extends TestSetting {

    @Test
    public void ballInGoalActionTest() {
        openWebsiteTestBall();
        Actions builder = new Actions(driver);
        builder.dragAndDrop(findBall(), findGate()).perform();
    }

    @Test
    public void moveBallActionTest() {
        openWebsiteTestBall();
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(findBall(), 593, 250).perform();
    }

    @Test
    public void moveBallActionTest2() {
        openWebsiteTestBall();
        Actions builder = new Actions(driver);
        builder.clickAndHold(findBall()).moveByOffset(-100, 100).release().perform();
    }
}

