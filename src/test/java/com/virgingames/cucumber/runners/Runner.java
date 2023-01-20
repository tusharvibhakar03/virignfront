package com.virgingames.cucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/virgingames/cucumber",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
        "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
        "json:target/RunCuke/cucumber.json"}

)


public class Runner {


}
