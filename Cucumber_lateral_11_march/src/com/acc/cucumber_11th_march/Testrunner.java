package com.acc.cucumber_11th_march;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature_11th_march"
		,glue={"com.acc.step_definition"}
		
		)
public class Testrunner {

}
