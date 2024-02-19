import org.configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;
import org.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SwaceTest extends BaseClass {

	@Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterusername("standard_user");
     loginPage.enterPassword("secret_sauce");
        loginPage.clicklogin();

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Swag Labs");
    }
	
	@Test
    public void testInvalidLogin() {
       LoginPage loginPage = new LoginPage(driver);
        loginPage.enterusername("invalid_user");
        loginPage.enterPassword("invalid_password");
        loginPage.clicklogin();

        String errorMessage = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3[@data-test='error']")).getText();
        Assert.assertTrue(errorMessage.contains("Epic sadface: Username and password do not match any user in this service"));
    }
	@Test
    public void CheckInventoryOptions() {
		 LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterusername("standard_user");
	     loginPage.enterPassword("secret_sauce");
	        loginPage.clicklogin();

        ProductPage productPage = new ProductPage(driver);
        productPage.clickInventoryLink();
        productPage.clickAboutLink();
        productPage.clickLogoutLink();
        WebElement Logo = driver.findElement(By.xpath("//div[@class='header_label']/div[@class='app_logo']"));
        Assert.assertEquals(Logo, "Swag Labs");
    }
	

    @Test
    public void testAddToCart() {
       

        ProductPage productPage = new ProductPage(driver);
        productPage.clickInventoryLink();
        productPage.clickAboutLink();

        productPage.addtoCart();

        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("Added to cart"));
        driver.switchTo().alert().accept();
    }
}
	

