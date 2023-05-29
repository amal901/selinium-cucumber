package com.e2eTest.automation.step_definitions;

import java.time.Duration;

import org.json.simple.JSONObject;

import com.e2eTest.automation.page_objects.VendorPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VendorStepDefinition {
	private static SeleniumUtils seleniumUtils = new SeleniumUtils();
	static JSONObject object = seleniumUtils.JsonData(0);
	private static long mediumWait = Long.valueOf((String) object.get("MediumWait"));
	private VendorPage vendorPage;
	private Validations validation;
	private Wait wait;
	
	public VendorStepDefinition() {
	vendorPage = new VendorPage();
	validation = new Validations();
	//wait = new Wait(Setup.getDriver());
	}
	
	
	@When("Je clique sur Vendors")
	public void jeCliqueSurVendors() throws InterruptedException {
		//Thread.sleep(mediumWait);
		seleniumUtils.waitForElementToBeClickable(vendorPage.getVendorWrappedElement());
		seleniumUtils.click(vendorPage.getVendorWrappedElement());
	}
	@When("Je clique sur Add New")
	public void jeCliqueSurAddNew() {
		seleniumUtils.click(vendorPage.getAddVendorWrappedElement());
	}
	@When("Je saisis Name {string}")
	public void jeSaisisName(String nameVendor){
		//wait.forElementToBeDisplayed(Duration.ofSeconds(5), vendorPage.getNameVendorWrappedElement(), nameVendor);
		seleniumUtils.writeText(vendorPage.getNameVendorWrappedElement(), nameVendor);
	}
	
	@When("Je saisis Description {string}")
	public void jeSaisisDescription(String descVendor) throws InterruptedException {
	Thread.sleep(mediumWait);
	//wait.forElementToBeDisplayed(Duration.ofSeconds(5), vendorPage.getMessageVendorWrappedElement(), descVendor);
	//Setup.getDriver().switchTo().frame(vendorPage.getFrameWrappedElement());
	seleniumUtils.switchToWindow(Setup.getDriver(), vendorPage.getFrameWrappedElement());
	seleniumUtils.writeText(vendorPage.getMessageVendorWrappedElement(), descVendor);
	seleniumUtils.switchToDefaultFrame();
	}
	@When("Je saisis l emailVendor {string}")
	public void jeSaisisLEmailVendor(String emailVendor){
		seleniumUtils.writeText(vendorPage.getEmailVendorWrappedElement(), emailVendor);
	}
	@When("Je clique sur SaveVendor")
	public void jeCliqueSurSaveVendor() {
		seleniumUtils.click(vendorPage.getSaveVendorWrappedElement());
	}
	@Then("le message {string} doit s affiche")
	public void leMessageDoitSAffiche(String messageVendor) {
		validation.assertTrue(vendorPage.getMessageAlertVendorWrappedElement(), messageVendor);
	}
	
}
