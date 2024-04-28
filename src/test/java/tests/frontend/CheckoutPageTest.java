package tests.frontend;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pages.frontend.CheckoutPage;
import pages.frontend.MacPage;
import pages.frontend.MonitorsPage;
import pages.frontend.YourStorePage;
import tests.base.BaseTest;
import utils.Browser;

import javax.swing.*;
import java.nio.charset.CharacterCodingException;

public class CheckoutPageTest extends BaseTest {

    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    @Test
    public void completeAMacOrderTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMacDesktopsDropdownOption();
        MacPage.addMacToCart();
        MacPage.clickCheckoutButton();
        CheckoutPage.completeAnOrder("Pesho", "Peshov", driver, "Rozova Dolina 5", "Sofia", "1000", "33", "498");
    }

    @Test
    public void completeASamsungMonitorOrderTest(){
        YourStorePage.goToLoginPage();
        YourStorePage.selectMonitorsComponentsDropdownOption();
        MonitorsPage.addSamsungMonitorToCart();
        MonitorsPage.clickCheckoutButton();
        CheckoutPage.completeAnOrder("Stoyan", "Stoyanov", driver, "Tsar Simeon 130", "Vidin", "3700", "33", "503");
    }

}
