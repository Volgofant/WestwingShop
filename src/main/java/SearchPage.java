import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    By subMenuMebel = By.xpath("//a[@href=\"/url_all-products/mebel/\"]");
    By subMenuDekor = By.xpath("//a[@href=\"/url_all-products/dekor/\"]");
    By subMenuLightning = By.xpath("//a[@href=\"/url_all-products/osveshchenie/\"]");
    By subMenuTextiles = By.xpath("//a[@href=\"/url_all-products/tekstil-i-kovry/\"]");
    By subMenuWareAndAccessories = By.xpath("//a[@href=\"/url_all-products/posuda/\"]");
    By searchMultiColor = By.xpath("//input[@id=\"facet_col_%D0%BC%D1%83%D0%BB%D1%8C%D1%82%D0%B8%D0%BA%D0%BE%D0%BB%D0%BE%D1%80\"]");
    By searchYellowColor = By.xpath("//input[@id=\"facet_col_%D0%B6%D0%B5%D0%BB%D1%82%D1%8B%D0%B9\"]");
    By searchBlackColow = By.xpath("//input[@id=\"facet_col_%D1%87%D0%B5%D1%80%D0%BD%D1%8B%D0%B9\"]");
    By searchBlueColow = By.xpath("//input[@id=\"facet_col_%D1%81%D0%B8%D0%BD%D0%B8%D0%B9\"]");
    By searchWigthColow = By.xpath("//input[@id=\"facet_col_%D0%B1%D0%B5%D0%BB%D1%8B%D0%B9\"]");
    By searchGreenColow = By.xpath("//input[@id=\"facet_col_%D0%B7%D0%B5%D0%BB%D0%B5%D0%BD%D1%8B%D0%B9\"]");
    By searchGoldColow = By.xpath("//input[@id=\"facet_col_%D0%B7%D0%BE%D0%BB%D0%BE%D1%82%D0%BE%D0%B9\"]");
    By searchVioletColow = By.xpath("//input[@id=\"facet_col_%D1%84%D0%B8%D0%BE%D0%BB%D0%B5%D1%82%D0%BE%D0%B2%D1%8B%D0%B9\"]");


}
