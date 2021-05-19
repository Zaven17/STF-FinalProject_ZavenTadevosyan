package itemWishlistAdd;

import Pages.*;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ItemWishlistAddTest extends BaseTests {

    @Test
    public void testAddedSuccessfully(){
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.signIn();
        SignedInPage signedInPage = signInPage.signedInPage();
        signedInPage.search("Faded Short Sleeve T-shirts");
        signedInPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SearchResultPage searchResultPage = signedInPage.goToSearchResultPage();
        searchResultPage.clickItem();
        searchResultPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ItemPage item = searchResultPage.goToItem();
        Assert.assertTrue(item.addToWishListClick());
        Assert.assertEquals(item.getSuccesfullMsg(), "Added to your wishlist.");

    }

}

