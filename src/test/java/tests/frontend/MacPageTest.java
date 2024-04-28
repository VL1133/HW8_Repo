package tests.frontend;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.DashboardPage;
import pages.frontend.MacPage;
import pages.frontend.YourStorePage;
import tests.base.BaseTest;

import javax.crypto.Mac;

public class MacPageTest extends BaseTest {

    @Test
    public void addMacToCartAndCheckoutTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMacDesktopsDropdownOption();
        MacPage.addMacToCart();
        MacPage.clickCheckoutButton();
        String actualPageNameText = MacPage.getCheckoutPageText();
        Assert.assertEquals(actualPageNameText, "Checkout");
    }

    @Test
    public void addMacToCartAndRemoveItTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMacDesktopsDropdownOption();
        MacPage.addMacToCart();
        MacPage.clickRemoveButton();
    }
}
