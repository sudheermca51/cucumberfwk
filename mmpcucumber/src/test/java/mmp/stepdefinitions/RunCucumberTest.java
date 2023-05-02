package mmp.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "mmpfeatures/login_background.feature",
				 plugin = {"pretty","html:target/cucumber-reports/cucumber.html",
									"json:target/cucumber-reports/cucumber.json"})
//tags= "@regression")
public class RunCucumberTest {

}