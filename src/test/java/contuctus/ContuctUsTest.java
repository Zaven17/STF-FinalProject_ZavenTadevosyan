package contuctus;

import Pages.ContactUsPage;
import Pages.SignInPage;
import Pages.SignedInPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContuctUsTest extends BaseTests {

    @Test
    public void testContuctUs() {
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.signIn();
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.setSubjHeadingDropDown("1");
        contactUsPage.setOrderReference("0");
        contactUsPage.setMessageField("Professor, i am very sorry for submitting late, " +
                "I had 3 huge deadlines the same day as yours, and unfortunately because of " +
                "the stress did not manage to submit any of those on time :D ");
        Assert.assertTrue(contactUsPage.clickSendBtn());
        Assert.assertEquals(contactUsPage.getSuccMesage(),
                "Your message has been successfully sent to our team.");

    }
}
