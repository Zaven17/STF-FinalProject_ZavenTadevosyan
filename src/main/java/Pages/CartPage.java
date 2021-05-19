package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkOutBtn = By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span");
    private By categories = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/div");
    private By womenCategory = By.linkText("Women");
    private By dressesCategory = By.linkText("Dresses");
    private By tshirtCategory = By.linkText("T-shirts");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCheckOut(){
        driver.findElement(checkOutBtn).click();
    }
    public void clickCategories(){
        driver.findElement(categories).click();
    }
    public void clickWomenCategory(){
        driver.findElement(womenCategory).click();
    }
    public void clickDressesCategory(){
        driver.findElement(dressesCategory).click();
    }
    public void clickTshirtCategory(){
        driver.findElement(tshirtCategory).click();
    }
}
