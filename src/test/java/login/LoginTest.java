package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.herokuapp.LoginPage;
import pages.herokuapp.SecureAreaPage;
import utilities.DataFunctions;

import java.util.Map;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    DataFunctions df = new DataFunctions();
    Map<String, String> testData ;

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginpage = homepage.clickFormAuthentication();
        testData = df.readJsonTestData("testData.herokuapp/LoginTestData");
        loginpage.setUsername(testData.get("username"));
        loginpage.setPassword(testData.get("password"));
        SecureAreaPage secureAreaPage = loginpage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}