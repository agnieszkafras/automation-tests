package checkboxestests;

import base.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CheckboxesPage;
import pages.WelcomePage;

public class CheckboxesTests extends TestUtilities {

    @Test
    public void selectAllCheckboxesTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on checkboxes link
        CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();

        //Select all checkboxes
        checkboxesPage.selectAllCheckboxes();

        //Verify all checkboxes are checked
        Assertions.assertTrue(checkboxesPage.areAllCheckboxesChecked(), "Not all checkboxes are checked");
    }
}
