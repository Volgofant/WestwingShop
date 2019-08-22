import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestoreForgotPasswordPage {
    WebDriver driver;
    public RestoreForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    By mailForgotPassInput = By.xpath("//input[@id=\"ForgotPasswordForm_email\"]");
    By mailForgotPassButton = By.xpath("//button[text()='Изменить пароль']");

    public RestoreForgotPasswordPage insertMail (String mail) {
        driver.findElement(mailForgotPassInput).sendKeys(mail);
        return this;
    }
    public PasswordConfirmPage clickMailForgotPassButton() {
        driver.findElement(mailForgotPassButton).click();
        return new PasswordConfirmPage(driver);
    }
}
