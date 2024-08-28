package mmp.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "mmpfeatures/login.feature",
				 plugin = {"pretty","html:target/cucumber-reports/cucumber.html",
									"json:target/cucumber-reports/cucumber.json"},
				 glue="mmp.stepdefinitions")
public class RunCucumberTest {

}