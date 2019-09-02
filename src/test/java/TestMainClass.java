import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestMainClass {
    public WebDriver driver;
    private MainPage mainPage;
    private AccountPage accountPage;
    private BasketPage basketPage;
    private CollectAnImagePage collectAnImagePage;
    private RegistrationPage registrationPage;
    private DekorPage dekorPage;
    private FurniturePage furniturePage;
    private MainLoginedPage mainLoginedPage;
    private NoveltiesPage noveltiesPage;
    private PasswordConfirmPage passwordConfirmPage;
    private RestoreForgotPasswordPage restoreForgotPasswordPage;
    private SearchPage searchPage;
    private TextilesPage textilesPage;
    private WareAndAccessoriesPage wareAndAccessoriesPage;
    private WishPage wishPage;
    private MailRuRegistration mailRuRegistration;
    private ProductPage productPage;
    private BillPages billPages;


    public void Wait2() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(By.className("cookiePolicyOverlay qa-cookiePolicyOverlay cookiePolicyOverlay--active")));
    }

    Date dateNow = new Date();
    SimpleDateFormat format = new SimpleDateFormat("hhч mmмин ssсек");
    String fileName = format.format(dateNow) + ".png";

    public TestMainClass screenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("C:\\Users\\viktor.nenashev\\screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }




    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\viktor.nenashev\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://alice-ru.shop-stage.ww-ru.ru/");
        mainPage = new MainPage(driver);
        mainPage.closeFuckingCoockie();
        registrationPage = new RegistrationPage(driver);
        accountPage = new AccountPage(driver);
        basketPage = new BasketPage(driver);
        collectAnImagePage = new CollectAnImagePage(driver);
        dekorPage = new DekorPage(driver);
        furniturePage = new FurniturePage(driver);
        mainLoginedPage = new MainLoginedPage(driver);
        noveltiesPage = new NoveltiesPage(driver);
        passwordConfirmPage = new PasswordConfirmPage(driver);
        restoreForgotPasswordPage = new RestoreForgotPasswordPage(driver);
        searchPage = new SearchPage(driver);
        textilesPage = new TextilesPage(driver);
        wareAndAccessoriesPage = new WareAndAccessoriesPage(driver);
        wishPage = new WishPage(driver);
        mailRuRegistration = new MailRuRegistration(driver);
        productPage = new ProductPage(driver);
        billPages = new BillPages(driver);

    }
    @Test
    public void registrationNullNameTest() {
         mainPage.clickRegistration();
         registrationPage.insertSignInName("");
         registrationPage.insertSignInSurname("Ненашев");
         registrationPage.insertSignInMail("nenashev" + registrationPage.i + "@mail.ru");
         registrationPage.insertSignInPass("1q2w3e4r");
         registrationPage.checkBoxAgreement();
         registrationPage.checkBoxMailSpam();
         registrationPage.clickSignInButton();
         Assert.assertEquals("Обязательное поле", registrationPage.getErrorMessageNullName());

    }
    @Test
    public void registrationNullSurNameTest() {
        mainPage.clickRegistration();
        registrationPage.insertSignInName("Виктор");
        registrationPage.insertSignInSurname("");
        registrationPage.insertSignInMail("nenashev" + registrationPage.i + "@mail.ru");
        registrationPage.insertSignInPass("1q2w3e4r");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Обязательное поле", registrationPage.getErrorMessageNullSurName());
    }
    @Test
    public void registrationNullMail() {
        mainPage.clickRegistration();
        registrationPage.insertSignInName("Виктор");
        registrationPage.insertSignInSurname("Ненашев");
        registrationPage.insertSignInMail("");
        registrationPage.insertSignInPass("1q2w3e4r");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Неверный адрес электронной почты", registrationPage.getErrorMessageNullMail());
    }
    @Test
    public void registrationRepeatMail() {
        mainPage.clickRegistration();
        registrationPage.insertSignInName("Виктор");
        registrationPage.insertSignInSurname("Ненашев");
        registrationPage.insertSignInMail("borcuha64@mail.ru");
        registrationPage.insertSignInPass("1q2w3e4r");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Аккаунт с этим адресом электронной почты уже существует", registrationPage.getErrorMessageRepeatMail());
    }
    @Test
    public void registrationWrongMail() {
        mainPage.clickRegistration();
        registrationPage.insertSignInName("Виктор");
        registrationPage.insertSignInSurname("Ненашев");
        registrationPage.insertSignInMail("borcuha64@");
        registrationPage.insertSignInPass("1q2w3e4r");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Я уже являюсь клиентом Westwing.", registrationPage.getThisPageWrongMail());
    }
    @Test
    public void registrationNullPassword() {
        mainPage.clickRegistration();
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Пароль поле слишком короткое (не менее 6 знаков)", registrationPage.getNullPassNo());
    }
    @Test
    public void registrationSmallPassword() {
        mainPage.clickRegistration();
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("12345");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Пароль поле слишком короткое (не менее 6 знаков)", registrationPage.getNullPassNo());
    }
    @Test
    public void registrationBigPassword() {
        mainPage.clickRegistration();
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("123451234512345123451234512345123451234512345123451");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Максимум 50 символов", registrationPage.getThisPageWrongPass());
    }
    @Test
    public void registrationOkFemale() {
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        mainPage.clickRegistration();
        registrationPage.choiseMaleGender();
        registrationPage.choiseFemaleGender();
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("nenashev" + str);
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("nenashev" + str, mainPage.getNameLogin());
    }
    @Test
    public void registrationOkMale() {
        mainPage.clickRegistration();
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        registrationPage.choiseMaleGender();
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("nenashev" + str);
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        Assert.assertEquals("nenashev" + str, mainPage.getNameLogin());
    }
    @Test
    public void registrationNullAll() {
        mainPage.clickRegistration();
        registrationPage.clickSignInButton();
        Assert.assertEquals("Обязательное поле", registrationPage.getErrorMessageNullName());
        Assert.assertEquals("Обязательное поле", registrationPage.getErrorMessageNullSurName());
        Assert.assertEquals("Неверный адрес электронной почты", registrationPage.getErrorMessageNullMail());
        Assert.assertEquals("Пароль поле слишком короткое (не менее 6 знаков)", registrationPage.getErrorMessageMailOnPass());
        Assert.assertEquals("Обязательное поле", registrationPage.getNullArgeement());

    }
    @Test
    public void registrationOnFacebook() throws InterruptedException {
        mainPage.clickRegistration();
        String mainWindow = driver.getWindowHandle();
        registrationPage.clickSingInFacebook();
        registrationPage.inputFacebookInfo();
        driver.switchTo().window(mainWindow);
        WebElement dunamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("accountStep1__header__text")));
        Assert.assertEquals("Из обзора учетной записи пользователя можно просматривать последние операции и редактировать данные учетной записи. Для этого выберите одну из ссылок ниже для просмотра или редактирования.", accountPage.getHelloMessage());
    }
    @Test
    public void logIngOnFacebook() throws InterruptedException {
        mainPage.clickRegistration();
        String mainWindow = driver.getWindowHandle();
        Thread.sleep(500);
        registrationPage.loginInFacebook();
        registrationPage.inputFacebookInfo();
        driver.switchTo().window(mainWindow);
        Thread.sleep(4000);
        Assert.assertEquals("Виктор", mainPage.getNameLogin());
    }
    @Test
    public void WishList() throws InterruptedException {
        mainPage.clickRegistration();
        registrationPage.insertLogInMail("kpamel@bk.ru");
        registrationPage.insertLogInPass("1q2w3e4r");
        registrationPage.clickLogInButton();
        mainPage.clickFurniture();
        furniturePage.clickProduct();
        String product = productPage.getProductName();
        productPage.clickButtonInWishList();
        productPage.clickButtonChoiseWishList();
        Thread.sleep(1000);
        mainPage.clickWishSpan();
        Assert.assertEquals(product, wishPage.getNameWishlist());
        wishPage.clickDeleteProductWishlist();
    }
    @Test
    public void WishListProductDelete() throws InterruptedException {
        mainPage.clickRegistration();
        registrationPage.insertLogInMail("kpamel@bk.ru");
        registrationPage.insertLogInPass("1q2w3e4r");
        registrationPage.clickLogInButton();
        mainPage.clickFurniture();
        furniturePage.clickProduct();
        String product = productPage.getProductName();
        productPage.clickButtonInWishList();
        productPage.clickButtonChoiseWishList();
        Thread.sleep(1000);
        mainPage.clickWishSpan();
        wishPage.clickDeleteProductWishlist();
        Assert.assertEquals("Продукт был удален из Вашего списка Список желаний", wishPage.getTextDeleteProduct());
    }
    @Test
    public void WishListProductInBasket() throws InterruptedException {
        mainPage.clickRegistration();
        registrationPage.insertLogInMail("kpamel@bk.ru");
        registrationPage.insertLogInPass("1q2w3e4r");
        registrationPage.clickLogInButton();
        mainPage.clickFurniture();
        furniturePage.clickProduct();
        String product = productPage.getProductName();
        productPage.clickButtonInWishList();
        productPage.clickButtonChoiseWishList();
        Thread.sleep(1000);
        mainPage.clickWishSpan();
        wishPage.clickProductBuy();
        Assert.assertEquals("Товар успешно добавлен в корзину", wishPage.getTextProductBuyed());
        mainPage.clickBasketSpan();
        Assert.assertEquals(product, basketPage.getProductName());
        basketPage.clickProductDelete();
        basketPage.clickConfirmProductDelete();
        mainPage.clickWishSpan();
        wishPage.clickDeleteProductWishlist();
    }
    @Test
    public void doOrderFirstTime() {
        mainPage.clickRegistration();
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        registrationPage.choiseMaleGender();
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("nenashev" + str);
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        mainPage.clickFurniture();
        furniturePage.clickProduct();
        productPage.clickButtonInBasket();
        mainPage.clickBasketSpan();
        basketPage.clickPayButton();
        billPages.inputStreetNumber();
        billPages.inputMailIndex();
        billPages.inputCity();
        billPages.inputPhone();
        billPages.clickButtonNextStep();
        try {
            billPages.choiseCash();
            billPages.clickButtonNextStep();
            billPages.clickCheckoutBtn();
        } catch (Exception e) {
            billPages.clickButtonNextStep();
            billPages.clickCheckoutBtn();
        }
        Assert.assertEquals("Спасибо за покупку!", billPages.getTextCheckreadyOrder());
    }
    @Test
    public void doOrderRepeatedlyTimeCash() {
        mainPage.clickRegistration();
        registrationPage.insertLogInMail("adyshatov@bk.ru");
        registrationPage.insertLogInPass("westwingpas");
        registrationPage.clickLogInButton();
        mainPage.clickFurniture();
        furniturePage.clickProduct();
        productPage.clickButtonInBasket();
        mainPage.clickBasketSpan();
        basketPage.clickPayButton();
        try {
            billPages.choiseCash();
            billPages.clickButtonNextStep();
            billPages.clickCheckoutBtn();
        } catch (Exception e) {
            billPages.clickButtonNextStep();
            billPages.clickCheckoutBtn();
        }
        Assert.assertEquals("Спасибо за покупку!", billPages.getTextCheckreadyOrder());
    }
    @Test
    public void doOrderRepeatedlyTimeCreditCard() {
        mainPage.clickRegistration();
        registrationPage.insertLogInMail("adyshatov@bk.ru");
        registrationPage.insertLogInPass("westwingpas");
        registrationPage.clickLogInButton();
        mainPage.clickFurniture();
        furniturePage.clickProduct();
        productPage.clickButtonInBasket();
        mainPage.clickBasketSpan();
        basketPage.clickPayButton();
        try {
            billPages.choiseCreditCard();
            billPages.clickButtonNextStep();
            billPages.clickCheckoutBtn();
        } catch (Exception e) {
            billPages.clickButtonNextStep();
            billPages.clickCheckoutBtn();
        }
        Assert.assertEquals("ООО \"ВЕСТВИНГ РАША\"", billPages.getTextYandexPayService());
    }
    @Test
    public void changePass() throws InterruptedException {
        mainPage.clickRegistration();
        Integer element = registrationPage.i;
        String str = Integer.toString(element);
        registrationPage.choiseMaleGender();
        registrationPage.insertSignInName("nenashev" + str);
        registrationPage.insertSignInSurname("nenashev" + str);
        registrationPage.insertSignInMail("nenashev" + str + "@mail.ru");
        registrationPage.insertSignInPass("westwingpas");
        registrationPage.checkBoxAgreement();
        registrationPage.checkBoxMailSpam();
        registrationPage.clickSignInButton();
        mainPage.clickMyAccount();
        accountPage.clickChangeDate();
        accountPage.clickButtonChangePass();
        accountPage.inputActualPass("westwingpas");
        accountPage.inputNewPass("newwestwingpas");
        accountPage.inputNewPassConfirm("newwestwingpas");
        accountPage.clickSaveNewPass();
        Thread.sleep(3000);
        String OkPassChange = accountPage.getTextPassChange();
        Assert.assertEquals("Пароль успешно изменен", OkPassChange);
    }

