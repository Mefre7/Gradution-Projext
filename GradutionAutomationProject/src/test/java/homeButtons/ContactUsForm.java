
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class ContactUsForm extends OpenWebsite {
    @Test
    public static void contactUs(){
        HomePage homePage=new HomePage(OpenWebsite.driver);
        homePage.clickContactUs();
        homePage.enterContactUsInfo("john","email12345@teml.net","hi","hello");
        homePage.handleAlert();
        String expected="Success! Your details have been submitted successfully.";
        String actual= OpenWebsite.driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")).getText();
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
        OpenWebsite.driver.findElement(By.xpath("//*[@id=\"form-section\"]/a/span/i")).click();
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }

}
