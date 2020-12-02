package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

    private WebDriver webDriver;

    @FindBy(xpath = "//div[@class='header_user_info']//span")
    private WebElement username;

    public AccountPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public String getLoggedInUsername() {
        return username.getText();
    }
}
