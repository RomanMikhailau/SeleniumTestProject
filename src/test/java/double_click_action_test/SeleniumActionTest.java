package double_click_action_test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumActionTest extends TestSetting {

    @Test
    public void clickToIconActionTest() {
        openWebsiteClickIcon();
        Actions builder = new Actions(driver);
        builder.doubleClick(findIeIcon()).doubleClick(findWordIcon()).doubleClick(findPowerPointIcon()).perform();
    }
}
