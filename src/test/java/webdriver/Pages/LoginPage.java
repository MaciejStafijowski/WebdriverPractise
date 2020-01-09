package webdriver.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(id = "text")
    private WebElementFacade usernameInput;

    @FindBy(id = "password")
    private WebElementFacade passwordInput;

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;


    public void typeLogin(String username) {
        usernameInput.type(username);
    }

    public void typePassoword(String password) {
        passwordInput.type(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
