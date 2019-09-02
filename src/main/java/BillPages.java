import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPages {
    WebDriver driver;
    public BillPages(WebDriver driver) {
        this.driver = driver;
    }

    By genderFemale = By.xpath("//input[@id=\"billing-frau-input\"]");
    By genderMale = By.xpath("//input[@id=\"billing-herr-input\"]");
    By name = By.xpath("//input[@id=\"billing-name-input\"]");
    By surname = By.xpath("//input[@id=\"billing-lastName-input\"]");
    By companyName = By.xpath("//input[@id=\"billing-company-input\"]");
    By streetNumber = By.xpath("//input[@id=\"billing-street\"]");
    By advancedAddress = By.xpath("//input[@id=\"billing-street2\"]");
    By mailIndex = By.xpath("//input[@id=\"billing-code-input\"]");
    By city = By.xpath("//input[@id=\"BillingAddressForm_city\"]");
    By phone = By.xpath("//input[@id=\"billing-phone-input\"]");
    By differentAddress = By.xpath("//input[@id=\"checkout__forms__info2Form__input\"]");
    By buttonNextStep = By.xpath("//button[@class=\"checkoutBtn blockCheckoutHeading__button js-blockCheckoutHeading__button btn-primary js-submitPayment\"]");
    By creditCard = By.xpath("//input[@id=\"yandex_creditcard\"]");
    By cash = By.xpath("//input[@id=\"cash_on_delivery\"]");
    By nextPayPage = By.xpath("//p[@class=\"checkoutBtn__text\"]");
    By checkoutBtn = By.xpath("//button[@class=\"qa-checkout-submit-button checkoutBtn btn-primary js-submitFinish blockCheckoutHeading__button checkout__headingCTA\"]");
    By textCheckReadyOrder = By.xpath("//p[@class=\"checkout__finish__left__text\"][1]");
    By textYandexPayService = By.xpath("//div[@class=\"payment-info2__showcase-name\"]");
    By finalSum = By.xpath("//p[@class=\"cart__form__footer__totalTextRight\"]");
    By yandexSum = By.xpath("//span[@class=\"price\"]");

    public String getYandexSum() {
        return driver.findElement(yandexSum).getText();
    }
    public String getFinalSum() {
        return driver.findElement(finalSum).getText();
    }
    public String getTextYandexPayService() {
        return driver.findElement(textYandexPayService).getText();
    }
    public String getTextCheckreadyOrder() {
        return driver.findElement(textCheckReadyOrder).getText();
    }
    public BillPages clickCheckoutBtn() {
        driver.findElement(checkoutBtn).click();
        return this;
    }
    public BillPages ClickNextPayPage() {
        driver.findElement(nextPayPage).click();
        return this;
    }
    public BillPages choiseCreditCard() {
        driver.findElement(creditCard).click();
        return this;
    }
    public BillPages choiseCash() {
        driver.findElement(cash).click();
        return this;
    }
    public BillPages choiseGenderFemale() {
        driver.findElement(genderFemale).click();
        return this;
    }
    public BillPages choiseGenderMale() {
        driver.findElement(genderMale).click();
        return this;
    }
    public BillPages inputName() {
        driver.findElement(name).sendKeys("Имя");
        return this;
    }
    public BillPages inputSurname() {
        driver.findElement(surname).sendKeys("Фамилия");
        return this;
    }
    public BillPages inputCompanyName() {
        driver.findElement(companyName).sendKeys("Новая фирма");
        return this;
    }
    public BillPages inputStreetNumber() {
        driver.findElement(streetNumber).sendKeys("Улица доставки 42");
        return this;
    }
    public BillPages inputAdvancedAddress() {
        driver.findElement(advancedAddress).sendKeys("Дополнительного нет");
        return this;
    }
    public BillPages inputMailIndex() {
        driver.findElement(mailIndex).sendKeys("123456");
        return this;
    }
    public BillPages inputCity() {
        driver.findElement(city).sendKeys("Сыктывкар");
        return this;
    }
    public BillPages inputPhone() {
        driver.findElement(phone).sendKeys("1234567890");
        return this;
    }
    public BillPages clickDifferentAddress() {
        driver.findElement(differentAddress).click();
        return this;
    }
    public BillPages clickButtonNextStep() {
        driver.findElement(nextPayPage).click();
        return this;
    }

}
