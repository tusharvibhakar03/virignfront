
Feature: Login Test
  As user I want to click on login test on virgingames  website

Background: I am on homepage
#  Given  I have accepted cookie
#  Then  I can see Vigingame homepage

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on Login tab
    Then I should navigate to Login page successfully
