package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignInInfoPage {

    private WebDriver webDriver;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement stateSelect;

    @FindBy(id = "postcode")
    private WebElement postCode;

    @FindBy(id = "id_country")
    private WebElement countrySelect;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(id = "alias")
    private WebElement alias;

    @FindBy(id = "submitAccount")
    private WebElement submitAccountButton;

    public SignInInfoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName.sendKeys(customerFirstName);
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName.sendKeys(customerLastName);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setCity(String city) {
        this.city.sendKeys(city);
    }

    public void setStateSelect(String stateSelect) {
        Select daySel = new Select(this.stateSelect);
        daySel.selectByVisibleText(stateSelect);
    }

    public void setPostCode(String postCode) {
        this.postCode.sendKeys(postCode);
    }

    public void setCountrySelect(String countrySelect) {
        this.countrySelect.sendKeys(countrySelect);
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone.sendKeys(mobilePhone);
    }

    public void setAlias(String alias) {
        this.alias.sendKeys(alias);
    }

    public void enterInformationAndSubmit(String cusFirstName, String cusLastName, String password, String firstName,
                                          String lastName, String address, String city, String state, String postCode,
                                          String country, String phone, String alias) {
        setCustomerFirstName(cusFirstName);
        setCustomerLastName(cusLastName);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setStateSelect(state);
        setPostCode(postCode);
        setCountrySelect(country);
        setMobilePhone(phone);
        setAlias(alias);
        clickSubmitAccountButton();

    }

    public void clickSubmitAccountButton() {
        submitAccountButton.click();
    }

}
