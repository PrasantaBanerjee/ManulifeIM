Feature: Validating About Us page.

	@Smoke @Regression
  Scenario: Validate title of the page
    Given User is on the Manulife IM homepage
    When User clicks on About Us from left-side menu
    Then User is navigated to About Us page
    And the title of the page is "A passion for providing solutions | Manulife Investment Management"
