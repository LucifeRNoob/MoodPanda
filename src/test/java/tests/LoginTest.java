package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import staticdata.UserCredentials;

public class LoginTest extends BaseTest{

    @Test(description = "Login in MoodPanda with valid credentials")
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(UserCredentials.EMAIL, UserCredentials.PASSWORD);
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(),2,"Quantity of titles isn't expected");
    }
}
