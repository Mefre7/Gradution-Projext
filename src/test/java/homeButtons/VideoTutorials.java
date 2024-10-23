
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class VideoTutorials extends OpenWebsite{
    @Test
    public static void videoTutorials(){
        HomePage homePage=new HomePage(driver);
        homePage.clickVideoTutorials();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.youtube.com/c/AutomationExercise","invalid test case");
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
