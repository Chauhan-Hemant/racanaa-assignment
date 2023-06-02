package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    /*
    Login page element's x-paths
     */
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /*
    Method to Set the Username on the Form Authentication page
     */
    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    /*
    Method to Set the password on the Form Authentication page
     */
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    /*
    Method to click on the login button which will go to SecureArea Page
     */
    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
