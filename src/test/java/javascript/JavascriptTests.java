package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollIntoView(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public  void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);

    }
}
