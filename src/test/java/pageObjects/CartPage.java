package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CartPage extends BasePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")
    WebElement inputItem;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
    WebElement buttonSearchItem;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement item;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[2]/div[6]/div[8]/div[1]/div[4]/div/div/div/form/div[1]/div/div/div/div[2]/div/div[30]/div[1]/span/span/span/input/html/body/div[4]/div[2]/div[6]/div[8]/div[1]/div[4]/div/div/div/form/div[1]/div/div/div/div[2]/div/div[29]/div[1]/span/span/span/input")
    WebElement buttonAddCart;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[2]/div[6]/div[8]/div[4]/div[13]/div/table/tbody/tr[1]/td[2]/span[1]")
    WebElement divPriceItem;

    @FindBy(how = How.XPATH,
            using = "/html/body/div[1]/div[2]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement divNameItem;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div[1]/div[1]/span/span[2]")
    WebElement divPriceCart;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/div[2]/div[1]/div/div/div[4]/div/div/div/span[1]/span/span/a")
    WebElement buttonCartFinish;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/div/div[5]/div/div[2]/div[3]/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")
    WebElement buttonDeleteItemCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void addCartItem() throws InterruptedException {
        inputItem.sendKeys("kindle 10 geração");
        buttonSearchItem.click();
        Thread.sleep(500);
        String nameItem = divNameItem.getText();
        Assert.assertTrue(nameItem.contains("Kindle 10a. geração com iluminação embutida – Cor Preta"));
        divNameItem.click();
        String priceItem = divPriceItem.getText();
       // Thread.sleep(1000);
        buttonAddCart.click();
        wait.until(ExpectedConditions.visibilityOf(divPriceCart));
        String priceCart = divPriceCart.getText();
        Assert.assertEquals(priceItem, priceCart);
        buttonCartFinish.click();
        Thread.sleep(500);
        buttonDeleteItemCart.click();
    }
}
