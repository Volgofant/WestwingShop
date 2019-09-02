import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.View;
import java.util.Random;

public class RegistrationPage<i> {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By logInMail = By.xpath("//input[@id=\"LoginForm_email\"]");
    By logInPass = By.xpath("//input[@id=\"LoginForm_password\"]");
    By forgotPass = By.xpath("//a[text()='Забыли пароль?']");
    By LogInButton = By.xpath("//button[text()='Войти']");
    By logInFacebook = By.xpath("//span[@class=\"fbAuthButton__text js-FbLoginButton__text\"]");
    By femaleGender = By.xpath("//input[@id=\"frau-input\"]");
    By maleGender = By.xpath("//input[@id=\"herr-input\"]");
    By signInName = By.xpath("//input[@id=\"CheckoutShortRegistrationForm_first_name\"]");
    By signInSurname = By.xpath("//input[@id=\"CheckoutShortRegistrationForm_last_name\"]");
    By signInMail = By.xpath("//input[@id=\"CheckoutShortRegistrationForm_email\"]");
    By signInPass = By.xpath("//input[@id=\"CheckoutShortRegistrationForm_password\"]");
    By signInAgreement = By.xpath("//input[@id=\"CheckoutShortRegistrationForm_is_tc_accepted\"]");
    By signInMailSpam = By.xpath("//input[@id=\"CheckoutShortRegistrationForm_is_newsletter_subscribed\"]");
    By signInButton = By.xpath("//button[text()='Зарегистрироваться']");
    By singInFacebook = By.xpath("//button[@class=\"fbAuthButton btn-default js-FbRegisterButton qa-FbRegisterButton\"]");
    By incorrectMailOnMail = By.xpath("//div[@class=\"s-error msg\"][1]");
    By incorrectMailOnPass = By.xpath("//div[@class=\"checkout__forms__passNewForm\"]/div[@class=\"s-error msg\"]");
    By nullName = By.xpath("//div[@class=\"checkout__forms__nameForm\"]/div[@class=\"s-error msg\"]");
    By nullSurname = By.xpath("//div[@class=\"checkout__forms__lastNameForm\"]/div[@class=\"s-error msg\"]");
    By nullMail = By.xpath("//div[@class=\"checkout__forms__newMailForm\"]/div[@class=\"s-error msg\"]");
    By repeatMail = By.xpath("//div[@class=\"checkout__forms__newMailForm\"]/div[@class=\"s-error\"]");
    By wrongMail = By.xpath("//h2[@class=\"checkout__forms__header__heading\"]");
    By nullPass = By.xpath("//div[@class=\"checkout__forms__passNewForm\"]/div[@class=\"s-error\"]");
    By nullPassNo = By.xpath("//div[@class=\"checkout__forms__passNewForm\"]/div[@class=\"s-error msg\"]");
    By nullArgeement = By.xpath("//div[@class=\"checkout__forms__info1Form  checker__error\"]/div[@class=\"s-error msg\"]");
    By facebookPassword = By.xpath("//input[@type=\"password\"]");
    By facebookMail = By.xpath("//input[@id=\"email\"]");
    By facebookButtonLogIn = By.xpath("//input[@id=\"u_0_0\"]");

    int min = 1;
    int max = 99998;
    int diff = max - min;
    Random random = new Random();
    int i = random.nextInt(diff + 1);

    public String getNullArgeement() {
        return driver.findElement(nullArgeement).getText();
    }
    public String  getNullPassNo() {
        return driver.findElement(nullPassNo).getText();
    }
    public String getThisPageWrongPass() {
        return driver.findElement(nullPass).getText();
    }
    public String getThisPageWrongMail() {
        return driver.findElement(wrongMail).getText();
    }
    public String getErrorMessageRepeatMail() {
        return driver.findElement(repeatMail).getText();
    }
    public String getErrorMessageNullMail() {
        return driver.findElement(nullMail).getText();
    }
    public String getErrorMessageMailOnMail() {
        return driver.findElement(incorrectMailOnMail).getText();
    }
    public String getErrorMessageNullName() {
        return driver.findElement(nullName).getText();
    }
    public String getErrorMessageNullSurName() {
        return driver.findElement(nullSurname).getText();
    }
    public String getErrorMessageMailOnPass() {
        return driver.findElement(incorrectMailOnPass).getText();
    }
    public RegistrationPage insertLogInMail(String mail) {
        driver.findElement(logInMail).sendKeys(mail);
        return this;
    }
    public RegistrationPage insertLogInPass(String pass) {
        driver.findElement(logInPass).sendKeys(pass);
        return this;
    }
    public RestoreForgotPasswordPage clickForgotPass() {
        driver.findElement(forgotPass).click();
        return new RestoreForgotPasswordPage(driver);
    }
    public MainPage clickLogInButton() {
        driver.findElement(LogInButton).click();
        return new MainPage(driver);
    }
    public RegistrationPage choiseMaleGender() {
        driver.findElement(maleGender).click();
        return this;
    }
    public RegistrationPage choiseFemaleGender() {
        driver.findElement(femaleGender).click();
        return this;
    }
    public RegistrationPage insertSignInName(String name) {
        driver.findElement(signInName).sendKeys(name);
        return this;
    }
    public RegistrationPage insertSignInSurname(String surname) {
        driver.findElement(signInSurname).sendKeys(surname);
        return this;
    }
    public RegistrationPage insertSignInMail(String mail) {
        driver.findElement(signInMail).sendKeys(mail);
        return this;
    }
    public RegistrationPage insertSignInPass(String pass) {
        driver.findElement(signInPass).sendKeys(pass);
        return this;
    }
    public RegistrationPage checkBoxAgreement() {
        driver.findElement(signInAgreement).click();
        return this;
    }
    public RegistrationPage checkBoxMailSpam() {
        driver.findElement(signInMailSpam).click();
        return this;
    }
    public MainPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new MainPage(driver);
    }
    public RegistrationPage clickSingInFacebook() {
        driver.findElement(singInFacebook).click();
        return this;
    }
    public RegistrationPage inputFacebookInfo() {
        for (String windowHandle:driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(facebookMail).sendKeys("volgofant@mail.ru");
        driver.findElement(facebookPassword).sendKeys("175394286v");
        driver.findElement(facebookButtonLogIn).click();
        return this;
    }
    public RegistrationPage loginInFacebook(){
        driver.findElement(logInFacebook).click();
        return this;
    }
    public String getActualPass() {
        return driver.findElement(logInPass).getText();
    }



}
