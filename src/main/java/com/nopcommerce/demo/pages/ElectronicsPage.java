package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By mouseHoverOnElectronicsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By mouseHoverOnCellPhonesAndClick = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By verifyTextCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By mouseHoverOnElectronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By mouseHoverOnCellPhones1 = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By verifyTextCellphones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By clickOnListViewTab = By.xpath("//a[contains(text(),'List')]");
    By clickOnProductNameNokia = By.xpath("//img[@alt ='Picture of Nokia Lumia 1020']");
    By verifyTextNokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verifyNokiaPrice = By.xpath("//span[@id='price-value-20']");
    By clearQuantity = By.id("product_enteredQuantity_20");
    By changeQuantity = By.id("product_enteredQuantity_20");
    By updateCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyGreenBarMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By clickOnGreenBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal = By.xpath("//tbody/tr[1]/td[6]");
    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    By verifyTextWelcomePlease = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");
    By verifyTextRegister = By.xpath("//h1[contains(text(),'Register')]");
    By sendTextToFirstNameField = By.id("FirstName");
    By sendTextToLastNameField = By.id("LastName");
    By sendTextToDay = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    By sendTextToMonth = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    By sendTextToYear = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    By sendTextToEmailField = By.id("Email");
    By sendTextToPasswordField = By.xpath("//input[@id='Password']");
    By sendTextToConfirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By clickOnRegister1 = By.id("register-button");
    By verifyMessageYourRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
    By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
    By verifyTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By clickOnCheckbox1 = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout1 = By.xpath("//button[@id='checkout']");
    By selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By sendTextToCity = By.id("BillingNewAddress_City");
    By sendTextToAddress = By.id("BillingNewAddress_Address1");
    By sendTextToPostelCode = By.id("BillingNewAddress_ZipPostalCode");
    By sendTextToPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By clickOnContinue1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By clickOn2ndDayAir = By.id("shippingoption_2");
    By clickOnContinue2 = By.xpath("(//button[text()='Continue'])[3]");
    By clickOnCreditCard = By.id("paymentmethod_1");
    By clickOnContinue5 = By.xpath("//div[@id='payment-method-buttons-container']//button[1]");
    By clickOnSelectCreditCard = By.xpath("//input[@value='Payments.Manual']");
    By clickOnVisa = By.xpath("//option[contains(text(),'Visa')]");
    By sendTextToCardholderName = By.name("CardholderName");
    By sendTextToCardNumber = By.xpath("//input[@id='CardNumber']");
    By sendTextToExpirationMonth = By.xpath("//select[@id='ExpireMonth']");
    By sendTextToExpirationYear = By.xpath("//select[@id='ExpireYear']");
    By sendTextToCardCode = By.id("CardCode");
    By clickOnContinue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShoppingMethod = By.xpath("//span[text()[normalize-space()='2nd Day Air']]");
    By verifyTotalPrice = By.xpath("(//strong[text()='$698.00'])[2]");
    By clickOnConfirm = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifySuccessfully = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnContinue4 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By verifyWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By clickOnLogout = By.xpath("//a[contains(text(),'Log out')]");


    public void mouseHoverOnElectronics(String userName) {
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }
    public void mouseHoverOnCellPhonesAndClick() {
        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }
    public String verifyTextCellPhones() {
        return getTextFromElement(verifyTextCellPhones);
    }
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(mouseHoverOnElectronics);
    }
    public void mouseHoverOnCellPhones1() {
        mouseHoverToElementAndClick(mouseHoverOnCellPhones1);
    }
    public String verifyTextCellphones() {
        return getTextFromElement(verifyTextCellphones);
    }
    public void clickOnListViewTab() {
        clickOnElement(clickOnListViewTab);
    }
    public void clickOnProductNameNokia() {
        clickOnElement(clickOnProductNameNokia);
    }
    public String verifyTextNokiaLumia() {

        return getTextFromElement(verifyTextNokiaLumia);
    }
    public String verifyNokiaPrice() {
        return getTextFromElement(verifyNokiaPrice);
    }
    public void clearQuantityToBlank() {
        clickOnElement(clearQuantity);
    }
    public void clearQuantity() {
        driver.findElement(By.id("product_enteredQuantity_20")).clear();
    }
    public void changeQuantityTo2(String text) {
        sendTextToElement(changeQuantity, text);
    }
    public void clickOnAddToCart() {
        clickOnElement(updateCart);
    }
    public String verifyGreenBarMessage() {
        return getTextFromElement(verifyGreenBarMessage);
    }
    public void clickOnGreenBar() {
        clickOnElement(clickOnGreenBar);
    }
    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }
    public void hoverAndClickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }
    public String verifyMessageShoppingCart() {
        return getTextFromElement(verifyMessageShoppingCart);
    }
    public String verifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }
    public String verifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    public void clickOnCheckbox() {
        clickOnElement(clickOnCheckbox);
    }
    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }
    public String verifyTextWelcomePlease() {
        return getTextFromElement(verifyTextWelcomePlease);
    }
    public void clickOnRegister() {
        clickOnElement(clickOnRegister);
    }
    public String verifyTextRegister() {
        return getTextFromElement(verifyTextRegister);
    }
    public void sendTextToFirstNameField(String firstname) {
        sendTextToElement(sendTextToFirstNameField, firstname);
    }
    public void sendTextToLastNameField(String lastname) {
        sendTextToElement(sendTextToLastNameField, lastname);
    }
    public void sendTextToDay(String day) {
        sendTextToElement(sendTextToDay, day);
    }
    public void sendTextToMonth(String month) {
        sendTextToElement(sendTextToMonth, month);
    }
    public void sendTextToYear(String year) {
        sendTextToElement(sendTextToYear, year);
    }
    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmailField, email);
    }
    public void sendTextToPasswordField(String password) {
        sendTextToElement(sendTextToPasswordField, password);
    }
    public void sendTextToConfirmPasswordField(String confirmPassword) {
        sendTextToElement(sendTextToConfirmPasswordField, confirmPassword);
    }
    public void clickOnRegister1() {
        clickOnElement(clickOnRegister1);
    }
    public String verifyMessageYourRegistrationCompleted() {
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }
    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
    }
    public String verifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }
    public void clickOnCheckbox1() {
        clickOnElement(clickOnCheckbox1);
    }
    public void clickOnCheckout1() {
        clickOnElement(clickOnCheckout1);
    }
    public void countryByVisibleText(String name) {
        selectByVisibleTextFromDropDown(selectCountry, name);
    }
    public void sendTextToCity(String city) {
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddress(String address) {
        sendTextToElement(sendTextToAddress, address);
    }
    public void sendTextToPostelCode(String postalCode) {
        sendTextToElement(sendTextToPostelCode, postalCode);
    }
    public void sendTextToPhoneNumber(String phoneNumber) {
        sendTextToElement(sendTextToPhoneNumber, phoneNumber);
    }
    public void clickOnContinue1() {
        clickOnElement(clickOnContinue1);
    }
    public void clickOn2ndDayAir() {
        clickOnElement(clickOn2ndDayAir);
    }
    public void clickOnContinue2() {
        clickOnElement(clickOnContinue2);
    }
    public void clickOnCreditCard() {
        clickOnElement(clickOnCreditCard);
    }
    public void clickOnContinueTab() {
        clickOnElement(clickOnContinue5);
    }
    public void clickOnSelectCreditCard() {
        clickOnElement(clickOnSelectCreditCard);
    }
    public void clickOnVisa() {
        clickOnElement(clickOnVisa);
    }
    public void sendTextToCardholderName(String cardHolderName) {
        sendTextToElement(sendTextToCardholderName, cardHolderName);
    }
    public void sendTextToCardNumber(String cardNumber) {
        sendTextToElement(sendTextToCardNumber, cardNumber);
    }
    public void sendTextToExpirationMonth(String expirationMonth) {
        selectByValueFromDropDown(sendTextToExpirationMonth,expirationMonth);
    }
    public void sendTextToExpirationYear(String expirationYear) {
        selectByValueFromDropDown(sendTextToExpirationYear, expirationYear);
    }
    public void sendTextToCardCode(String cardCode) {
        sendTextToElement(sendTextToCardCode, cardCode);
    }
    public void clickOnContinue3() {
        clickOnElement(clickOnContinue3);
    }
    public String verifyPaymentMethod() {
        return getTextFromElement(verifyPaymentMethod);
    }
    public String verifyShoppingMethod() {
        return getTextFromElement(verifyShoppingMethod);
    }
    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotalPrice);
    }
    public void clickOnConfirm() {
        clickOnElement(clickOnConfirm);
    }
    public String verifyTextThankYou() {
        return getTextFromElement(verifyTextThankYou);
    }
    public String verifySuccessfully() {
        return getTextFromElement(verifySuccessfully);
    }
    public void clickOnContinue4() {
        clickOnElement(clickOnContinue4);
    }
    public String verifyWelcomeToOurStore() {
        return getTextFromElement(verifyWelcomeToOurStore);
    }
    public void clickOnLogout() {
        clickOnElement(clickOnLogout);
    }
    public String verifyCurrentUrl(){
        return driver.getCurrentUrl();
    }

}


