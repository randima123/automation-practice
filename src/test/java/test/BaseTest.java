package test;

import common.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static final long SHORT_IMPLICIT_TIMEOUT = 20;

    protected static WebDriver webDriver;

    protected HomePage homePage;
    protected BasePage basePage;
    protected SignInPage signInPage;
    protected SignInInfoPage signInInfo;
    protected AccountPage accountPage;

    @BeforeMethod
    public void initDriver(){
        webDriver = DriverProvider.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        basePage = PageFactory.initElements(webDriver, BasePage.class);
        signInPage =PageFactory.initElements(webDriver, SignInPage.class);
        homePage = PageFactory.initElements(webDriver,HomePage.class);
        signInInfo = PageFactory.initElements(webDriver,SignInInfoPage.class);
        accountPage = PageFactory.initElements(webDriver,AccountPage.class);

    }


    @AfterMethod
    public void closeDriver(){
        if(webDriver != null){
            webDriver.quit();
        }
    }

}
