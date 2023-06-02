package fileUpload;

import base.BaseTest;
import org.testng.annotations.Test;
import utilities.DataFunctions;

import java.io.File;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    DataFunctions df = new DataFunctions();
    Map<String, String > testData;

    @Test
    public void testFileUpload() {
        var uploadPage = homepage.clickFileUpload();
        testData = df.readJsonTestData("testData.herokuapp/FileUpload");

        uploadPage.uploadFile(System.getProperty("user.dir")+ File.separator +"resources"+File.separator+testData.get("filename"));
        assertEquals(uploadPage.getUploadedFiles(), testData.get("filename"), testData.get("message"));
    }
}
