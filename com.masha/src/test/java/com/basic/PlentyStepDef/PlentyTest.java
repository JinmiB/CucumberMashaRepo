package com.basic.PlentyStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

     @RunWith(Cucumber.class)
     @CucumberOptions(
    		 
     monochrome=true,
    // dryRun=true,
     features={"resources/com/basic/PlentyFF"},
     glue= {"com/basic/PlentyStepDef"},
     
     plugin=
   	      {"pretty" ,
    		 "html:target/cucumber-htmlreport" ,
    		 "json:target/cucumber-report6.json",
    		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html",

    		 }   		 
    		 )
     
     
     public class PlentyTest {

}
