import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class ValidLogin extends logged {
    @Test
    public  void validLogin() {
        String expected="https://automationexercise.com/";
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,expected,"invalid test case");
        HomePage homePage=new HomePage(driver);
        homePage.username();
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }

}
