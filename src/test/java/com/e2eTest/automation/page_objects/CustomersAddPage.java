package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class CustomersAddPage {
	
	@FindBy(how = How.LINK_TEXT, using = "Customers")
	public static WebElement customersNav;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]")
	public static WebElement customerNav;
	
	@FindBy(how = How.LINK_TEXT, using = "Add new")
	public static WebElement addNew;
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement emailCustomer;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement passwordCustomer;
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement firstNameCustomer;
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement lastNameCustomer;
	
	@FindBy(how = How.ID, using = "Gender_Female")
	public static WebElement genderFemale;
	
	@FindBy(how = How.ID, using = "DateOfBirth")
	public static WebElement dateOfBirth;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div/input")
	public static WebElement newsletterCustomer;
	
	@FindBy(how = How.ID, using = "f66180d4-5b32-4633-8748-5b9fea9d76ed")
	public static WebElement testStore;
	
	@FindBy(how = How.ID, using = "VendorId")
	public static WebElement vendorId;
	
	@FindBy(how = How.ID, using = "AdminComment")
	public static WebElement adminComment;	
	
	@FindBy(how = How.NAME, using = "save-continue")
	public static WebElement btnSave;
	
	@FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]")
	public static WebElement messageAllertCustomer;	
	
	
	public CustomersAddPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		}
	
}
