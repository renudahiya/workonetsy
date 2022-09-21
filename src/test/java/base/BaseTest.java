package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
private WebDriver driver;
protected HomePage homePage;


@BeforeClass
    public void setUp(){
    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
goHome();
}

@BeforeMethod
    public void goHome(){
driver.get("https://www.etsy.com/in-en/");
homePage=new HomePage(driver);
}

@AfterMethod
    public void printMessage(){
    System.out.println("Test has done!");
}

@AfterClass
    public void tearDown() throws Exception{

    driver.quit();
}
}
