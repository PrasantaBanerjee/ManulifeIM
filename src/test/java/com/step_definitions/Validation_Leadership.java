package com.step_definitions;

import org.junit.Assert;

import com.page_objects.Leadership;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Validation_Leadership extends Leadership {

	@Given("User is on Manulife IM homepage")
	public void user_is_on_manulife_im_homepage() {
		System.out.println("User is on page: " + getDriver().getTitle());
	}

	@When("User clicks on Leadership from left-side menu")
	public void user_clicks_on_leadership_from_left_side_menu() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		leadershipLink().click();
		System.out.println("User clicked on 'Leadership'");
	}

	@Then("User is navigated to Leadership page")
	public void user_is_navigated_to_leadership_page() {
		System.out.println("User navigated to: " + getDriver().getCurrentUrl());
	}

	@Then("the title of page is {string}")
	public void the_title_of_page_is(String title) {
		Assert.assertEquals("Assertion Error: Expected- " + title + "Actual- " + getDriver().getTitle(), title,
				getDriver().getTitle());
	}
	
}
