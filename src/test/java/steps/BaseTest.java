package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.CategoryPage;
import pageObjects.LoginPage;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    LoginPage loginPage;
    CategoryPage categoryPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://localhost:3000/politics");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws Exception {
        driver.quit();
    }
}
