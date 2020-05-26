package shiftingcontent;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ShiftingContentPage;

import static org.testng.Assert.assertEquals;

public class ShiftingContentTest extends BaseTests {

    @Test
    public void testMenuCount(){
        var shiftingContentPage = homePage.clickShiftingContent().clickMenuElement();
        var menuElements = shiftingContentPage.getMenuElements();
        assertEquals(menuElements.size(), 5);
        assert(menuElements.contains("Portfolio"));
    }
}
