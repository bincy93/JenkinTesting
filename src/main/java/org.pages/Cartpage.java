package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	 @FindBy(id = "remove-sauce-labs-backpack")
	    private WebElement remove_item;
	 
	 @FindBy(id = "checkout")
	    private WebElement checkout;

	 
	 public Cartpage(WebDriver driver) {

	        PageFactory.initElements(driver, this);
	    }
	 
	 
	 public void removeItemFromCart() {
	        remove_item.click();
	    }

	 
	 public void proceedToCheckout() {
	        checkout.click();
	    }


}
