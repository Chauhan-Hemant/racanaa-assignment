package pages.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenInagesPage {

    private WebDriver driver;

    public BrokenInagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyBrokenImages() {
        List<WebElement> imageElements = driver.findElements(By.cssSelector("#content img"));
        for (WebElement element : imageElements) {
            String imageSrc = element.getAttribute("src");
            try {
                URL url = new URL(imageSrc);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int statusCode = connection.getResponseCode();
                if(statusCode == 200) {
                    System.out.println("Image " + imageSrc + " loaded successfully.");
                }
                else {
                    System.out.println("Image " + imageSrc + " failed to load. Status code: " + statusCode);
                }
            }
            catch (Exception ex) {
                System.out.println("Image "+ imageSrc + " failed to load. Exception: " + ex.getMessage());
            }
        }
    }
}
