package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the default functionality button
 * 4.Drag the resize handle to resize the text area
 * 5.Verify that the text area has been resized
 */

public class Resizable_Textarea_Test extends Hooks {

    @Test
    void testTextArea() {
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3.Click on the synchronous resize button
        pages.getWebAutomationPage().clickOnTextareaLink();

        //4.Drag the resize handle to resize the text area
        int initialWidth = pages.getTextareaPage().getWidthOfResizableElement();
        int initialHeight = pages.getTextareaPage().getHeightOfResizableElement();
        pages.getTextareaPage().resizeTheWebElement(50,50);
        BrowserUtils.wait(1);

        //5.Verify that the text area has been resized
        int finalWidth = pages.getTextareaPage().getWidthOfResizableElement();
        int finalHeight = pages.getTextareaPage().getHeightOfResizableElement();
        Assertions.assertThat(finalWidth).isGreaterThan(initialWidth);
        Assertions.assertThat(finalHeight).isGreaterThan(initialHeight);
                
    }

}
