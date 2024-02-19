package org.pages;

import org.configuration.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BaseClass {
	
	//WebElement representing the username input field.
	
	@FindBy(id="user-name") private WebElement userName;
	
	//WebElement representing the Password input field.
	
		@FindBy(id="password") private WebElement password;
		
	//WebElement representing the login button 
		
			@FindBy(id="login-button") private WebElement submit;
	
			public LoginPage(WebDriver driver){
				PageFactory.initElements(driver, this);
			}
			//To Enter userName in username input field 
		public void enterusername(String UserName)
		{
			userName.sendKeys(UserName);
		}
			
		//To Enter pasword in password input field 
		public void enterPassword(String Password) {
			password.sendKeys(Password);
	    }	
		
		//To click submit button
		public void clicklogin()
				{
					submit.click();
				}		
				
}
