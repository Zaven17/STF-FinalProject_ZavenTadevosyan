package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {


    private WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    //Personal Info Elements
    private By genderRadioBtn = By.xpath("//*[@id=\"id_gender1\"]");
    private By firstNameField = By.xpath("//*[@id=\"customer_firstname\"]");
    private By lastNameField = By.xpath("//*[@id=\"customer_lastname\"]");
    private By password = By.xpath("//*[@id=\"passwd\"]");
    private By birthDateDropdownDay = By.xpath("//*[@id=\"days\"]");
    private By birthDateDropdownMonth = By.xpath("//*[@id=\"months\"]");
    private By birthDateDropdownYear = By.xpath("//*[@id=\"years\"]");
    //Your address Elements
    private By addressFirstName = By.xpath("//*[@id=\"firstname\"]");
    private By addressLastName = By.xpath("//*[@id=\"lastname\"]");
    private By companyField = By.xpath("//*[@id=\"company\"]");
    private By addressField = By.xpath("//*[@id=\"address1\"]");
    private By cityField = By.xpath("//*[@id=\"city\"]");
    private By stateDropDown = By.xpath("//*[@id=\"id_state\"]");
    private By zipcodeField = By.xpath("//*[@id=\"postcode\"]");
    private By mobileField = By.xpath("//*[@id=\"phone_mobile\"]");
    private By registerBtn = By.xpath("//*[@id=\"submitAccount\"]/span");
    private By heading = By.xpath("//*[@id=\"center_column\"]/h1");
    private By registeredPageObj = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    //Personal Info Setters
    public void setGenderRadioBtn(){
        driver.findElement(genderRadioBtn).click();
    }
    public void setFirstNameField(String name){
        driver.findElement(firstNameField).sendKeys(name);
    }
    public void setLastNameField(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setPassword(String pswrd){
        driver.findElement(password).sendKeys(pswrd);
    }
    public void setBirthDateDropdownDay(String value){
        new Select(driver.findElement(birthDateDropdownDay)).selectByValue(value);
    }
    public void setBirthDateDropdownMonth(String value){
        new Select(driver.findElement(birthDateDropdownMonth)).selectByValue(value);
    }
    public void setBirthDateDropdownYear(String value){
        new Select(driver.findElement(birthDateDropdownYear)).selectByValue(value);
    }

    //Your Address Setters
    public void setAddressFirstName(String firstName){
        driver.findElement(addressFirstName).sendKeys(firstName);
    }
    public void setAddressLastName(String lastName){
        driver.findElement(addressLastName).sendKeys(lastName);
    }
    public void setCompanyField(String companyName){
        driver.findElement(companyField).sendKeys(companyName);
    }
    public void setAddressField(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void setCityField(String cityName){
        driver.findElement(cityField).sendKeys(cityName);
    }
    public void setStateDropDown(String value){
        new Select(driver.findElement(stateDropDown)).selectByValue(value);
    }
    public void setZipcodeField(String zipcode){
        driver.findElement(zipcodeField).sendKeys(zipcode);
    }
    public void setMobileField(String mobileNum){
        driver.findElement(mobileField).sendKeys(mobileNum);
    }
    public boolean pressRegisterBtn(){
        driver.findElement(registerBtn).click();
        return true;
    }
    public String getHeadingTxt(){
       return driver.findElement(heading).getText();
    }
    public Boolean confirmRegistration(){
        driver.findElement(registeredPageObj);
        return true;
    }


















}
