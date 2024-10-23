

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionFromCartPage extends OpenWebsite {
    @Test
    public void subscriptionFromCartPage() {
        HomePage homePage=new HomePage(OpenWebsite.driver);
        homePage.clickCart();
        homePage.subscribe("adf@sdsv");
        homePage.getSubscriptionMessage();
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}

