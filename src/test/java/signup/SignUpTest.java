package signup;

import Pages.SignInPage;
import Pages.SignUpPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpTest extends BaseTests {

    @Test
    public void FillInFields(){
        SignInPage signInPage = homePage.clickSignIn();
        SignUpPage signUpPage = signInPage.clickSignUp("davit_martiro@gmail.com");
        signUpPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        signUpPage.setGenderRadioBtn();
        signUpPage.setFirstNameField("Petros");
        signUpPage.setLastNameField("Simonyan");
        signUpPage.setPassword("1122334455");
        signUpPage.setBirthDateDropdownDay("4");
        signUpPage.setBirthDateDropdownMonth("10");
        signUpPage.setBirthDateDropdownYear("2009");
        signUpPage.setAddressFirstName("Petros");
        signUpPage.setAddressLastName("Simonyan");
        signUpPage.setCompanyField("Bet.am");
        signUpPage.setAddressField("Kilikia");
        signUpPage.setCityField("Huston");
        signUpPage.setStateDropDown("43");
        signUpPage.setZipcodeField("00000");
        signUpPage.setMobileField("055305524");
        Assert.assertTrue(signUpPage.pressRegisterBtn());
        Assert.assertTrue(signUpPage.confirmRegistration());
    }
}
