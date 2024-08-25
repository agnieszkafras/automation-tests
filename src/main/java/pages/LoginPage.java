package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject{

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.tagName("button");
    private By errorMessageLocator = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Execute log in
    public SecureAreaPage logIn(String username, String password) {
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(loginButtonLocator);
        return new SecureAreaPage(driver);
    }

    public void negativeLogIn(String username, String password) {
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(loginButtonLocator);
    }

    //Wait for error message to be visible on the page
    public void waitForErrorMessage() {
        waitForVisibilityOf(errorMessageLocator, 5);
    }

    //Get error message text
    public String getErrorMessageText() {
        return find(errorMessageLocator).getText();
    }
}
