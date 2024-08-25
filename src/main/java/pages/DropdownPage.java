package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePageObject{

    private By dropdownLocator = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    //Select given option
    public void selectOption(int i) {
        WebElement dropdownElement = find(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(i);
    }

    //Return selected option as a string
    public String getSelectedOption() {
        WebElement dropdonwElement  = find(dropdownLocator);
        Select dropdown = new Select(dropdonwElement);
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        return selectedOption;
    }
}
