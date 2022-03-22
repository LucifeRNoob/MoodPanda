package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import staticdata.UserCredentials;

public class LoginTest extends BaseTest{

    private static final Logger LOGGER = LogManager.getLogger(LoginTest.class.getName());

    @Test(description = "Login in MoodPanda with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        LOGGER.info("Open login page 'MoodPanda'");
        loginPage.openLoginPage();
        LOGGER.info("Login with email: " + UserCredentials.EMAIL + "and with password: " + UserCredentials.PASSWORD);
        loginPage.login(UserCredentials.EMAIL, UserCredentials.PASSWORD);
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(),2,"Quantity of titles isn't expected");
    }
}
