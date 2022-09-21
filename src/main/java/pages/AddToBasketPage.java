package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasketPage {
    private WebDriver driver;
    private By addToBasket= By.cssSelector("div.wt-width-full button.wt-btn.wt-btn--filled.wt-width-full");
    public AddToBasketPage(WebDriver driver){
        this.driver=driver;
    }
    public CartPage clickAddToBasket() {
        driver.findElement(addToBasket).click();
        return new CartPage(driver);
    }

}
