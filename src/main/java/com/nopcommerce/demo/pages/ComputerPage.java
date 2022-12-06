package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By computerPage = By.xpath("//a[@href='/computers']");
    By desktopMenu = By.xpath("//h2[@class='title']//a");
    By selectByValue = By.xpath("//select[@name='products-orderby']");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By verifyBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD = By.xpath("//label[text()='400 GB [+$100.00]']");
    By selectOS = By.xpath("//label[text()='Vista Premium [+$60.00]']");
    By selectSoftware = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyTotal = By.xpath("//span[@id='price-value-1']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyCartMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHover = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By verifyShoppingCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");////a[@class='ico-cart']

    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");
    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    By clearText = By.xpath("//input[@value='1']");
    By sendTextToQuantity = By.xpath("//input[@value='1']");
    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    By verifyTotal1 = By.xpath("//tbody/tr[1]/td[6]/span[1]");

    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    By VerifyTextWelcome, PleaseSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");
    By sendTextToLastName = By.id("BillingNewAddress_LastName");
    By sendTextToEmail = By.id("BillingNewAddress_Email");
    By sendTextToCompany = By.id("BillingNewAddress_Company");
    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");
    By sendTextToAddress1 = (By.cssSelector("#BillingNewAddress_Address1"));
    By sendTextToAddress2 = (By.cssSelector("#BillingNewAddress_Address2"));
    By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By continueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By clickOnMasterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By cardCode = By.id("CardCode");
    By continueButton2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyText1 = By.xpath("//li[@class='payment-method']/span[2]");
    By verifyText2 = By.xpath("//li[@class='shipping-method']//span[2]");
    By verifyText3 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");
    By confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By verifyText4 = By.xpath("//div[@class='page-title']/h1");
    By verifyText5 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton3 = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button");
    By verifyText6 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void clickOnComputer() {
        clickOnElement(computerPage);
    }

    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }

    public void getSelectByValue(String value) {
        selectByValueFromDropDown(selectByValue, value);
    }

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    public String getVerifyBuildYourOwn() {
        return getTextFromElement(verifyBuildYourOwn);
    }

    public void selectProcessorByValue(String value) {
        selectByValueFromDropDown(selectProcessor, value);
    }

    public void selectRamByValue(String value) {
        selectByValueFromDropDown(selectRam, value);
    }
    public void clickOnHDD400GB() {
        clickOnElement(selectHDD);
    }
    public void clickOnOsVistaPremium() {
        clickOnElement(selectOS);
    }
    public void clickOnSoftwareTotalCommander() {
        clickOnElement(selectOS);
    }
    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotal);
    }
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMsg);
    }
    public void closeMessageBar() {
        clickOnElement(closeMsg);
    }
    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }
    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }
    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }
    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }
    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }
    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }
    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }
    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }
    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }
    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }
    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }
    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }
    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }
    public void selectMasterCardFromCreditCardDropdown(String value) {
        selectByValueFromDropDown(clickOnMasterCard,value);
    }
    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }
    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }
    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }
    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }
    public String getVerifyText2() {
        return getTextFromElement(verifyText2);

    }
    public String getVerifyText3() {
        return getTextFromElement(verifyText3);
    }
    public void clickOnConformButton() {
        clickOnElement(confirm);
    }
    public String getVerifyText4() {
        return getTextFromElement(verifyText4);
    }
    public String getVerifyText5() {
        return getTextFromElement(verifyText5);
    }
    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public String getVerifyText6() {
        return getTextFromElement(verifyText6);

    }


}





























































































