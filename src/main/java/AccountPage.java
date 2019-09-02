import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class AccountPage {
    WebDriver driver;
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By updatePersonalDate = By.xpath("//a[@class=\"qaMyAccountCredentials\"]");
    By updateAddress = By.xpath("//a[@class=\"qaMyAccountBillingAddress\"]");
    By updateMailSpam = By.xpath("//a[@class=\"qaMyAccountNewsletters\"]");
    By updateAddressDelivery = By.xpath("//a[@class=\"qaMyAccountShippingAddress\"]");
    By accountSelMenu = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-myaccount\"]");
    By accountSelWishList = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-wishlist\"]");
    By accountSelOrders = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-orders\"]");
    By accountSelReviews = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-reviews\"]");
    By accountSelVouchers = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-vouchers\"]");
    By accountSelInfo = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-info\"]");
    By accountSelAddress = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-addresses\"]");
    By accountSelMailSpam = By.xpath("//a[@class=\"account__sidebar__nav__list__link__item sel-menu-newsletter\"]");
    By helloMessage = By.xpath("//p[@class=\"accountStep1__header__text\"]");
    By buttonChangePass = By.xpath("//a[@href=\"#passwordPopup\"]/p");
    By actualPass = By.xpath("//input[@id=\"password_current-input\"]");
    By newPass = By.xpath("//input[@id=\"password-input\"]");
    By newPassConfirm = By.xpath("//input[@id=\"password2-input\"]");
    By buttonSavePass = By.xpath("//button[@class=\"accountPopup__btn btn-primary\"]");
    By textPassChange = By.xpath("//div[@class=\"message__text\"]");
    By saveNewPass = By.xpath("//button[text()='Сохранить новый пароль']");


    public AccountPage clickSaveNewPass() {
        driver.findElement(saveNewPass).click();
        return this;
    }
    public String getTextPassChange() {
        return driver.findElement(textPassChange).getText();
    }
    public AccountPage inputActualPass (String AcPass) {
        driver.findElement(actualPass).sendKeys(AcPass);
        return this;
    }
    public AccountPage clickButtonChangePass() {
        driver.findElement(buttonChangePass).click();
        return this;
    }
    public String getHelloMessage() {
        return driver.findElement(helloMessage).getText();
    }
    public AccountPage clickChangeDate() {
        driver.findElement(accountSelInfo).click();
        return this;
    }
    public AccountPage inputNewPass (String x) {
        driver.findElement(newPass).sendKeys(x);
        return this;
    }
    public AccountPage inputNewPassConfirm(String y) {
        driver.findElement(newPassConfirm).sendKeys(y);
        return this;
    }
    public AccountPage clickButtonSavePass() {
        driver.findElement(buttonChangePass);
        return this;
    }
}

