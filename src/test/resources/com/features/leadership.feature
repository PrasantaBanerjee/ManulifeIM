Feature: Validating Leadership page.

	@Sanity @Regression
  Scenario: Validate the title of the page
    Given User is on Manulife IM homepage
    When User clicks on Leadership from left-side menu
    Then User is navigated to Leadership page
    And the title of page is 'Our executive leadership team | Manulife Investment Management'
