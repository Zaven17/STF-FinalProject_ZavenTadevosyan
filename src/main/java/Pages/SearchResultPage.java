package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    private By item = By.linkText("Faded Short Sleeve T-shirts");
    private By sortByDD = By.xpath("//*[@id=\"selectProductSort\"]");
    private By price1 = By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span");
    private By price2 = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span.old-price.product-price");
    private By price3 = By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div/div[3]/div/div[1]/span");
    private By price4 = By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div/div[3]/div/div[1]/span");
    private By price5 = By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div/div[3]/div/div[1]/span");
    private By price6 = By.xpath("//*[@id=\"center_column\"]/ul/li[6]/div/div/div[3]/div/div[1]/span[2]");
    private By price7 = By.xpath("//*[@id=\"center_column\"]/ul/li[7]/div/div/div[3]/div/div[1]/span");
    private List<Integer> prices = new ArrayList<>( );

    public void clickItem(){
        driver.findElement(item).click();
    }

    public void setSortByDD(String value){
        new Select(driver.findElement(sortByDD)).selectByValue(value);
    }

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public List<Integer> orderPrices(){
        prices.add(Integer.parseInt(driver.findElement(price1).getText()));
        prices.add(Integer.parseInt(driver.findElement(price2).getText()));
        prices.add(Integer.parseInt(driver.findElement(price3).getText()));
        prices.add(Integer.parseInt(driver.findElement(price4).getText()));
        prices.add(Integer.parseInt(driver.findElement(price5).getText()));
        prices.add(Integer.parseInt(driver.findElement(price6).getText()));
        prices.add(Integer.parseInt(driver.findElement(price7).getText()));
        return prices;
    }

    public  Boolean isListOrderCorrect() {
        orderPrices();
        for (int i = prices.size(); i >=0 ; i--) {
            if(prices.get(i) < prices.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public ItemPage goToItem() {
        return new ItemPage(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
