package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    private WebDriver driver;
    private By subjHeadingDropDown = By.xpath("//*[@id=\"id_contact\"]");
    private By orderReference = By.xpath("//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select");
    private By messageField = By.xpath("//*[@id=\"message\"]");
    private By chooseFile = By.xpath("//*[@id=\"uniform-fileUpload\"]/span[2]");
    private By sendBtn = By.xpath("//*[@id=\"submitMessage\"]/span");
    private By successmsg = By.xpath("//*[@id=\"center_column\"]/p");

    public void setSubjHeadingDropDown(String value){
        new Select(driver.findElement(subjHeadingDropDown)).selectByValue(value);
    }
    public void setOrderReference(String value){
        new Select(driver.findElement(orderReference)).selectByValue(value);
    }
    public void setMessageField(String input){
        driver.findElement(messageField).sendKeys(input);
    }
    public void  clickChooseFile(){
        driver.findElement(chooseFile).click();
    }
    public Boolean clickSendBtn(){
        driver.findElement(sendBtn).click();
        return true;
    }
    public String getSuccMesage(){
        return driver.findElement(successmsg).getText().toString();
    }
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }
}
