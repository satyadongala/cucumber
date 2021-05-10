package org.cucumber.step_definationtest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = { "Step_definations" }, monochrome = true, plugin = { "pretty",
		"json: target/JSONReports/reports.json" })
public class TestRunner {

}
