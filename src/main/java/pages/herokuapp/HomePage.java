package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By fileUploadLink = By.linkText("File Upload");
    private By brokenImagesLink = By.linkText("Broken Images");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }

    public BrokenInagesPage clickBrokenImages() {
        driver.findElement(brokenImagesLink).click();
        return new BrokenInagesPage(driver);
    }
}