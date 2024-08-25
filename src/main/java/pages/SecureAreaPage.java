package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject{

    private String pageUrl = "https://the-internet.herokuapp.com/secure";

    private By logoutButtonLocator = By.xpath("//i[@class='icon-2x icon-signout']");
    private By message = By.id("flash-messages");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    //Get URL variable from PageObject
    public String getPageUrl() {
        return pageUrl;
    }

    //Verifications if logoutButton is visible
    public boolean isLogoutButtonVisible() {
        return find(logoutButtonLocator).isDisplayed();
    }

    //Return text from success message
    public String getSuccessMessageText() {
        return find(message).getText();
    }
}
