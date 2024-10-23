import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class OpenWebsite {
    static WebDriver driver;
    @BeforeMethod
    public void openWebsite (){
        driver= new ChromeDriver();
        //Create an instance of HomePage with WebDriver
        HomePage homePage=new HomePage(driver);
        homePage.implicitWait();
        // Open the website
        homePage.openWebsite("https://automationexercise.com/");
    }

}
