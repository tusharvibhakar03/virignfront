$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "As user I want to click on login test on virgingames  website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  Given  I have accepted cookie"
    },
    {
      "line": 7,
      "value": "#  Then  I can see Vigingame homepage"
    }
  ],
  "line": 9,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on Login tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should navigate to Login page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 272770800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginTab()"
});
formatter.result({
  "duration": 30400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 24500,
  "status": "passed"
});
});