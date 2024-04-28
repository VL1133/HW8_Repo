package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import pages.base.BasePage;
import utils.WaitTool;

public class MonitorsPage extends BasePage {

        private static final By ADD_TO_CART_BUTTON = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]/span");

        private static final By CART_TOTAL_BUTTON = By.id("cart-total");

        private static final By CHECKOUT_BUTTON = By.cssSelector("#cart .fa.fa-share");

        private static final By CHECKOUT_PAGE_TEXT = By.xpath("//*[@id=\"checkout-checkout\"]/ul/li[3]/a");

        private static final By REMOVE_BUTTON = By.xpath("//*[@id=\"cart\"]//td[5]/button");

        public static void addSamsungMonitorToCart() {
            clickAddToCartButton();
            clickCartTotalButton();
        }

        public static void clickAddToCartButton() {
            WaitTool.waitForElementToBeClickable(ADD_TO_CART_BUTTON, 10);
            clickOnWebElementByLocator(ADD_TO_CART_BUTTON);
        }

        public static void clickCartTotalButton() {
            WaitTool.waitForElementToBeClickable(CART_TOTAL_BUTTON, 10);
            clickOnWebElementByLocator(CART_TOTAL_BUTTON);
        }

        public static void clickCheckoutButton() {
            WaitTool.waitForElementToBeClickable(CHECKOUT_BUTTON, 10);
            clickOnWebElementByLocator(CHECKOUT_BUTTON);
        }

        public static void clickRemoveButton() {
            WaitTool.waitForElementToBeClickable(REMOVE_BUTTON, 10);
            clickOnWebElementByLocator(REMOVE_BUTTON);
        }

        public static String getCheckoutPageText() {
            WaitTool.waitForElementVisibility(CHECKOUT_PAGE_TEXT, 10);
            return driver.findElement(CHECKOUT_PAGE_TEXT).getText();
        }

    }