import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By productSize = By.xpath("//span[@id=\"select2-chosen-1\"]");
    By productCount = By.xpath("//span[@id=\"select2-chosen-3\"]");
    By buttonInBasket = By.xpath("//button[@class=\"blockAddActions__btn btn-primary jsProductInfo__btn qa-addToCartBtn js-addToCartBtn blockAddActions__btn_show\"]");
    By buttonInWishList = By.xpath("//span[@class=\"blockWishlistButton__text\"]");
    By buttonChoiseWishList = By.xpath("//button[@class=\"blockAddToWishlistOverlay__confirm qaBlockAddToWishlistOverlay__confirm btn-primary\"]");
    By productName = By.xpath("//h1[@class=\"blockProductHeading__heading\"]");

    public String getProductName() {
        return driver.findElement(productName).getText();
    }
    public ProductPage clickButtonInBasket() {
        driver.findElement(buttonInBasket).click();
        return this;
    }
    public ProductPage clickButtonInWishList() {
        driver.findElement(buttonInWishList).click();
        return this;
    }
    public ProductPage clickButtonChoiseWishList() {
        driver.findElement(buttonChoiseWishList).click();
        return this;
    }

}
