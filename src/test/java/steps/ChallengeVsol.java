package steps;

import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.LoginPage;

public class ChallengeVsol extends BaseTest {

    @Test
    public void addCart() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.login();
        cartPage = new CartPage(driver);
        cartPage.addCartItem();
    }
}
