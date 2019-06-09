package com.basic.FirstFeatureFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
	
	WebDriver driver;
	
    @Given("^User is on facebook login page$")
    public void User_is_on_facebook_login_page() {

       // System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetUp\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\CucumberSetUp\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       // driver=new ChromeDriver();
        driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        System.out.println("Demo demo");
        //I am a genius
    }
    

    @When("^User enters first name$")
    public void User_enters_first_name() {
    	
        driver.findElement(By.id("u_0_n")).sendKeys("David");
    }
    
    @Then("^User checks first name is present$")
    public void User_checks_first_name_is_present() {
    	
     	String actualValue = driver.findElement(By.id("u_0_n")).getAttribute("value");
    	Assert.assertEquals("David", actualValue);
    }

    
    
}
