package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[1]/div[2]/div/a[1]")
    WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")
    WebElement inputEmail;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")
    WebElement buttonContinuar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input")
    WebElement inputPassword;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input")
    WebElement buttonFazerLogin;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[1]/div[2]/div/a[1]/span[1]")
    WebElement divUser;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        wait.until(ExpectedConditions.visibilityOf(buttonLogin));
        buttonLogin.click();
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.sendKeys("laismachado1592@gmail.com");
        buttonContinuar.click();
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputPassword.sendKeys("123456789");
        buttonFazerLogin.click();
        String textElement = divUser.getText();
        Assert.assertEquals("Olá, testevsol", textElement);
    }

}
