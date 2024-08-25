package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePageObject {

    protected WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    //Open page with given URL
    protected void openUrl(String url){
        driver.get(url);
    }

    //Find element using given locator
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    //Find all elements using given locator
    protected List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    //Click on element with given locator when it is visible
    protected  void click(By locator) {
        //waitForVisibilityOf(locator, 5);
        find(locator).click();
    }

    //Type given text into element with given locator
    protected void type(String text, By locator) {
        //waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    //Get URL of current page from browse
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    //Get title of current page
    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    //Get source of current page
    public String getCurrentPageSource() {
        return driver.getPageSource();
    }

    //Wait for specific ExpectedCondition for the given amount of time in seconds
    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(condition);
    }

    //Wait for visibility of element with given locator
    protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempts++;
        }
    }

    //Press Key
    protected void pressKey(By locator, Keys key) {
        find(locator).sendKeys(key);
    }

    //Press key with actions class
    public void pressKeyWithActions(Keys key) {
        Actions actions = new Actions(driver);
        actions.sendKeys(key).build().perform();
    }

}
