package com.basic.HooksSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hookssd {
	
	WebDriver driver =null;
	//you can order you @Before using incremental order 1 = first , order 2 = second
	//@Before(oder=1) meaning first set-up   @After(order=2) executes higher order first
	//same goes for @after using decreasing order 2 = first, order 1 = second
	
	@Before
	public void setUp() {
		
		System.out.println("in before");
        System.setProperty("webdriver.gecko.driver","C:\\CucumberSetUp\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
	}
	
    @Given("^User is on facebook login page$")
    public void User_is_on_facebook_login_page() {

        driver.get("https://www.facebook.com/");
    }
    

    @When("^User enters \"([^\"]*)\" first name$")
    public void user_enters_first_name(String userName) throws Throwable {
    	
        driver.findElement(By.id("u_0_n")).sendKeys(userName);
    }
    
    @Then("^User checks \"([^\"]*)\" first name is present$")
    public void user_checks_first_name_is_present(String userName) throws Throwable {
    	
     	String actualValue = driver.findElement(By.id("u_0_n")).getAttribute("value");
    	Assert.assertEquals(userName, actualValue);
    }
    
    @When("^User enters \"([^\"]*)\" surname$")
    public void user_enters_surname(String surname) throws Throwable {
    	
    	driver.findElement(By.id("u_0_p")).sendKeys(surname);
    	Thread.sleep(2000);
    }
    
    @Then("^User mobile field should be blank$")
    public void user_mobile_field_should_be_blank() {
    
     	String MobileActual = driver.findElement(By.id("u_0_s")).getAttribute("value");
    	Assert.assertEquals("", MobileActual);
    }
    
    @After
    public void tearDown() {
    	
    	System.out.println("In after");
    	driver.quit();
    	driver=null;    	
    }
    

}

    
    
    
