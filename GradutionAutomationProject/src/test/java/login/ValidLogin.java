package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ValidLogin {
    @Test
    public static void main(String[] args) {
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
        String expected="https://automationexercise.com/";
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
}}
