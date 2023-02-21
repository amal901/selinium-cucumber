package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefintion {

	public LoginPage loginPage;
	public LoginStepDefintion() {
		loginPage = new LoginPage();
	}
	@Given("Je me connecte sur l application Nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.gotoUrl();
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String mail) {
		loginPage.fillEmail(mail);
	}

	@When("Je saisis le mot le passe {string}")
	public void jeSaisisLeMotLePasse(String keyword) {
		loginPage.fillPassword(keyword);
	}

	@When("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		loginPage.clickOnBtnLogin();
	}

	@Then("Je me rederige vers la page home {string}")
	public void jeMeRederigeVersLaPageHome(String string) {

	}

}
