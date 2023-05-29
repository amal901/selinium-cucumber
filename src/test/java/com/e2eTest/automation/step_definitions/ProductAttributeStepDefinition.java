package com.e2eTest.automation.step_definitions;
 
import org.openqa.selenium.By;

import com.e2eTest.automation.page_objects.ProductAttributePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductAttributeStepDefinition {
	
	
	private ProductAttributePage productAttributePage;
	private SeleniumUtils seleniumUtils;
	private Validations validation;
	
	public ProductAttributeStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		validation= new Validations();
		productAttributePage = new ProductAttributePage();
	}

	@When("Je clique sur Catalog")
	public void jeCliqueSurCatalog() {
		seleniumUtils.click(ProductAttributePage.catalog);
	}
	@When("Je clique sur Attributes")
	public void jeCliqueSurAttributes() {
		seleniumUtils.waitForElementToBeClickable(ProductAttributePage.attributes);
		seleniumUtils.click(ProductAttributePage.attributes);
	}
	@When("Je clique sur Product attributes")
	public void jeCliqueSurProductAttributes() {
		seleniumUtils.waitForElementToBeClickable(ProductAttributePage.productAttributes);
		seleniumUtils.click(ProductAttributePage.productAttributes);
	}
	@When("Je selectionne la case a cocher Color")
	public void jeSelectionneLaCaseACocherColor() {
		seleniumUtils.click(ProductAttributePage.checkColor);
	}
	@Then("Je verifie que la case color a ete cochee")
	public void jeVerifieQueLaCaseColorAEteCochee() {
		validation.isElementSelected(ProductAttributePage.checkColor);
	}
	@When("Je selectionne la case a cocher HDD")
	public void jeSelectionneLaCaseACocherHDD() {
		seleniumUtils.click(ProductAttributePage.checkHdd);
	}
	@When("Je clique sur le bouton Delete")
	public void jeCliqueSurLeBoutonDelete() {
		seleniumUtils.click(ProductAttributePage.deleteProductAttribute);
		seleniumUtils.waitForElementToBeClickable(ProductAttributePage.btnYes);
		seleniumUtils.click(ProductAttributePage.btnYes);
	}
	@Then("Je verifie que les attribut sont effacee")
	public void jeVerifieQueLesAttributSontEffacee() {
	    validation.isElementNotPresent(By ProductAttributePage.color);
	}

}
