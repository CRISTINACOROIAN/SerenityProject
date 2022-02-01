package org.fasttrack.features.search;

import org.fasttrack.steps.serenity.LoginSteps;
import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
    }
    //@Test
   // public void loginWithInValidCredentialsTest(){
      //  loginSteps.navigateToLoginPage();
      //  loginSteps.enterCredentials("asd@asd.asd", EnvConstants.USER_PASS);
      //  loginSteps.clickLogin();
      //  loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
   // }
}
