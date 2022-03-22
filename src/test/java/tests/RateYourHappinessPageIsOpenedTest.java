package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RateYourHappinessPage;
import staticdata.UserCredentials;

public class RateYourHappinessPageIsOpenedTest {

    @Test(description = "Try to open Rate your happiness page")
    public void openRateHappiness() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(UserCredentials.EMAIL, UserCredentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.goToRateYourHappinessPage();
        RateYourHappinessPage rateYourHappinessPage = new RateYourHappinessPage();
        Assert.assertEquals(rateYourHappinessPage.subtitleIsExisted(), "Rate your happiness", "Page is not opened");
    }
}
