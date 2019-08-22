import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    int numberProductInBasket = 1;

    public int UpdateNumberProductInBasket(Integer x) {
        return numberProductInBasket = x;
    }

    By backPrimaryButton = By.xpath("//a[@class=\"cart__cartBox__text__link sel-continue-shopping jsBlockBackButton_cart\"]");
    By payButton = By.xpath("//a[@class=\"cart__cartBox__link btn-primary sel-cart-checkout-button\"]");
    By couponLink = By.xpath("//a[@class=\"jsAddCoupon cartFormFooter__couponBoxLink\"]");
    By backSecondaryButton = By.xpath("//a[@class=\"cart__form__footer__btnLink btn-primary sel-cart-checkout-button\"]");
    By productImage = By.xpath("//div[@class=\"js-overlay-product blockCartProduct \"]["+ numberProductInBasket +"]//a[@class=\" blockCartProduct__imageLink\"]/img[@class=\"js-overlay-product-image blockCartProduct__image\"]");
    By productName = By.xpath("//div[@class=\"js-overlay-product blockCartProduct \"]["+ numberProductInBasket +"]//a[@class=\"blockCartProduct__nameLink\"]");
    By productAddWishList = By.xpath("//div[@class=\"js-overlay-product blockCartProduct \"]["+ numberProductInBasket +"]//a[@class=\"jsWishlistHeart qaWishlistHeart blockCartProduct__wishlistLink jsCartToWishlist blockCartProduct__wishlistLink_withIcon\"]");
    By productDelete = By.xpath("//div[@class=\"js-overlay-product blockCartProduct \"]["+ numberProductInBasket +"]//span[@class=\"blockCartProduct__deleteText--remove\"]");
    By productSelectSum = By.xpath("//div[@class=\"js-overlay-product blockCartProduct \"]["+ numberProductInBasket +"]//span[@role=\"presentation\"]");
    By confirmProductDelete = By.xpath("//button[@class=\"blockConfirmOverlay__confirm jsBlockConfirmOverlay__confirm qaBlockConfirmOverlay__confirm\"]");

    public BasketPage clickConfirmProductDelete() {
        driver.findElement(confirmProductDelete).click();
        return this;
    }
    public BasketPage clickProductDelete() {
        driver.findElement(productDelete).click();
        return this;
    }
    public String getProductName() {
        return driver.findElement(productName).getText();
    }
    public SearchPage clickProductImage(Integer x) {
        UpdateNumberProductInBasket(x);
        driver.findElement(productImage).click();
        return new SearchPage(driver);
    }
    public BasketPage clickPayButton() {
        driver.findElement(payButton).click();
        return this;
    }

}

