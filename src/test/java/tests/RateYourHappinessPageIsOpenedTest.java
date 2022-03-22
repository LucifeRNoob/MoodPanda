package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RateYourHappinessPage;
import staticdata.UserCredentials;
import staticdata.WebUrls;

public class RateYourHappinessPageIsOpenedTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(RateYourHappinessPageIsOpenedTest.class.getName());

    @Test(description = "Try to open Rate your happiness page")
    @Severity(SeverityLevel.NORMAL)
    public void openRateHappiness() {
        LoginPage loginPage = new LoginPage();
        LOGGER.info("Open login page 'MoodPanda'");
        loginPage.openLoginPage();
        LOGGER.info("Login with email: " + UserCredentials.EMAIL + "and with password: " + UserCredentials.PASSWORD);
        loginPage.login(UserCredentials.EMAIL, UserCredentials.PASSWORD);
        MainPage mainPage = new MainPage();
        LOGGER.info("Go to 'Rate your happiness page'" + WebUrls.BASE_URL.concat(WebUrls.POST_URL));
        mainPage.goToRateYourHappinessPage();
        RateYourHappinessPage rateYourHappinessPage = new RateYourHappinessPage();
        Assert.assertEquals(rateYourHappinessPage.subtitleIsExisted(), "Rate your happiness", "Page is not opened");
    }
}
