package org.fasttrack.features.search;


import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("product=album");
        cartSteps.clickAddProductToCart();
    }

    @Test
    public void checkCartTotalSummaryTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCart();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }
}
