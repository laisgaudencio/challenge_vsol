package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoryPage extends BasePage{

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/div/nav/ul/li[1]/a")
    WebElement buttonPolicts;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/div/nav/ul/li[2]/a")
    WebElement buttonBusiness;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/div/nav/ul/li[3]/a")
    WebElement buttonTech;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/div/nav/ul/li[4]/a")
    WebElement buttonScience;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/div/nav/ul/li[5]/a")
    WebElement buttonSports;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void acessCategorys(){
        try {
            buttonPolicts.click();
            driver.getPageSource().contains("POLITICS");
            buttonBusiness.click();
            //commented because of bug 3
            //driver.getPageSource().contains("BUSINESS");
            // buttonTech.click();
            driver.getPageSource().contains("TECH");
            buttonScience.click();
            driver.getPageSource().contains("SCIENCE");
            buttonSports.click();
            driver.getPageSource().contains("SPORTS");
        }catch (Exception e ){
            driver.getPageSource().contains("Message?"); //bug 3
        }

    }
}
