package com.virgingames.cucumber.steps;

import com.virgingames.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps   {

    @Given("^: I have accepted cookie$")
    public void iHaveAcceptedCookie() {
    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Login tab$")
    public void iClickOnLoginTab() {
    }

    @Then("^I should navigate to Login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }



    @Then("^I can see Vigingame homepage$")
    public void iCanSeeVigingameHomepage() {
        new LoginPage().acceptCookies();
    }
}
