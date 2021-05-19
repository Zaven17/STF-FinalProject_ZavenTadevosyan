package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private By searchbox = By.xpath("//*[@id=\"search_query_top\"]");

    public WebDriver getDriver() {
        return driver;
    }

    public SearchResultPage goToSearchResultPage(){
        return new SearchResultPage(driver);
    }
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    public void search(String searchItem){
        WebElement s = driver.findElement(searchbox);
        s.sendKeys(searchItem);
        s.submit();
    }

    private void clickXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
