package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage1 {
	
	 @FindBy(id = "first-name")
	    private WebElement firstName;

	 
	  @FindBy(id = "last-name")
	    private WebElement lastName;
	  
	  @FindBy(id = "postal-code")
	    private WebElement postalCode;
	  
	  @FindBy(id = "continue")
	    private WebElement continueButton;
	  
	  public void CheckOutPage1(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

	  public void enterFirstName(String firstNameValue )
	  {
		  firstName.sendKeys("bincy");
	  }

	  public void enterlastName(String lastNameValue )
	  {
		  lastName.sendKeys("Maria");
	  }
	  
	  public void enterpostalCode(String postalCodeValue )
	  {
		  postalCode.sendKeys("chennai");
	  }
	  public void clickContinue() {
	        continueButton.click();
	    }
	  
	  
}
