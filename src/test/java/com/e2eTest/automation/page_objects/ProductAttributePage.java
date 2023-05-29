package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class ProductAttributePage {
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Catalog')]")
	public static WebElement catalog;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Attributes')]")
	public static WebElement attributes;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Product attributes')]")
	public static WebElement productAttributes;
	
	@FindBy(how = How.NAME, using = "checkbox_productattributes")
	public static WebElement checkColor;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td[1]/input[1]")
	public static WebElement checkHdd;
	
	@FindBy(how = How.ID, using = "delete-selected")
	public static WebElement deleteProductAttribute;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Color')]")
	public static WebElement color;
	
	@FindBy(how = How.ID, using = "delete-selected-action-confirmation-submit-button")
	public static WebElement btnYes;
	
	
	public ProductAttributePage() {
	PageFactory.initElements(Setup.getDriver(), this);
	}
}
