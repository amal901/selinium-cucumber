package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class LogoutPage {

	@CacheLookup
	@FindBy(how = How.LINK_TEXT, using= "Logout")
	public static WebElement logout;
	
	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		}
	
	public void clickOnLogoutBtn(){
		logout.click();
	}
	
}
