package com.prestashop.step_definitions;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.MyAccountPage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	SigninPage signinPage = new SigninPage();
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		new HomePage().signin.click();
	}

	@When("I login using username {string} and password {string}")
	public void i_login_using_username_and_password(String username, String password) {
	    
	    signinPage.loginEmail.sendKeys(username);
	    signinPage.password.sendKeys(password);
	    signinPage.submitLogin.click();
	    
	}

	@Then("users full name {string} {string} should be displayed")
	public void users_full_name_should_be_displayed(String firstName, String lastName) {
	   String expected = firstName + " " + lastName;
	   String actual = new MyAccountPage().fullName.getText();
		assertEquals(expected, actual);
		
	}



	
}
