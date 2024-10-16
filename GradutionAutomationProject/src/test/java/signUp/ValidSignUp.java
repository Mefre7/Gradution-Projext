package signUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

public class ValidSignUp {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Create an instance of HomePage with WebDriver
        HomePage homePage=new HomePage(driver);
        homePage.implicitWait();
        // Open the website
        homePage.openWebsite("https://automationexercise.com/");
        homePage.clickSignUpLogin();
        homePage.enterLoginInfo("project@tmail.ws","123");
        homePage.clickLogin();

}}
