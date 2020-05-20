package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.WindowManager;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SecureAreaPage secureAreaPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
        System.out.println(driver.getTitle());
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}
