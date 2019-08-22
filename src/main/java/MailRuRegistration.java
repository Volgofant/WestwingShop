import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailRuRegistration {
    WebDriver driver;
    public MailRuRegistration(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.xpath("//input[@class=\"b-input b-input_responsive b-input_compact b-input_animate\"]");
    By surname = By.xpath("//input[@class=\"b-input b-input_responsive b-input_compact b-input_popup b-input_animate\"]");
    By birthDay = By.xpath("//span[text()='День']");
    By birthMounth = By.xpath("//span[text()='Месяц']");
    By Mounth = By.xpath("//a[@data-num=\"0\"]");
    By birthYear = By.xpath("//span[text()='Год']");
    By maleGender = By.xpath("//span[@class=\"b-radiogroup__input-wrapper\"]//div[@class=\"b-radiogroup__radio-border\"]");
    By accName = By.xpath("//input[@class=\"b-input b-input_responsive b-input_compact b-input_popup b-input_wide b-input_disallow-custom-domain b-input_animate b-input_no-margin-bottom b-input_no-margin-top b-input_scroll-to-error b-input_wide-columns\"]");
    By passwordMail = By.xpath("//input[@id=\"password_37\"]");
    By buttonCreate = By.xpath("//button[@class=\"btn btn_main btn_responsive btn_responsive-wide \"]");

    public MailRuRegistration inputName() {
        driver.findElement(name).sendKeys("Тестер");
        return this;
    }
    public MailRuRegistration inputSurname() {
        driver.findElement(surname).sendKeys("Автоматон");
        return this;
    }
    public MailRuRegistration inputBirthDay() {
        driver.findElement(birthDay).sendKeys("10");
        return this;
    }
    public MailRuRegistration inputBirthMounth() {
        driver.findElement(birthMounth).click();
        driver.findElement(Mounth).click();
        return this;
    }
    public MailRuRegistration inputBirthYear() {
        driver.findElement(birthYear).sendKeys("1990");
        return this;
    }
    public MailRuRegistration choiseMaleGender() {
        driver.findElement(maleGender).click();
        return this;
    }
    public MailRuRegistration inputNameAcc (String mail) {
        driver.findElement(accName).sendKeys(mail);
        return this;
    }
    public MailRuRegistration inputPass() {
        driver.findElement(passwordMail).sendKeys("1753942865qeurty");
        return this;
    }
    public MailRuRegistration clickButtonCreate() {
        driver.findElement(buttonCreate).click();
        return this;
    }

//        driver.get("https://account.mail.ru/signup?from=main&rf=auth.mail.ru");
//        mailRuRegistration.inputName();
//        mailRuRegistration.inputSurname();
//        mailRuRegistration.inputBirthDay();
//        mailRuRegistration.inputBirthMounth();
//        mailRuRegistration.inputBirthYear();
//        mailRuRegistration.choiseMaleGender();
//        mailRuRegistration.inputNameAcc("nenashev" + str);
//        mailRuRegistration.inputPass();
//        mailRuRegistration.clickButtonCreate();
//        driver.get("https://alice-ru.shop-stage.ww-ru.ru/");

}
