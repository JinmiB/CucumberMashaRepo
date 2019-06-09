package com.basic.ScenarioEx;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

     @RunWith(Cucumber.class)
     @CucumberOptions(
    		 
     monochrome=true,
     //dryRun=true,
     features={"resources/com/basic/ScenarioExFF"},
     glue= {"com/basic/ScenarioEx"},
     
     plugin=
   	      {"pretty" ,
    		 "html:target/cucumber-htmlreport" ,
    		 "json:target/cucumber-report7.json",
    		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html",

    		 }   		 
    		 )
     
     
     public class ScenarioExTest {

}
