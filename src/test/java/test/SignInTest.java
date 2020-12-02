package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test
    public void testValidAccountCreation() {

        signInPage.enterEmailAndSubmit("randima1234@mailinator.com");

        signInInfo.enterInformationAndSubmit("Randima", "Senanayake", "abc213", "Randima",
                "Senanayake", "address1", "Galle", "Alaska", "80000", "United States",
                "0711231231", "randima12@mail.com");

        Assert.assertEquals(accountPage.getLoggedInUsername(), "Randima Senanayake");

    }
}
