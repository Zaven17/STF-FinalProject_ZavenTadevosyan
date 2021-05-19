package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
    private WebDriver driver;
    private By item = By.linkText("Faded Short Sleeve T-shirts");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickItem(){
        driver.findElement(item).click();
    }
    public ItemPage goToItem() {
        return new ItemPage(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
