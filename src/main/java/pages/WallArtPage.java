package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WallArtPage {
    private WebDriver driver;
    private By shopThisItem=By.cssSelector("a.wt-btn.wt-btn--outline.wt-pl-xs-7");

    public WallArtPage(WebDriver driver){
        this.driver=driver;
    }
    public AddToBasketPage clickShopThisItem(){
        driver.findElement(shopThisItem).click();
        return new AddToBasketPage(driver);
    }


}
