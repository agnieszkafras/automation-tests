package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject{

    private String pageUrl = "https://the-internet.herokuapp.com/";

    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By keyPressesLinkLocator = By.linkText("Key Presses");
    private By forgotPasswordLinkLocator = By.linkText("Forgot Password");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By contextMenuLocator = By.linkText("Context Menu");

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    //Open WelcomePage with its url
    public void openPage() {
        openUrl(pageUrl);
    }

    //Open LoginPage by clicking on form authentication link
    public LoginPage clickFormAuthenticationLink() {
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver);
    }

    //Open KeyPressPage by clicking on key presses link
    public KeyPressesPage clickKeyPressesLink() {
        click(keyPressesLinkLocator);
        return new KeyPressesPage(driver);
    }

    //Open ForgotPasswordPage by clicking on forgot password link
    public ForgotPasswordPage clickForgotPasswordLink() {
        click(forgotPasswordLinkLocator);
        return new ForgotPasswordPage(driver);
    }

    //Open DropdownPage by clicking dropdown link
    public DropdownPage clickDropdownLink() {
        click(dropdownLinkLocator);
        return new DropdownPage(driver);
    }

    //Open CheckboxesPage by clicking on checkboxes link
    public CheckboxesPage clickCheckboxesLink() {
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver);
    }

    //Open Context menu page by clicking on context menu link
    public ContextMenuPage clickContextMenuLink() {
        click(contextMenuLocator);
        return new ContextMenuPage(driver);
    }
}
