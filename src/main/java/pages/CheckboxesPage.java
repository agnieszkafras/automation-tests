package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BasePageObject{

    private By checkbox = By.xpath("//input[@type='checkbox']");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    //Select all checkboxes
    public void selectAllCheckboxes() {
        List<WebElement> checkboxes = findAll(checkbox);
        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }

    //Verify all checkboxes are checked
    public boolean areAllCheckboxesChecked() {
        List<WebElement> checkboxes = findAll(checkbox);
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                return false;
            }
        }
        return true;
    }
}
