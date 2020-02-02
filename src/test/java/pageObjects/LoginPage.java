package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/div/nav/ul/li[6]/a")
    WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/input[1]")
    WebElement inputEmail;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/input[2]")
    WebElement inputPassword;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/button")
    WebElement buttonEnterLogin;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/a[1]/button")
    WebElement buttonSave;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div[2]/div/button[1]")
    WebElement buttonPolitics;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div[2]/div/button[2]")
    WebElement buttonBusiness;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div[2]/div/button[3]")
    WebElement buttonTech;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div[2]/div/button[4]")
    WebElement buttonScience;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div[2]/div/button[5]")
    WebElement buttonSports;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(){
        buttonLogin.click();
        inputEmail.sendKeys("laistest@test.com");
        inputPassword.sendKeys("123456");
        buttonEnterLogin.click();
        driver.getPageSource().contains("WELCOME, LAISTEST@TEST.COM");
        buttonPolitics.click();
        buttonTech.click();
        buttonSave.click();
        driver.getCurrentUrl().contains("POLITICS");
        driver.getCurrentUrl().contains("TECH");
        //não está funcionando direito

    }

}
