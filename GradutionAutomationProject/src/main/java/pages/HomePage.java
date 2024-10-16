package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;

    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //locators
    private final By signUpLoginHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private final By logoutButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private final By deleteAccount = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private final By loginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private final By signupButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    private final By nameSignUpField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private final By emailSignUpField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");

    private final By emailLoginField = By.cssSelector("input[data-qa=\"login-email\"]");
    private final By passwordLoginField = By.cssSelector("input[data-qa=\"login-password\"]");

    private final By contactUsHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    private final By productsHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private final By cartHomeButton =By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
    private final By videoTutorialsHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a");
    private final By HomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    private final By pageLogo = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");

    private final By subscriptionEmailField = By.id("susbscribe_email");
    private final By subscribeButton = By.id("subscribe");


    //Methods
    public void openWebsite(String website){
        driver.manage().window().maximize();
        driver.get(website);
    }


    public void clickSignUpLogin(){
        driver.findElement(signUpLoginHomeButton).click();
    }
    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }

    public void clickCart(){
        driver.findElement(cartHomeButton).click();
    }

    public void clickContactUs(){
        driver.findElement(contactUsHomeButton).click();
    }

    public void clickHome(){
        driver.findElement(HomeButton).click();
    }

    public void clickProducts(){
        driver.findElement(productsHomeButton).click();
    }

    public void clickVideoTutorials(){
        driver.findElement(videoTutorialsHomeButton).click();
    }

    public void clickLogo(){
        driver.findElement(pageLogo).click();
    }


    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void clickSignup(){
        driver.findElement(signupButton).click();
    }

    public void enterLoginInfo(String loginEmail,String loginPassword){
        driver.findElement(emailLoginField).sendKeys(loginEmail);
        driver.findElement(passwordLoginField).sendKeys(loginPassword);
    }
    public void enterSignUpInfo(String name,String signUpEmail){
        driver.findElement(nameSignUpField).sendKeys(name);
        driver.findElement(emailSignUpField).sendKeys(signUpEmail);
    }
    public void subscribe(String subscriptionEmail){
        driver.findElement(subscriptionEmailField).sendKeys(subscriptionEmail);
        driver.findElement(subscribeButton).click();


    }



    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }





    public void handleAlert(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();
    }










    /*
        driver.findElement(By.cssSelector("#top > div > div.nav.float-end > ul > li:nth-child(2) > div > a > i.fa-solid.fa-caret-down")).click();
        //we wait until the cover appears so we can apply the next command
        driver.findElement(By.cssSelector("#top > div > div.nav.float-end > ul > li:nth-child(2) > div > ul > li:nth-child(1) > a")).click();

         */

}

