package pages.frontend;

import org.openqa.selenium.By;
import pages.base.BasePage;
import utils.WaitTool;

public class YourStorePage extends BasePage {
    private static final By DESKTOPS_MENU = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");

    private static final By MAC_DESKTOPS_MENU_OPTION = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a");

    private static final By COMPONENTS_MENU = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a");

    private static final By MONITORS_COMPONENTS_MENU_OPTION = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a");

    private static final By MAC_PAGE_TEXT = By.xpath("//*[@id=\"product-category\"]/ul/li[3]/a");

    private static final By MONITORS_PAGE_TEXT = By.xpath("//*[@id=\"product-category\"]/ul/li[3]/a");

    private static final String YOUR_STORE_PAGE_URL = "https://shop.pragmatic.bg/";

    public static void goToLoginPage() {
        driver.get(YOUR_STORE_PAGE_URL);
    }

    public static void selectMacDesktopsDropdownOption() {
        clickDesktopsMenu();
        clickMacDesktopsMenuOption();
    }

    public static void selectMonitorsComponentsDropdownOption() {
        clickComponentsMenu();
        clickMonitorsComponentsMenuOption();
    }

    public static void clickDesktopsMenu() {
        clickOnWebElementByLocator(DESKTOPS_MENU);
    }

    public static void clickMacDesktopsMenuOption() {
        clickOnWebElementByLocator(MAC_DESKTOPS_MENU_OPTION);
    }

    public static void clickComponentsMenu() {
        clickOnWebElementByLocator(COMPONENTS_MENU);
    }

    public static void clickMonitorsComponentsMenuOption() {
        clickOnWebElementByLocator(MONITORS_COMPONENTS_MENU_OPTION);
    }

    public static String getMacPageText() {
        WaitTool.waitForElementVisibility(MAC_PAGE_TEXT, 10);
        return driver.findElement(MAC_PAGE_TEXT).getText();
    }

    public static String getMonitorsPageText() {
        WaitTool.waitForElementVisibility(MONITORS_PAGE_TEXT, 10);
        return driver.findElement(MONITORS_PAGE_TEXT).getText();
    }

}
