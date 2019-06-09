package com.basic.HooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

     @RunWith(Cucumber.class)
     @CucumberOptions(
    		 
     monochrome=true,
     //dryRun=true,
     features={"resources/com/basic/hooksFF"},
     glue= {"com/basic/HooksSD"},
     
     plugin=
   	      {"pretty" ,
    		 "html:target/cucumber-htmlreport" ,
    		 "json:target/cucumber-report3.json",
    		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html",

    		 }   		 
    		 )
     
     
     public class HooksTest {

}
