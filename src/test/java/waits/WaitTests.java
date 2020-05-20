package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading();
        var exampleLoadPage  = loadingPage.clickExample1();
        exampleLoadPage.clickStart();
        String loadedText = exampleLoadPage.getLoadedText();

        assertEquals(loadedText, "Hello World!", "Loaded text incorrect");
    }
}
