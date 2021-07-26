package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.BeautySectionPage;
import pageObject.ProductBasketPage;
import pageObject.SiberianHealthPage;

public class SuperClass {

    private static final int TIME_OUT_IN_SECONDS = 10;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public SiberianHealthPage siberianHealthPage;
    public BeautySectionPage beautySectionPage;
    public ProductBasketPage productBasketPage;

    @Before
    public void startWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
        this.siberianHealthPage = new SiberianHealthPage();
        this.beautySectionPage = new BeautySectionPage();
        this.productBasketPage = new ProductBasketPage();
    }

    @After
    public void quiteDriver() {
        driver.quit();
    }
}

