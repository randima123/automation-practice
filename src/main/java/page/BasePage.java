package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BasePage {

    private static WebDriver webDriver;
    private static WebDriverWait wait;

    public BasePage() {
    }

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait=new WebDriverWait(webDriver, 10);
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public static void hoverOverAndClick(WebElement hoverElement, WebElement webElement) {
        Actions action = new Actions(webDriver);
        action.moveToElement(hoverElement).moveToElement(webElement).click().build().perform();
    }

}
