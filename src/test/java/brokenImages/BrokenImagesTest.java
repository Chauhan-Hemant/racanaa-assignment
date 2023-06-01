package brokenImages;

import base.BaseTest;
import org.testng.annotations.Test;

public class BrokenImagesTest extends BaseTest {

    @Test
    public void testBrokenImages() {
        var brokenImagePage = homepage.clickBrokenImages();
        brokenImagePage.verifyBrokenImages();
    }
}
