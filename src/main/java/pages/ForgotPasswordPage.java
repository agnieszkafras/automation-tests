package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePageObject{

    private By inputEmailLocator = By.id("email");
    private By retrievePasswordButton = By.xpath("//button[@id='form_submit']");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void typeEmail(String email) {
        type(email, inputEmailLocator);
    }


    public void clickRetrievePasswordButton() {
        click(retrievePasswordButton);
    }
}
