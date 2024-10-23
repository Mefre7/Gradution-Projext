import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;


public class Logout extends logged {
    @Test
    public void logout(){
        HomePage homePage= new HomePage(driver);
        homePage.clickLogout();
        String expected = "https://automationexercise.com/login";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
