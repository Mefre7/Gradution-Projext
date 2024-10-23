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
    private final By username = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");

    private final By nameSignUpField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private final By emailSignUpField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");

    private final By signupPassword= By.id("password");
    private final By signupFirstname= By.id("first_name");
    private final By signupLastname= By.id("last_name");
    private final By signupAddress= By.id("address1");
    private final By signupState= By.id("state");
    private final By signupCity= By.id("city");
    private final By signupZipcode= By.id("zipcode");
    private final By signupMobileNumber= By.id("mobile_number");
    private final By createAccount= By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    private final By continueButton = By.cssSelector("#form > div > div > div > div > a");





    private final By emailLoginField = By.cssSelector("input[data-qa=\"login-email\"]");
    private final By passwordLoginField = By.cssSelector("input[data-qa=\"login-password\"]");

    private final By contactUsHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    private final By productsHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private final By cartHomeButton =By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
    private final By videoTutorialsHomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a");
    private final By HomeButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
    private final By pageLogo = By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
    private final By testCasesHomeButton = By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[5]/a");



    private final By subscriptionEmailField = By.id("susbscribe_email");
    private final By subscribeButton = By.id("subscribe");

    private final By contactUsName = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    private final By contactUsEmail = By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    private final By contactUsSubject = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    private final By contactUsMessage = By.id("message");
    private final By submitButton = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");

    private final By viewProduct2Button= By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/ul/li/a");
    private final By productName = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    private final By condition = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b");
    private final By brand = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b");
    private final By availability = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b");

    private final By searchProductField = By.id("search_product");
    private final By searchProductButton = By.id("submit_search");

    private final By subscriptionMessage = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[1]");

    private final By reviewNameField = By.id("name");
    private final By reviewEmailField = By.id("email");
    private final By reviewField = By.id("review");
    private final By reviewSubmitButton = By.id("button-review");




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

    public void clickViewProduct2(){
        driver.findElement(viewProduct2Button).click();
    }

    public void getProductName(){
        System.out.println(driver.findElement(productName).getText());
    }

    public void verifyDetailsAreVisiable(){
        boolean available = driver.findElement(availability).isDisplayed();
        boolean Condition = driver.findElement(condition).isDisplayed();
        boolean Brand = driver.findElement(brand).isDisplayed();
        System.out.println("visiability of : ");
        System.out.println("Availability detail is: "+available);
        System.out.println("Condition detail is: "+Condition);
        System.out.println("Brand detail is: "+Brand);

    }

    public void searchProduct(String productName){
        driver.findElement(searchProductField).sendKeys(productName);
        driver.findElement(searchProductButton).click();
    }

    public void clickVideoTutorials(){
        driver.findElement(videoTutorialsHomeButton).click();
    }

    public void clickTestCases(){
        driver.findElement(testCasesHomeButton).click();
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

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }


    public void getSubscriptionMessage(){
        System.out.println(driver.findElement(subscriptionMessage).getText());
    }

    public void clickDeleteAccount(){
        driver.findElement(deleteAccount).click();
    }

    public void enterLoginInfo(String loginEmail,String loginPassword){
        driver.findElement(emailLoginField).sendKeys(loginEmail);
        driver.findElement(passwordLoginField).sendKeys(loginPassword);
    }
    public void enterSignUpInfo(String name,String signUpEmail){
        driver.findElement(nameSignUpField).sendKeys(name);
        driver.findElement(emailSignUpField).sendKeys(signUpEmail);
    }

    public void enterSignUpData(String password,String firstname,String lastname,String address,String state,String city,String zipcode,String mobileNumber){
        driver.findElement(signupPassword).sendKeys(password);
        driver.findElement(signupFirstname).sendKeys(firstname);
        driver.findElement(signupLastname).sendKeys(lastname);
        driver.findElement(signupAddress).sendKeys(address);
        driver.findElement(signupState).sendKeys(state);
        driver.findElement(signupCity).sendKeys(city);
        driver.findElement(signupZipcode).sendKeys(zipcode);
        driver.findElement(signupMobileNumber).sendKeys(mobileNumber);
        driver.findElement(createAccount).click();

    }

    public void enterContactUsInfo(String name,String email,String subject,String message){
        driver.findElement(contactUsName).sendKeys(name);
        driver.findElement(contactUsEmail).sendKeys(email);
        driver.findElement(contactUsSubject).sendKeys(subject);
        driver.findElement(contactUsMessage).sendKeys(message);
        driver.findElement(submitButton).click();
    }


    public void subscribe(String subscriptionEmail){
        driver.findElement(subscriptionEmailField).sendKeys(subscriptionEmail);
        driver.findElement(subscribeButton).click();
    }

    public void reviwInfo(String reviewerName,String reviewerEmail,String review){
        driver.findElement(reviewNameField).sendKeys(reviewerName);
        driver.findElement(reviewEmailField).sendKeys(reviewerEmail);
        driver.findElement(reviewField).sendKeys(review);
        driver.findElement(reviewSubmitButton).click();
    }

    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void username(){
        String Username =(driver.findElement(username).getText());
        System.out.println("username is "+Username);
    }





    public void handleAlert(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        //System.out.println(alert.getText());
        alert.accept();
    }

    public void quit(){
        driver.quit();
    }


}

