package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BrowserUtils;
import utils.Driver;

/**
 * 1.Open the browser and navigate to the page
 * 2.Click on the resizable button
 * 3.Click on the synchronous resize button
 * 4.Drag the resize handle to resize the first resizable element
 * 5.Verify that the first and second resizable element has been resized
 * 6.Drag the resize handle to resize the second resizable element
 * 7.Verify that the second resizable element has been resized and first resizable element has been not resized
 */

public class Resizable_SynchResize_Test extends Hooks {
    @Test
    void testSynchronousResize() {
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3.Click on the synchronous resize button
        pages.getWebAutomationPage().clickOnSynchronousResizeLink();

        //4.Drag the resize handle to resize the first resizable element
        int initialWidth1 = pages.getSynchronousResizePage().getWidthOfFirstResizableElement();
        int initialHeight1 = pages.getSynchronousResizePage().getHeightOfFirstResizableElement();
        int initialWidth2 = pages.getSynchronousResizePage().getWidthOfSecondResizableElement();
        int initialHeight2 = pages.getSynchronousResizePage().getHeightOfSecondResizableElement();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getSynchronousResizePage().resizeTheFirstWebElementByOffsets(50,50);
        BrowserUtils.wait(1);

        //5.Verify that the first and second resizable element has been resized
        int finalWidth1 = pages.getSynchronousResizePage().getWidthOfFirstResizableElement();
        int finalHeight1 = pages.getSynchronousResizePage().getHeightOfFirstResizableElement();
        int finalWidth2 = pages.getSynchronousResizePage().getWidthOfSecondResizableElement();
        int finalHeight2 = pages.getSynchronousResizePage().getHeightOfSecondResizableElement();
        Assertions.assertThat(finalWidth1).isGreaterThan(initialWidth1);
        Assertions.assertThat(finalHeight1).isGreaterThan(initialHeight1);
        Assertions.assertThat(finalWidth2).isGreaterThan(initialWidth2);
        Assertions.assertThat(finalHeight2).isGreaterThan(initialHeight2);

        //6.Drag the resize handle to resize the second resizable element
        initialWidth1 = pages.getSynchronousResizePage().getWidthOfFirstResizableElement();
        initialHeight1 = pages.getSynchronousResizePage().getHeightOfFirstResizableElement();
        initialWidth2 = pages.getSynchronousResizePage().getWidthOfSecondResizableElement();
        initialHeight2 = pages.getSynchronousResizePage().getHeightOfSecondResizableElement();
        pages.getSynchronousResizePage().resizeTheSecondWebElementByOffsets(50,50);
        BrowserUtils.wait(1);

        //7.Verify that the second resizable element has been resized and first resizable element has been not resized
        finalWidth1 = pages.getSynchronousResizePage().getWidthOfFirstResizableElement();
        finalHeight1 = pages.getSynchronousResizePage().getHeightOfFirstResizableElement();
        finalWidth2 = pages.getSynchronousResizePage().getWidthOfSecondResizableElement();
        finalHeight2 = pages.getSynchronousResizePage().getHeightOfSecondResizableElement();
        org.junit.jupiter.api.Assertions.assertEquals(initialWidth1,finalWidth1);
        org.junit.jupiter.api.Assertions.assertEquals(initialHeight1,finalHeight1);
        Assertions.assertThat(finalWidth2).isGreaterThan(initialWidth2);
        Assertions.assertThat(finalHeight2).isGreaterThan(initialHeight2);
    }

}
