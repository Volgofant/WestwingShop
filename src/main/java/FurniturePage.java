import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FurniturePage {
    WebDriver driver;
    public FurniturePage(WebDriver driver) {
        this.driver = driver;
    }

    By product = By.xpath("//button[@data-sku=\"RUQ19LAP886147-137047\"]/parent::article");

    public FurniturePage clickProduct() {
        driver.findElement(product).click();
        return this;
    }
}
