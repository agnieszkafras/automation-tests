package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePageObject{

    private WebElement box = driver.findElement(By.id("hot-spot"));

    Actions action= new Actions(driver);
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }


    //Right click in the box
    public void rightClickInTheBox() {
        action.contextClick(box).build().perform();
    }

    //Get text from the alert and accept alert
    public String getTextAlertAndAccept() {
        Alert alert=driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }

}
