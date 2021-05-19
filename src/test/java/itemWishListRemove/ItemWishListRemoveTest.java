package itemWishListRemove;

import Pages.SignInPage;
import Pages.SignedInPage;
import Pages.WishListPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ItemWishListRemoveTest extends BaseTests {
    @Test
    public void itemWishListRemoveTest(){
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.signIn();
        signInPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SignedInPage signedInPage = signInPage.signedInPage();
        signedInPage.clickMyWishlists();
        signedInPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WishListPage wishListPage = signedInPage.goWishlistPage();
        wishListPage.clickWishLIstBtn();
        wishListPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(wishListPage.clickRemoveBtn());
    }
}
