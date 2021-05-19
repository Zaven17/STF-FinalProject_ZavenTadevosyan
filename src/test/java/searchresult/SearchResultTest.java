package searchresult;

import Pages.SearchPage;
import Pages.SearchResultPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class SearchResultTest extends BaseTests {
    @Test
    public void TestSearchResultPage(){
        SearchResultPage searchResultPage = searchPage.goToSearchResultPage();
    }
}
