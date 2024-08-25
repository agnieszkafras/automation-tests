package contextmenutests;

import base.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import pages.ContextMenuPage;
import pages.WelcomePage;

public class ContextMenuTests extends TestUtilities {

    @Test
    public void contextMenuTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on context menu page
        ContextMenuPage contextMenuPage = welcomePage.clickContextMenuLink();

        //Right click in the box
        contextMenuPage.rightClickInTheBox();

        //Get text from the alert anc accept the alert
        String alertText = contextMenuPage.getTextAlertAndAccept();
        Assertions.assertTrue(alertText.equals("You selected a context menu"), "alert text is not expected. \nShould be 'You selected a context menu', but it is '" + alertText + "'");
    }


}
