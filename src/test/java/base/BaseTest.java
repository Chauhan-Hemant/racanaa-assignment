package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.herokuapp.HomePage;
import utilities.DataFunctions;

import java.io.IOException;
import java.util.Map;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;
    DataFunctions df = new DataFunctions();
    Map<String , String> inputData;

    @BeforeClass
    public void setUp () throws IOException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        inputData = df.loadConfig();
        driver.get(inputData.get("url"));
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
