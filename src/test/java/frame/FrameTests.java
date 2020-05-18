package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testEnterText(){
        String text1 = "hello";
        String text2 = "world";

        var framePage = homePage.clickFramePage();
        framePage.clearTextArea();
        framePage.setTextArea(text1);
        framePage.decreaseIndentation();
        framePage.setTextArea(text2);

        var text = framePage.getTextFromEditor();

        assertEquals(text, text1+text2, "Text from editor is incorrect");
    }
}
