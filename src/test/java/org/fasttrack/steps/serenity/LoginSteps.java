package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.steps.serenity.BaseSteps;

public class LoginSteps extends BaseSteps {


    @Step
    public void setEmailField(String mail){
        loginPage.setEmailField(mail);
    }

    @Step
    public void setPasswordField(String pass){
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }


    public void doLogin(String userEmail, String userPass) {
        setEmailField(userEmail);
        setPasswordField(userPass);
        clickOnLoginButton();
    }

    public void enterCredentials(String userEmail, String userPass) {
        setEmailField(userEmail);
        setPasswordField(userPass);
    }

    public void navigateToLoginPage() {
        loginPage.open();
    }
}
