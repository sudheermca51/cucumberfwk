package mmp.stepdefinitions;


import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mmp.helper.BaseClass;
import mmp.pages.HomePage;
import mmp.pages.LoginPage;
import mmp.pages.ScheduleAppointmentPage;
public class ScheduleApponitmentSteps extends BaseClass{

	LoginPage login;
	ScheduleAppointmentPage sPage;
	HomePage hPage;
	HashMap<String,String> expectedHMap ;

	@Given("login into Patient Module successfully")
	public void login() throws IOException {
		instantiateDriver();
		login = new LoginPage(driver);
		login.login("ria1","Ria12345");
	}

	@When("Patient is able to do booking")
	public void bookAppointment() {
		sPage = new ScheduleAppointmentPage(driver);
		expectedHMap =sPage.bookAppointment("10");
		 
	}

	@Then("the booking is successful")
	public void validateBooking() {
		hPage = new HomePage(driver);
		HashMap<String,String> actualHMap =hPage.fetchPatientTableValues();
		Assert.assertEquals(actualHMap,expectedHMap);
	}
	

}
