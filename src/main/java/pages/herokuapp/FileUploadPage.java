package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    /*
    File Upload page element's locators
     */
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    /*
    Method to click on upload button present on the File Upload page
     */
    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    /*
    Method to upload the file  on the File Upload page
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    /*
    Method to get the File name which got uploaded on File Upload page
    */
    public String getUploadedFiles() {
        return driver.findElement(uploadedFiles).getText();
    }
}
