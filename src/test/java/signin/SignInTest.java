package signin;

import Pages.SignInPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class SignInTest extends BaseTests {

    @Test
    public void testSuccessfulSignIn(){
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.setSignInField("ztadevos@yahoo.com");
        signInPage.setPassword("112233445566");
        signInPage.clickLoginButton();
    }
}