//    @Test
//    public void doCheckSumOrder() {
//        mainPage.clickRegistration();
//        registrationPage.insertLogInMail("adyshatov@bk.ru");
//        registrationPage.insertLogInPass("westwingpas");
//        registrationPage.clickLogInButton();
//        mainPage.clickFurniture();
//        furniturePage.clickProduct();
//        productPage.clickButtonInBasket();
//        mainPage.clickBasketSpan();
//        String sum = billPages.getFinalSum();
//        basketPage.clickPayButton();
//        try {
//            billPages.choiseCreditCard();
//            billPages.clickButtonNextStep();
//            billPages.clickCheckoutBtn();
//        } catch (Exception e) {
//            billPages.clickButtonNextStep();
//            billPages.clickCheckoutBtn();
//        }
//        Assert.assertEquals(sum, billPages.getYandexSum());
//    }
//    @Rule
//    public TestWatcher watcher = new TestWatcher() {
//        @Override
//        protected void failed(Throwable e, Description description) {
//            screenshot();
//        }
//    };
//    @Test
//    public void registrationFullMail() {
//        mainPage.clickRegistration();
//        Integer element = registrationPage.i;
//        String str = Integer.toString(element);
//        registrationPage.insertSignInName("nenashev" + str);
//        registrationPage.insertSignInSurname("nenashev" + str);
//        registrationPage.insertSignInMail("kpamel@bk.ru");
//        registrationPage.insertSignInPass("1q2w3e4r");
//        registrationPage.checkBoxAgreement();
//        registrationPage.checkBoxMailSpam();
//        registrationPage.clickSignInButton();
//        Assert.assertEquals("nenashev" +  str, mainPage.getNameLogin());
//    }    // механизм регистрации нового пользователя.
    @After
    public void tierDown() {
//        screenshot();
        driver.quit();
    }
}
