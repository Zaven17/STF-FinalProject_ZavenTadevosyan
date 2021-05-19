package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignedInPage {
    private WebDriver driver;
    private By searchField = By.xpath("//*[@id=\"search_query_top\"]");
    private By myWishlistBtn = By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span");


    public SearchResultPage goToSearchResultPage(){
        return new SearchResultPage(driver);
    }
    public WishListPage goWishlistPage(){
        return new WishListPage(driver);
    }

    public void search(String searchItem){
        WebElement s = driver.findElement(searchField);
        s.sendKeys(searchItem);
        s.submit();
    }
    public void clickMyWishlists(){
        driver.findElement(myWishlistBtn).click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public SignedInPage(WebDriver driver) {
        this.driver = driver;
    }
}
