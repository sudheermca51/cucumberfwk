package mmp.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mmp.helper.BaseClass;
import mmp.helper.HelperClass;
import mmp.pages.LoginPage;

public class LoginSteps extends BaseClass{

   LoginPage loginPage;
   HelperClass helper;
	@Given("User visited to the mmp site")
	public void user_visited_to_the_mmp_site() throws IOException {
		instantiateDriver();
		helper=new HelperClass(driver);
		helper.launchBrowser(pro.getProperty("patientURL"));
		 
	}
	@When("^Users inputs the valid (.*) and (.*)$")
	public void users_inputs_the_valid_and(String username, String password) {
		loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@When("^Users inputs the invalid (.*) and (.*)$")
	public void users_inputs_the_invalid_and(String username, String password) {
		loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}
	@Then("User can login successfully")
	public void user_can_login_successfully() {
		  String actual = loginPage.fetchloginSuccessfulText();
		  String expected="Patient Portal";
		  Assert.assertEquals(actual, expected);
	}
	@Then("User cannot login successfully")
	public void user_cannot_login_successfully() {
		  String actual = loginPage.handleAlert();
		  String expected="Wrong username and password.";
		  Assert.assertEquals(actual.trim(), expected);
	}


}
