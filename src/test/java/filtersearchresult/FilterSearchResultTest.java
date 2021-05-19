package filtersearchresult;

import Pages.SearchPage;
import Pages.SearchResultPage;
import Pages.SignInPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

public class FilterSearchResultTest extends BaseTests {

    @Test
    public void testFilter(){
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.signIn();
        SearchPage searchPage = signInPage.searchPageInstance();
        searchPage.search("Dress");
        SearchResultPage searchResultPage = searchPage.goToSearchResultPage();
        searchResultPage.setSortByDD("price:asc");
        searchResultPage.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(searchResultPage.isListOrderCorrect());
    }
}
