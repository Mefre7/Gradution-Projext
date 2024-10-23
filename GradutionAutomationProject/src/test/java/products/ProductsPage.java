
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class ProductsPage extends OpenWebsite {
    @Test
    public static void productsPage(){
        HomePage homePage=new HomePage(OpenWebsite.driver);
        homePage.clickProducts();
        String url = OpenWebsite.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://automationexercise.com/products","invalid test case");
        System.out.println(OpenWebsite.driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2")).getText());
        homePage.clickViewProduct2();
        String url2 = OpenWebsite.driver.getCurrentUrl();
        Assert.assertEquals(url2,"https://automationexercise.com/product_details/2","invalid test case");
        homePage.getProductName();
        homePage.verifyDetailsAreVisiable();
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }
}
