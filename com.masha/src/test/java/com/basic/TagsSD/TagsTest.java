package com.basic.TagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

     @RunWith(Cucumber.class)
     @CucumberOptions(
    		 
     monochrome=true,
     //dryRun=true,
     //tags= {"@Important"}, all scenarios will run as whole feature file has been tagged
     //tags= {"@Smoke"}, only smoke tagged scenarios will run in ff will run
    // tags= {"@Smoke", "@Regression"},// this will only run one scenario in FF as it uses **AND** condition
     tags= {"@Smoke,@Regression"}, //**OR** condition of the @ will run


     features={"resources/com/basic/TagsFF"},
     glue= {"com/basic/TagsSD"},
     
     plugin=
   	      {"pretty" ,
    		 "html:target/cucumber-htmlreport" ,
    		 "json:target/cucumber-report8.json",
    		 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html",

    		 }   		 
    		 )
     
     
     public class TagsTest {

}
