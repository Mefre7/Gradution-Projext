

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class BlankFieldsLogin extends OpenWebsite {
    @Test
    public void blankFieldsLogin() {
        HomePage homePage=new HomePage(driver);
        homePage.clickSignUpLogin();
        homePage.clickLogin();
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://automationexercise.com/","please fill input fields");
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
