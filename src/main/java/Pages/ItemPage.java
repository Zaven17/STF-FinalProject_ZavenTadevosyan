package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {
    private WebDriver driver;
    private By addToWishListBtn = By.xpath("//*[@id=\"wishlist_button\"]");

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean addToWishListClick(){
        driver.findElement(addToWishListBtn).click();
        return true;
    }
    public String getSuccesfullMsg(){
        return driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div/div/p")).getText();
    }
}
