package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage extends BasePageObject{

    private By body = By.xpath("//body");
    private By resultTextLocator = By.id("result");

    Actions action = new Actions(driver);
    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    //Press given key while on this page
    public void pressKey(Keys key) {;
        pressKey(body, key);
    }

    //Get result text
    public String getResultText() {
        String result = find(resultTextLocator).getText();
        return result;
    }
}
