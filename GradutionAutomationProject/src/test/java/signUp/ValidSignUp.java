import net.bytebuddy.build.Plugin;
import org.apache.hc.core5.reactor.Command;
import org.checkerframework.common.subtyping.qual.Bottom;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;

public class ValidSignUp extends OpenWebsite {
    @Test
    public static void validSignUp1() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpLogin();
        homePage.enterSignUpInfo("john", "email12345@teml.net");
        homePage.clickSignup();
        String expected = "https://automationexercise.com/signup";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
    }

    @AfterTest
    public static void validSignUp2() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSignUpData("123456789", "john", "cena", "cairo", "cairo", "cairo", "11765", "0100");
        String expected = "https://automationexercise.com/account_created";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        homePage.clickContinueButton();
        homePage.clickDeleteAccount();
        homePage.clickContinueButton();
        homePage.quit();
    }
}

