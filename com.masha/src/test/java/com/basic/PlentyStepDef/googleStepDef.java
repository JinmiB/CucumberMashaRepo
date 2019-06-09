package com.basic.PlentyStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class googleStepDef {

	WebDriver driver =null;
	
    @Given("^User is on google page$")
    public void user_is_on_google_page() {

       // System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetUp\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\CucumberSetUp\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       // driver=new ChromeDriver();
        driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
    
    @When("^User enters search string$")
    public void user_enters_search_string() {
    	
    	driver.findElement(By.id("fakebox-input")).sendKeys("selenium");
    }
}
