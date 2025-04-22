package com.app.runnernew;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "D:\\Eclipse Workspace\\cucumbernew\\src\\test\\java\\com\\app\\featurenew", 
                  glue ="com.app.stepdefinitionnew", tags = "@asMap", dryRun = false,
                 // publish = true
                  //monochrome = true,
                 plugin = {"pretty", "html:target/cucumber-reports.html",
                  "json:target/cucumber-report.json", "rerun:target/testreport.txt"}
                  )
 public class Runnernew {

}
 