import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchProduct extends OpenWebsite{
    @Test
    public static void productsPage(){
        HomePage homePage=new HomePage(driver);
        homePage.clickProducts();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://automationexercise.com/products","invalid test case");
        homePage.searchProduct("women");
        int numberOfProducts = driver.findElements(By.className("col-sm-4")).size();
        System.out.println("number Of Products is: "+ (numberOfProducts-1)+" products");
    }
    @AfterTest
    public void terminate(){
        HomePage homePage=new HomePage(driver);
        homePage.quit();
    }

}
