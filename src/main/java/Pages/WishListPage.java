package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {
    private WebDriver driver;
    private By wishlistBtn = By.xpath("//*[@id=\"wishlist_33307\"]/td[1]/a");
    private By removeBtn = By.xpath("//*[@id=\"wlp_1_1\"]/div/div[2]/div/a");


    public WebDriver getDriver() {
        return driver;
    }

    public void clickWishLIstBtn(){
        driver.findElement(wishlistBtn).click();
    }
    public Boolean clickRemoveBtn(){
        driver.findElement(removeBtn).click();
        return true;
    }
    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }
}
