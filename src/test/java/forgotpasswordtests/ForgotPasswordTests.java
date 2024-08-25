package forgotpasswordtests;

import base.TestUtilities;
import org.junit.jupiter.api.Test;
import pages.ForgotPasswordPage;
import pages.WelcomePage;

public class ForgotPasswordTests extends TestUtilities {

    private String email = "test123@test123.com";

    @Test
    public void retrievePasswordTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on forgot password link
        ForgotPasswordPage forgotPasswordPage = welcomePage.clickForgotPasswordLink();

        //Type email
        forgotPasswordPage.typeEmail(email);

        //Click retrieve password button
        forgotPasswordPage.clickRetrievePasswordButton();

    }
}
