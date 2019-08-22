import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public String getHelloMessage() {
        return driver.findElement(helloMessage).getText();
    }
}
