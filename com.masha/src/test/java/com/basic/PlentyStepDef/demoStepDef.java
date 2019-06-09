package com.basic.PlentyStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class demoStepDef {


	WebDriver driver =null;
	
    @Given("^User is on demo site page$")
    public void user_is_on_demo_site_page() {

       // System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetUp\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\CucumberSetUp\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       // driver=new ChromeDriver();
        driver=new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
    }
    
    @When("^User enters first name$")
    public void user_enters_first_name() {
    	
    	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("selenium");
    }
    
    @When("^User enters last name$")
    public void user_enters_last_name() {
    	
    	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("selenium");
    }
}
