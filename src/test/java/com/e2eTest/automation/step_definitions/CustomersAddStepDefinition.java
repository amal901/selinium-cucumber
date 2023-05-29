package com.e2eTest.automation.step_definitions;


import org.openqa.selenium.By;

import com.e2eTest.automation.page_objects.CustomersAddPage;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersAddStepDefinition {
	public CustomersAddPage customersAddPage;
	private SeleniumUtils seleniumUtils;
	private SelectFromListUtils selectFromListUtils;
	private Validations validation;
	public CustomersAddStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		customersAddPage = new CustomersAddPage();
		selectFromListUtils = new SelectFromListUtils();
		validation = new Validations();
	}
	
	@When("Je clique sur Customers dans la barre gauche")
	public void jeCliqueSurCustomersDansLaBarreGauche() {
		seleniumUtils.click(CustomersAddPage.customersNav);
	}
	
//	@When("Je clique sur Customers dans la barre gauche")
//	public void jeCliqueSurCustomersDansLaBarreGauche() {
//		seleniumUtils.clickOnElementUsingJs((By) CustomersAddPage.customersNav);
//	}
	@When("Je clique sur Customer")
	public void jeCliqueSurCustomer() {
		seleniumUtils.click(CustomersAddPage.customerNav);
	}
	@When("Je clique sur le bouton Add New")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CustomersAddPage.addNew);
	}
	@When("Je saisis l email {string}")
	public void jeSaisisLEmailTestGmailCom(String customeremail) {
	    seleniumUtils.writeText(CustomersAddPage.emailCustomer, customeremail);
	}
	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String customerpassword) {
		seleniumUtils.writeText(CustomersAddPage.passwordCustomer, customerpassword);
	}
	@When("Je saisis First name {string}")
	public void jeSaisisFirstName(String firstNameCustomer) {
		seleniumUtils.writeText(CustomersAddPage.firstNameCustomer, firstNameCustomer);
	}
	@When("Je saisis Last name {string}")
	public void jeSaisisLastName(String lastNameCustomer) {
		seleniumUtils.writeText(CustomersAddPage.lastNameCustomer, lastNameCustomer);
	}
	@When("Je coche Female")
	public void jeCocheFemale() {
		seleniumUtils.click(CustomersAddPage.genderFemale);
	}
	@When("Je saisis la date {string}")
	public void jeSaisisLaDate(String dateOfBirth) {
		seleniumUtils.writeText(CustomersAddPage.dateOfBirth, dateOfBirth);
	}
	@When("Je selectionne Text store dans Newsletter {string} {string}")
	public void jeChoisisTextStoreDansNewsletter(String newsletter1, String newsletter2){
		seleniumUtils.autoSuggest(CustomersAddPage.newsletterCustomer, newsletter1, newsletter2);
		//seleniumUtils.clickOnElementUsingJs((By) CustomersAddPage.newsletterCustomer);
	}
	@When("Je selectionne Vendor 1 dans manager of Vendors")
	public void jeSelectionneVendorDansManagerOfVendors() {
		selectFromListUtils.selectDropDownListByIndex(CustomersAddPage.vendorId, 2);
	}
	@When("Je saisis un commentaire {string}")
	public void jeSaisisUnCommentaireAdminComment(String adminComment) {
		seleniumUtils.writeText(CustomersAddPage.adminComment, adminComment);
	}
	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CustomersAddPage.btnSave);
	}
	@Then("le message de succees {string} doit s afficher")
	public void leMessageDeSuccesDoitSAfficher(String messageCustomer) {
		validation.assertTrue(CustomersAddPage.messageAllertCustomer, messageCustomer);
	}

}
