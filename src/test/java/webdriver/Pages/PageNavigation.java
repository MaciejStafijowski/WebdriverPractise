package webdriver.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class PageNavigation extends PageObject {

    @FindBy(id = "login-portal")
    private WebElementFacade loginPageLink;

    public void openLoginPage() {
        loginPageLink.click();
    }
}
