package steps;

import org.testng.annotations.Test;
import pageObjects.CategoryPage;
import pageObjects.LoginPage;

public class ChallengeChesseCakeTest extends BaseTest {

    @Test
    public void loginSite(){
        loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @Test(priority = 1)
    public void categorySite(){
        categoryPage = new CategoryPage(driver);
        categoryPage.acessCategorys();
    }
}
