package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	///WebElement representing the "View Cart" link.
    
	@FindBy(className = "shopping_cart_link")
	private WebElement viewCart;
	
	
	//WebElement representing the "addtoCart" link.
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtoCart;
	//WebElement representing the "inventorylink" link.
	@FindBy(className = "bm-burger-button")
	    private WebElement inventory_link;
	//WebElement representing the "about" link.
	    @FindBy(id = "about_sidebar_link")
	    private WebElement about_link;
	  //WebElement representing the "logout" link.
	    
	    @FindBy(id = "logout_sidebar_link")
	    private WebElement logout_link;

	  //WebElement representing the "rest" link.
	    
	    @FindBy(id = "reset_sidebar_link")
	    private WebElement reset_link;
	    
	    
	  //Initialize productpage with webdriver  
	    
	    public ProductPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void clickViewCart() {
	        viewCart.click();
	    }
	    
	    public void addtoCart() {
	    	addtoCart.click();
	    }
	    
	    public void clickInventoryLink() {
	        inventory_link.click();
	    }
	    public void clickAboutLink() {
	        about_link.click();
	    }
	    
	    public void clickLogoutLink() {
	        logout_link.click();
	    }
	    
	    public void clickResetLink() {
	        reset_link.click();
	    }
	    


}
