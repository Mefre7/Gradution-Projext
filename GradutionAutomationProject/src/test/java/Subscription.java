import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Subscription {
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
        homePage.subscribe("adf@sdsv");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[1]")).getText());



    }}

