import org.testng.annotations.AfterTest;
import pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
public class ExistedEmailSignUp extends OpenWebsite {
    @Test
    public static void existedEmailSignUp ()  {
        HomePage homePage=new HomePage(driver);
        homePage.clickSignUpLogin();
        homePage.enterSignUpInfo("john","project@tmail.ws");
        homePage.clickSignup();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p")).getText());
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
