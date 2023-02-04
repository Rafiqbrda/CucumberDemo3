package com.example.steaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdifination {
	
static WebDriver driver;
@Given("browser window is open")
public void user_opens_browser() {
	System.setProperty("webDriver.chrome.driver","C:\\Users\\rafiq\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	 driver = new ChromeDriver();
driver.get("https://www.facebook.com");
}

@Given("enter ur1")
public void enter_ur1() {
	 System.out.println("open google"); 
}

@When("Google is opend")
public void google_is_opend() {
	 System.out.println("verify title");  
}

@Then("search selenium with google")
public void search_selenium_with_google() {
	 System.out.println("enter selenium in search box"); 
}

@Then("click enter")
public void click_enter() {
	 System.out.println("click enter"); 
}

}
