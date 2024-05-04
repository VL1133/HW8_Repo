package pages.frontend;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.base.BasePage;
import utils.WaitTool;

import java.sql.Driver;

public class CheckoutPage extends BasePage {

    private static final By GUEST_CHECKOUT_RADIO_BUTTON = By.cssSelector("[value='guest']");

    private static final By CONTINUE_BUTTON_ACCOUNT = By.id("button-account");

    private static final By FIRST_NAME_INPUT_FIELD = By.id("input-payment-firstname");

    private static final By LAST_NAME_INPUT_FIELD = By.id("input-payment-lastname");

    private static final By EMAIL_INPUT_FIELD = By.id("input-payment-email");

    private static final By TELEPHONE_INPUT_FIELD = By.id("input-payment-telephone");

    private static final By ADDRESS_INPUT_FIELD = By.id("input-payment-address-1");

    private static final By CITY_INPUT_FIELD = By.id("input-payment-city");

    private static final By POST_CODE_INPUT_FIELD = By.id("input-payment-postcode");

    private static final By COUNTRY_SELECT = By.id("input-payment-country");

    private static final By REGION_SELECT = By.id("input-payment-zone");
    private static final By CONTINUE_BUTTON_GUEST = By.id("button-guest");
    private static final By CONTINUE_BUTTON_SHIPPING_METHOD = By.id("button-shipping-method");
    private static final By AGREE_CHECKBOX = By.xpath("//*[@id=\"collapse-payment-method\"]//input[contains(@name,'agree')]");
    private static final By CONTINUE_BUTTON_PAYMENT_METHOD = By.id("button-payment-method");
    private static final By CONFIRM_BUTTON = By.id("button-confirm");

    private static final By YAMBOL_REGION_DROPDOWN_OPTION = By.cssSelector("option[value='505']");

    public static void clickGuestCheckoutRadioButton() {
        WaitTool.waitForElementVisibility(GUEST_CHECKOUT_RADIO_BUTTON, 10);
        clickOnWebElementByLocator(GUEST_CHECKOUT_RADIO_BUTTON);
    }

    public static void clickContinueButtonAccount() {
        clickOnWebElementByLocator(CONTINUE_BUTTON_ACCOUNT);
    }

    public static void completeAnOrder(String firstName, String lastName, WebDriver driver, String address, String city, String postcode, String countryValue, String regionValue) {
        CheckoutPage.clickGuestCheckoutRadioButton();
        CheckoutPage.clickContinueButtonAccount();
        CheckoutPage.writeInFirstNameInputField(firstName);
        CheckoutPage.writeInLastNameInputField(lastName);
        CheckoutPage.writeInEmailInputField(driver);
        CheckoutPage.writeInTelephoneInputField(driver);
        CheckoutPage.writeInAddressInputField(address);
        CheckoutPage.writeInCityInputField(city);
        CheckoutPage.writeInPostcodeInputField(postcode);
        CheckoutPage.selectCountryOptionByValue(countryValue);
        CheckoutPage.selectRegionOptionByValue(regionValue);
        CheckoutPage.clickContinueButtonGuest();
        CheckoutPage.clickContinueButtonShippingMethod();
        CheckoutPage.selectAgreeCheckbox();
        CheckoutPage.clickContinueButtonPaymentMethod();
        CheckoutPage.clickConfirmButton();
    }

    public static void writeInFirstNameInputField(String firstName) {
        WaitTool.waitForElementVisibility(FIRST_NAME_INPUT_FIELD, 10);
        writeTextInWebElement(FIRST_NAME_INPUT_FIELD, firstName);
    }

    public static void writeInLastNameInputField(String lastName) {
        writeTextInWebElement(LAST_NAME_INPUT_FIELD, lastName);
    }

    public static String writeInEmailInputField(WebDriver driver) {
        String emailPrefix = RandomStringUtils.randomAlphabetic(7);
        String emailSuffix = RandomStringUtils.randomAlphabetic(5);
        String emailAddress = emailPrefix + "@" + emailSuffix + ".com";
        writeTextInWebElement(EMAIL_INPUT_FIELD, emailAddress);
        return emailAddress;
    }

    public static void writeInTelephoneInputField(WebDriver driver) {
        String randomTelephone = RandomStringUtils.randomNumeric(10);
        writeTextInWebElement(TELEPHONE_INPUT_FIELD, randomTelephone);
    }

    public static void writeInAddressInputField(String address) {
        writeTextInWebElement(ADDRESS_INPUT_FIELD, address);
    }

    public static void writeInCityInputField(String city) {
        writeTextInWebElement(CITY_INPUT_FIELD, city);
    }

    public static void writeInPostcodeInputField(String postcode) {
        writeTextInWebElement(POST_CODE_INPUT_FIELD, postcode);
    }


    public static void selectCountryOptionByValue(String value) {
        Select countryDropdown = new Select(driver.findElement(COUNTRY_SELECT));
        countryDropdown.selectByValue(value);
    }

    public static void selectRegionOptionByValue(String value) {
        WaitTool.waitForElementVisibility(YAMBOL_REGION_DROPDOWN_OPTION, 10);
        Select regionDropdown = new Select(driver.findElement(REGION_SELECT));
        regionDropdown.selectByValue(value);
    }

    public static void clickContinueButtonGuest() {
        clickOnWebElementByLocator(CONTINUE_BUTTON_GUEST);
    }

    public static void clickContinueButtonShippingMethod(){
        WaitTool.waitForElementToBeClickable(CONTINUE_BUTTON_SHIPPING_METHOD, 10);
        clickOnWebElementByLocator(CONTINUE_BUTTON_SHIPPING_METHOD);
    }

    public static void selectAgreeCheckbox(){
        WaitTool.waitForElementToBeClickable(AGREE_CHECKBOX, 10);
        clickOnWebElementByLocator(AGREE_CHECKBOX);
    }

    public static void clickContinueButtonPaymentMethod() {
        clickOnWebElementByLocator(CONTINUE_BUTTON_PAYMENT_METHOD);
    }

    public static void clickConfirmButton() {
        WaitTool.waitForElementToBeClickable(CONFIRM_BUTTON, 10);
        clickOnWebElementByLocator(CONFIRM_BUTTON);
    }

}
