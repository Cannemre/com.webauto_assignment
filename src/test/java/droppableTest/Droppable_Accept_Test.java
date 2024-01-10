package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the droppable button
 * 3. Click on the accept button
 * 4. Drag the first draggable element to accept box
 * 5. Verify that the first draggable element is not accepted
 * 6. Drag the second draggable element to accept box
 * 7. Verify that the second draggable element is accepted
 */

public class Droppable_Accept_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    void testAccept() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. Click on the draggable button
        pages.getWebAutomationPage().clickOnDroppableLink();
        //3. Click on the auto scrolling button
        pages.getWebAutomationPage().clickAcceptLink();
        //4. Drag the first draggable element to accept box
        pages.getDroppableAcceptPage().dragFirstDraggableObject(250,10);
        //5. Verify that the first draggable element is not accepted
        String expectedText = "accept: '#draggable'";
        String actualText = pages.getDroppableAcceptPage().getDroppableAcceptText();
        Assertions.assertEquals(expectedText, actualText);
        //6. Drag the second draggable element to accept box
        pages.getDroppableAcceptPage().dragSecondDraggableObject(150,10);
        //7. Verify that the second draggable element is accepted
        expectedText = "Dropped!";
        actualText = pages.getDroppableAcceptPage().getDroppableAcceptText();
        Assertions.assertEquals(expectedText, actualText);
    }
}
