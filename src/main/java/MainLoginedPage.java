import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainLoginedPage {
    private WebDriver driver;

    public MainLoginedPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchInput = By.xpath("//input[@id=\"searchInput\"]");
    By registration = By.xpath("//span[text()='Зарегистрироваться']");
    By wishSpan = By.xpath("//span[text()='Список желаний']");
    By basketSpan = By.xpath("//span[text()='Корзина']");
    By novelties = By.xpath("//a[text()='\n" +
            "                    Новинки                ']");
    By collectAnImage = By.xpath("//a[text()='                        Собери образ                    ']");
    By furniture = By.xpath("//a[text()='\n" +
            "                    Мебель                ']");
    By decor = By.xpath("//a[text()='                    Декор                ']");
    By lightning = By.xpath("//a[text()='\n" +
            "                    Освещение                ']");
    By textiles = By.xpath("//a[text()='\n" +
            "                    Текстиль и ковры                ']");
    By wareAndAccessories = By.xpath("//a[text()='\n" +
            "                    Посуда и аксессуары                ']");


    public RegistrationPage clickRegistration() {
        driver.findElement(registration).click();
        return new RegistrationPage(driver);
    }
    public WishPage clickWishSpan() {
        driver.findElement(wishSpan).click();
        return new WishPage(driver);
    }
    public BasketPage clickBasketSpan() {
        driver.findElement(basketSpan).click();
        return new BasketPage(driver);
    }
    public SearchPage sendSearchInput(String SearchValue) {
        driver.findElement(searchInput).sendKeys(SearchValue);
        return new SearchPage(driver);
    }
    public NoveltiesPage clickNovelties() {
        driver.findElement(novelties).click();
        return new NoveltiesPage(driver);
    }
    public CollectAnImagePage clickCollectAnImage() {
        driver.findElement(collectAnImage).click();
        return new CollectAnImagePage(driver);
    }
    public FurniturePage clickFurniture() {
        driver.findElement(furniture).click();
        return new FurniturePage(driver);
    }
    public DekorPage clickDecor() {
        driver.findElement(decor).click();
        return new DekorPage(driver);
    }
    public LightningPage clickLightning() {
        driver.findElement(lightning).click();
        return new LightningPage(driver);
    }
    public TextilesPage clickTextiles() {
        driver.findElement(textiles).click();
        return new TextilesPage(driver);
    }
    public WareAndAccessoriesPage clickWareAndAccessories() {
        driver.findElement(wareAndAccessories).click();
        return new WareAndAccessoriesPage(driver);
    }
}

