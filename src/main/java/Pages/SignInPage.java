package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By signInField = By.id("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    private By createAnAccountbtn = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    private By emailSignUpField = By.xpath("//*[@id=\"email_create\"]");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSignInField(String username){
        driver.findElement(signInField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public SignUpPage clickSignUp(String email){
        driver.findElement(emailSignUpField).sendKeys(email);
        driver.findElement(createAnAccountbtn).click();
        return new SignUpPage(driver);
    }
    public SearchPage SearchBtn(){
        return new SearchPage(driver);
    }

    public SignedInPage signedInPage(){
        return new SignedInPage(driver);
    }

    public void signIn(){
        setSignInField("ztadevos@gmail.com");
        setPassword("1122334455");
        clickLoginButton();
    }
    public void setEmailForSignUp(String email){
        driver.findElement(emailSignUpField).sendKeys(email);
    }
}
