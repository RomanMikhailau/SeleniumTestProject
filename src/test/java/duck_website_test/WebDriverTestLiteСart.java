package duck_website_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverTestLiteСart extends TestSetting{

    @Test
    public void testYellowDuckLabel() {
        openSubCategoryRubberDucksLink();
        getDuckLabel("Yellow Duck");
        Assert.assertEquals(getDuckLabel("Yellow Duck"), "SALE", "Went wrong");
    }

    @Test
    public void testGreenDuckLabel() {
        openSubCategoryRubberDucksLink();
        getDuckLabel("Green DucK");
        Assert.assertEquals(getDuckLabel("Green DucK"), "NEW", "Went wrong");
    }
}
