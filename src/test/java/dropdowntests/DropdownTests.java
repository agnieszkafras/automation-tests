package dropdowntests;

import base.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DropdownPage;
import pages.WelcomePage;

public class DropdownTests extends TestUtilities {


    @Test
    public void optionOneTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on dropdown link
        DropdownPage dropdownPage = welcomePage.clickDropdownLink();

        //Select option 1
        dropdownPage.selectOption(1);

        //Verify option 1 is selected
        String selectedOption = dropdownPage.getSelectedOption();
        Assertions.assertTrue(selectedOption.contains("Option 1"), "Option 1 is not selected. " + selectedOption + " is selected.");
    }

    @Test
    public void optionTwoTest() {

        //Open main page
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        //Click on dropdown link
        DropdownPage dropdownPage = welcomePage.clickDropdownLink();

        //Select option 1
        dropdownPage.selectOption(2);

        //Verify option 1 is selected
        String selectedOption = dropdownPage.getSelectedOption();
        Assertions.assertTrue(selectedOption.contains("Option 2"), "Option 2 is not selected. " + selectedOption + " is selected.");
    }
}
