package test;

import org.testng.annotations.Test;

public class CheckoutProductTest extends BaseTest {

    @Test
    public void verifyLoggedInUserCanCheckoutProduct() {

        homePage.navigateToHomePage();
        homePage.clickOnItemAddToCart();
    }
}
