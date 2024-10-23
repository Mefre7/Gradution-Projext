

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class ReviewOnProduct extends OpenWebsite {
    @Test
    public static void productsPage(){
        HomePage homePage=new HomePage(OpenWebsite.driver);
        homePage.clickProducts();
        String url = OpenWebsite.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://automationexercise.com/products","invalid test case");
        System.out.println(OpenWebsite.driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2")).getText());
        homePage.clickViewProduct2();
        homePage.getProductName();
        String review = OpenWebsite.driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")).getText();
        Assert.assertEquals(review,"WRITE YOUR REVIEW","not visible");
        homePage.reviwInfo("ahmed","ads@as","product is good");
        String reviewMessage = OpenWebsite.driver.findElement(By.id("review-section")).getText();
        Assert.assertEquals(reviewMessage,"Thank you for your review.","invalid test case");
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }

}
