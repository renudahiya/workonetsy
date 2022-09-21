package base;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToBasketPage;
import pages.CartPage;
import pages.WallArtPage;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class WallArtImageClickTest extends BaseTest{


    @Test
    public void testAddToCart(){
    WallArtPage page=homePage.clickWallArtImage();
    System.out.println("I am testing!");
        AddToBasketPage basketPage=page.clickShopThisItem();
        CartPage cartPage=basketPage.clickAddToBasket();

        Assert.assertTrue(cartPage.isHeadingDisplayed(),"Heading is not displayed");
       assertEquals(cartPage.getHeadingText(),"1 item in your basket",
             "heading does not match");

}
    @Test
    public void testUsingApplitoolsEyes(){
    WallArtPage page=homePage.clickWallArtImage();
    System.out.println("I am testing using Applitools Eyes!");
    AddToBasketPage basketPage=page.clickShopThisItem();
    CartPage cartPage=basketPage.clickAddToBasket();
    validateWindow();

}
}
