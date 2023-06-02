package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    /*
    Home page element's x-paths
     */
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By fileUploadLink = By.linkText("File Upload");
    private By brokenImagesLink = By.linkText("Broken Images");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    /*
    Method to click on the Form Authentication Link present on the Home page
     */
    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    /*
    Method to click on the File Upload Link present on the Home page
     */
    public FileUploadPage clickFileUpload() {
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }

    /*
    Method to click on the Broken Images Link present on the Home page
     */
    public BrokenInagesPage clickBrokenImages() {
        driver.findElement(brokenImagesLink).click();
        return new BrokenInagesPage(driver);
    }
}