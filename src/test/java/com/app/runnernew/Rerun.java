package com.app.runnernew;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "@target/testreport.txt", 
                  glue ="com.app.stepdefinitionnew" 
                  //tags = "@asMap", dryRun = false
                 // publish = true
                  //monochrome = true,
                //  plugin = {"pretty", "html:target/cucumber-reports.html",
                  //"json:target/cucumber-report.json"}
                  )
public class Rerun {
	
	

}
