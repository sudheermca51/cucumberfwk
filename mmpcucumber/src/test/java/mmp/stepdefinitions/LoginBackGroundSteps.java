package mmp.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mmp.helper.BaseClass;
import mmp.helper.HelperClass;
import mmp.pages.LoginPage;

public class LoginBackGroundSteps extends BaseClass{
	 HelperClass helper;
	 LoginPage loginPage;
	 
	@Given("I have instantiated the driver instance")
	public void i_have_instantiated_the_driver_instance() throws IOException {
		instantiateDriver();
	}
	@When("I have nagivated to login Page")
	public void i_have_nagivated_to_login_page() {
		helper=new HelperClass(driver);
		helper.launchBrowser("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
	}
	@Then("Login Page is displayed successfully")
	public void login_page_is_displayed_successfully() {
	    
	}
	@Given("User visited to the mmp website")
	public void user_visited_to_the_mmp_site() throws IOException {
		 
		 
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
	@Then("User can login mmp site successfully")
	public void user_can_login_successfully() {
		  String actual = loginPage.fetchloginSuccessfulText();
		  String expected="Patient Portal";
		  Assert.assertEquals(actual, expected);
	}
	@Then("User cannot login mmp site successfully")
	public void user_cannot_login_successfully() {
		  String actual = loginPage.handleAlert();
		  String expected="Wrong username and password.";
		  Assert.assertEquals(actual.trim(), expected);
	}
}