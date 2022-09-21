package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By wallArtImageLink=By.cssSelector("main#content ul.wt-grid li:nth-child(1)");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public WallArtPage clickWallArtImage(){
        driver.findElement(wallArtImageLink).click();
        return new WallArtPage(driver);

    }
}
