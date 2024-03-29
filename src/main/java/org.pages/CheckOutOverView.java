package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverView {
	
	@FindBy(id = "finish")
    private WebElement finish;
	
	  public CheckOutOverView(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
	  
	  public void checkout()
	  {
		  finish.click();
	  }


}
