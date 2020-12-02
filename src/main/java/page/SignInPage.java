package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    private WebDriver webDriver;

    public SignInPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    @FindBy(id = "email_create")
    private WebElement emailBox;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    public void enterEmailAddress(String email) {
        emailBox.sendKeys(email);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public void enterEmailAndSubmit(String email) {
        enterEmailAddress(email);
        clickCreateAccountButton();
    }
}
