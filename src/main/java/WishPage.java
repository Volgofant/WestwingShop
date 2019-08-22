import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishPage {
    WebDriver driver;
    public WishPage (WebDriver driver) {
        this.driver = driver;
    }

    By buttonNewList = By.xpath("//button[text()='Новый список']");
    By listName = By.xpath("//input[@id=\"blockCreateListOverlay__inputId\"]");
    By buttonInk = By.xpath("//button[@class=\"btn-primary blockCreateListOverlay__confirm qaBlockCreateListOverlay__confirm\"]");
    By nameProductWishlist = By.xpath("//p[@class=\"blockListProduct__name\"]");
    By deleteProductWishlist = By.xpath("//button[@class=\"blockListProduct__delete qaBlockListProduct__delete\"]");
    By textDeleteProduct = By.xpath("//div[@class=\"message__text\"]");
    By productBuy = By.xpath("//button[@class=\"blockListProduct__addToCart qaBlockListProduct__addToCart\"]");
    By textProductBuyed = By.xpath("//div[@class=\"message__text\"]");


    public String getTextProductBuyed() {
        return driver.findElement(textProductBuyed).getText();
    }
    public WishPage clickProductBuy() {
        driver.findElement(productBuy).click();
        return this;
    }
    public String getTextDeleteProduct() {
        return driver.findElement(textDeleteProduct).getText();
    }
    public WishPage clickDeleteProductWishlist() {
        driver.findElement(deleteProductWishlist).click();
        return this;
    }
    public String getNameWishlist() {
        return driver.findElement(nameProductWishlist).getText();
    }
    public WishPage clickButtonNewList() {
        driver.findElement(buttonNewList).click();
        return this;
    }
    public WishPage insertListName (String name) {
        driver.findElement(listName).sendKeys(name);
        return this;
    }
    public WishPage clickButtonLink() {
        driver.findElement(buttonInk).click();
        return this;
    }
}
