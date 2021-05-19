package search;

import Pages.SearchPage;
import Pages.SearchResultPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTests {
    @Test
    public void testSuccessfulSearch(){
        SearchPage searchPage = homePage.SearchBtn();
        searchPage.search("Printed Chiffon");
    }
}
