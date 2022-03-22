package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrisisCenterPage;
import pages.LoginPage;
import pages.MainPage;
import staticdata.UserCredentials;
import staticdata.WebUrls;

public class CrisisCenterTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CrisisCenterTest.class.getName());

    @Test(description = "Check that Crisis Center is opened")
    @Severity(SeverityLevel.MINOR)
    public void openCrisisCenter() {
        LoginPage loginPage = new LoginPage();
        LOGGER.info("Open login page 'MoodPanda'");
        loginPage.openLoginPage();
        LOGGER.info("Login with email: " + UserCredentials.EMAIL + "and with password: " + UserCredentials.PASSWORD);
        loginPage.login(UserCredentials.EMAIL, UserCredentials.PASSWORD);
        MainPage mainPage = new MainPage();
        LOGGER.info("Try to open Crisis center page" + WebUrls.BASE_URL.concat(WebUrls.CRISIS_CENTER_URL));
        mainPage.goToCrisisPage();
        CrisisCenterPage crisisCenterPage = new CrisisCenterPage();
        Assert.assertEquals(crisisCenterPage.crisisTitleIsExisted(), "Crisis center", "Crisis center page is not opened");
    }
}
