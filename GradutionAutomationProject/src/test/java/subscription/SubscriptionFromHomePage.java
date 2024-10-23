import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionFromHomePage extends OpenWebsite {
    @Test
    public void subscriptionFromHomePage() {
        HomePage homePage=new HomePage(OpenWebsite.driver);
        homePage.subscribe("adf@sdsv");
        homePage.getSubscriptionMessage();

    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(OpenWebsite.driver);
        homePage.quit();
    }
}

