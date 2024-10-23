
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestCasePage extends OpenWebsite {
    @Test
    public static void testCasePage(){
        HomePage homePage=new HomePage(driver);
        homePage.clickTestCases();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://automationexercise.com/test_cases","invalid test case");
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
