package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.time.Duration;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPasswordFieldLoginPage(String pass) {
        typeInto(passwordField, pass);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }



    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }
}
