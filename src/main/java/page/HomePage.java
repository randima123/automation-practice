package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    private WebDriver webDriver;

    @FindBy(xpath = "//div[@class='header_user_info']//span")
    private WebElement username;

    @FindBy(xpath = "//div[@id='center_column']//ul[@id='homefeatured']/li[1]//div[@class='right-block']/div[@class='button-container']/a[1]")
    private WebElement firstItemAddToCartLink;

    @FindBy(xpath = "//div[@id='center_column']//ul[@id='homefeatured']/li[1]/div[@class='product-container']")
    private WebElement itemContainer;

    public HomePage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public String getLoggedInUsername() {
        return username.getText();
    }

    public void navigateToHomePage(){
        webDriver.get("http://automationpractice.com/index.php");
    }

    public void clickOnItemAddToCart() {
        hoverOverAndClick(itemContainer, firstItemAddToCartLink);
    }


}
