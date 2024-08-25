package loginpagetests;

import base.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.WelcomePage;


public class NegativeLogInTests extends TestUtilities {

    String expectedErrorMessage = "Your username is invalid!";

    @Test
    public void negativeLogInTest () {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on form authentication link
        LoginPage loginPage = welcomePage.clickFormAuthenticationLink();

        //Execute negative login
        loginPage.negativeLogIn("username", "password");

        //Wait for error message
        loginPage.waitForErrorMessage();
        String message = loginPage.getErrorMessageText();

        //Verification
        Assertions.assertTrue(message.contains(expectedErrorMessage),"Message dosen't contain expected text");

    }


}
