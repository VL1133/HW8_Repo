package tests.frontend;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.base.BasePage;
import pages.frontend.MacPage;
import pages.frontend.MonitorsPage;
import pages.frontend.YourStorePage;
import tests.base.BaseTest;

public class MonitorsPageTest extends BaseTest {
    @Test
    public void addSamsungMonitorToCartAndCheckoutTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMonitorsComponentsDropdownOption();
        MonitorsPage.addSamsungMonitorToCart();
        MonitorsPage.clickCheckoutButton();
        String actualPageNameText = MonitorsPage.getCheckoutPageText();
        Assert.assertEquals(actualPageNameText, "Checkout");
    }

    @Test
    public void addSamsungMonitorToCartAndRemoveItTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMonitorsComponentsDropdownOption();
        MonitorsPage.addSamsungMonitorToCart();
        MonitorsPage.clickRemoveButton();
    }
}
