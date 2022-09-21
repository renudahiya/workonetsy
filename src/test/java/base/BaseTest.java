package base;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
private WebDriver driver;
private Eyes eyes;
protected HomePage homePage;


@BeforeClass
    public void setUp(){
   // System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
   Properties props=System.getProperties();
   try{
       props.load(new FileInputStream(new File("resources/test.properties")));
   }
   catch(Exception e){
       e.printStackTrace();
       System.exit(-1);
   }
   //initiate eyes
    eyes=new Eyes();
   eyes.setApiKey(System.getProperty("applitools.api.key"));

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
    System.out.println("Testing has done!");
}

@AfterClass
    public void tearDown() {
eyes.abortIfNotClosed();
    driver.quit();
}

public void validateWindow(){
    eyes.open(driver,"Etsy","testUsingApplitoolsEyes");
    eyes.checkWindow();
    eyes.close();
}
}
