package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class CartPage {
    private WebDriver driver;
    private By headingText= By.cssSelector("div.wt-display-flex-xs" +
            ".wt-justify-content-space-between.wt-align-items-center." +
            "wt-mt-xs-2 h1.wt-text-heading-01");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean isHeadingDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(headingText));
        return driver.findElement(headingText).isDisplayed();

    }

    public String getHeadingText(){
       String heading= driver.findElement(headingText).getText();
       return heading;
    }

}
