package mmp.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "mmpfeatures/ScheduleAppointment.feature")
public class RunCucumberTest {

}