package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    /*
    SecureArea page element's locators
     */
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver= driver;
    }

    /*
    Method to get the Alert message present on the SecureArea Page after successful login
     */
    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }
}
