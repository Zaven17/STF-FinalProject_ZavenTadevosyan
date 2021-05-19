package cart;

import Pages.CartPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CartTest extends BaseTests {

    @Test
    public void testCartBtn(){
        CartPage cartPage = homePage.clicCartPage();
        cartPage.clickCategories();
        cartPage.clickCheckOut();
    }
}
