package loginpagetests;

import base.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import pages.WelcomePage;

public class PositiveLogInTests extends TestUtilities {

    @Test
    public void logInTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on form authentication link
        LoginPage loginPage = welcomePage.clickFormAuthenticationLink();

        //Execute log in
        SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");

        //Verifications
        //New page url is expected
        Assertions.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());

        //Log out button is visible
        Assertions.assertTrue(secureAreaPage.isLogoutButtonVisible(),"LogOut Button is not visible.");

        // Successful log in message
        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = secureAreaPage.getSuccessMessageText();
        Assertions.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);
    }
}
