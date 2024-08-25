package keypressestests;

import base.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.KeyPressesPage;
import pages.WelcomePage;

public class KeyPressesTests extends TestUtilities {


    @Test
    public void pressKeyWithActionsTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on key presses link
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();

        //Push keyboard key
        keyPressesPage.pressKeyWithActions(Keys.ENTER);

        //Get result text
        String result = keyPressesPage.getResultText();

        // Verify result text is expected
        Assertions.assertTrue(result.equals("You entered: ENTER"),
                "result is not expected. \nShould be 'You entered: ENTER', but it is '" + result + "'");
    }
}
