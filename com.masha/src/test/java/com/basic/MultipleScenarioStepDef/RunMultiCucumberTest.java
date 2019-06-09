package com.basic.MultipleScenarioStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

     @RunWith(Cucumber.class)
     @CucumberOptions(
    		 
     monochrome=true,
     //dryRun=true,
     features={"resources/com/basic/MultipleScenariosFF"},
     glue= {"com/basic/MultipleScenarioStepDef"},
     
     plugin=
   	      {"pretty" ,
    		 "html:target/cucumber-htmlreport" ,
    		 "json:target/cucumber-report4.json",
    		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html",

    		 
    		 }   		 
    		 )
     
     
     public class RunMultiCucumberTest {

}
