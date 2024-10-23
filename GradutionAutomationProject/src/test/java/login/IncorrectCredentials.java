import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class IncorrectCredentials extends OpenWebsite {
    @Test
    public void incorrectCredentials() {
        HomePage homePage=new HomePage(driver);
        homePage.clickSignUpLogin();
        homePage.enterLoginInfo("project@tmail.ws","123444");
        homePage.clickLogin();
        String expected = "Your email or password is incorrect!";
        String actual = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p")).getText();
        Assert.assertEquals(actual,expected,"invalid test case");
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
