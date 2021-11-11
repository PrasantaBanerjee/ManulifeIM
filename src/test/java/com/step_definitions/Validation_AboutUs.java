package com.step_definitions;

import org.junit.Assert;

import com.page_objects.AboutUs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Validation_AboutUs extends AboutUs {

	@Given("User is on the Manulife IM homepage")
	public void user_is_on_the_manulife_im_homepage() {
		System.out.println("User is on page: " + getDriver().getTitle());
	}

	@When("User clicks on About Us from left-side menu")
	public void user_clicks_on_about_us_from_left_side_menu() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		aboutUsLink().click();
		System.out.println("User clicked on 'About Us'");
	}

	@Then("User is navigated to About Us page")
	public void user_is_navigated_to_about_us_page() {
		System.out.println("User navigated to: " + getDriver().getCurrentUrl());
	}

	@Then("the title of the page is {string}")
	public void the_title_of_the_page_is(String title) {
		Assert.assertEquals("Assertion Error: Expected- " + title + "Actual- " + getDriver().getTitle(), title,
				getDriver().getTitle());
	}
}
