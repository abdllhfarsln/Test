package com.prestashop.step_definitions;

import com.prestashop.pages.HomePage;
import com.prestashop.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageStepDef {

	@Given("Navigate to url and verify that the user arrives on the right page")
	public void navigate_to_url_and_verify_that_the_user_arrives_on_the_right_page() {
	    
		String ActualTitle = Driver.getDriver().getTitle();
		String ExpectedTitle = "Wikipedia";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}

	@When("Verify that the elements for the top ten languages are visible on the page")
	public void verify_that_the_elements_for_the_top_ten_languages_are_visible_on_the_page() {
	   
		HomePage homepage = new HomePage();
		
		homepage.DeutschLan.isDisplayed();
		System.out.println(homepage.DeutschLan.getText());
		
		homepage.EnglishLan.isDisplayed();
		System.out.println(homepage.EnglishLan.getText());
		
		homepage.EspanyolLan.isDisplayed();
		System.out.println(homepage.DeutschLan.getText());
		
		homepage.FrançaisLan.isDisplayed();
		System.out.println(homepage.FrançaisLan.getText());
		
		homepage.ItalianoLan.isDisplayed();
		System.out.println(homepage.ItalianoLan.getText());
		
		homepage.NigongoLan.isDisplayed();
		System.out.println(homepage.NigongoLan.getText());
		
		homepage.PolskiLan.isDisplayed();
		System.out.println(homepage.PolskiLan.getText());
		
		homepage.PortuguesLan.isDisplayed();
		System.out.println(homepage.PortuguesLan.getText());
		
		homepage.RusskiyLan.isDisplayed();
		System.out.println(homepage.RusskiyLan.getText());
		
		homepage.ZhongwenLan.isDisplayed();
		System.out.println(homepage.ZhongwenLan.getText());
		
		
	}

	@Then("verify that the user is directed to the page that was searched for")
	public void verify_that_the_user_is_directed_to_the_page_that_was_searched_for() {
	
		HomePage homepage = new HomePage();
		
		homepage.SearchItem.sendKeys("Test");
		homepage.ClickSeacrh.click();
	}


	
	
}
