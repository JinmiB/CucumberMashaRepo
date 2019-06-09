package com.basic.FirstFeatureFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

     @RunWith(Cucumber.class)
     @CucumberOptions(
    		 
     monochrome=true,
     //dryRun=true,
     features={"resources/com/basic/firstfeaturefile"},
     glue= {"com/basic/FirstFeatureFiles"},
     
     plugin=
   	      {"pretty" ,
    		 "html:target/cucumber-htmlreport" ,
    		 "json:target/cucumber-report2.json",
    		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html",

    		 }   		 
    		 )
     
     
     public class RunFirstCucumberTest {

}
