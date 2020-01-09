package webdriver.Features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webdriver.Pages.LoginPage;
import webdriver.Pages.PageNavigation;

public class LoginFeature {

    private LoginPage loginPage;
    private PageNavigation pageNavigation;

    @Given("^user navigates to the website to login page$")
    public void userNavigatesToTheWebsiteToLoginPage() {
        pageNavigation.openLoginPage();
    }

    @When("^he enter invalid credentials$")
    public void heEnterInvalidCredentials(final String username, final String password) {
        loginPage.typeLogin(username);
        loginPage.typePassoword(password);
        loginPage.clickLoginButton();
    }

    @Then("^he is not logged in$")
    public void heIsNotLoggedIn() {

    }
}