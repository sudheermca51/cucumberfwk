package mmp.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "mmpfeatures/Login.feature",
				 plugin = {"pretty","html:target/cucumber-reports/cucumber.html",
									"json:target/cucumber-reports/cucumber.json"},
				 glue="mmp.stepdefinitions",tags= "@regression")
public class RunCucumberTest {

}