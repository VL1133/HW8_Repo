package tests.frontend;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.frontend.MacPage;
import pages.frontend.YourStorePage;
import tests.base.BaseTest;

public class YourStorePageTest extends BaseTest {

    @Test
    public void selectMacDesktopsDropdownOptionTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMacDesktopsDropdownOption();
        String actualPageNameText = YourStorePage.getMacPageText();
        Assert.assertEquals(actualPageNameText, "Mac");
    }

    @Test
    public void selectMonitorsComponentsDropdownOptionTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMonitorsComponentsDropdownOption();
        String actualPageNameText = YourStorePage.getMonitorsPageText();
        Assert.assertEquals(actualPageNameText, "Monitors");
    }
}
