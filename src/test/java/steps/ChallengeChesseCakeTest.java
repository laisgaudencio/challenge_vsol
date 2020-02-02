package steps;

import org.testng.annotations.Test;
import pageObjects.CategoryPage;
import pageObjects.LoginPage;

public class ChallengeChesseCakeTest extends BaseTest {

    @Test
    //Scenario: User logs in to the site
    public void loginSite(){
        loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @Test(priority = 1)
    //Scenario Outline: Articles by category
    //Scenario Outline: Category empt
    //Scenario: Messages in the site
    public void categorySite(){
        categoryPage = new CategoryPage(driver);
        categoryPage.acessCategorys();
    }
}
