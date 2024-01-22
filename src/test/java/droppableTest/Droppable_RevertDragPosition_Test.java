package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the droppable button
 * 3. Click on the accept button
 * 4. Drag the first draggable element to box
 * 5. Verify first element is reverted
 * 6. Drag the second draggable element to box
 * 7. Verify second element is not reverted
 */

public class Droppable_RevertDragPosition_Test extends Hooks {
    @Test
    void testRevertDragPosition() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the draggable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. Click on the auto scrolling button
        pages.getWebAutomationPage().clickOnRevertDragPositionLink();

        //4. Drag the first draggable element to box
        int initialX = pages.getDroppableRevertDragPositionPage().getLocationOfFirstDraggableX();
        int initialY = pages.getDroppableRevertDragPositionPage().getLocationOfFirstDraggableY();
        pages.getDroppableRevertDragPositionPage().dragFirstDraggableObject(250,10);
        BrowserUtils.wait(1.5);

        //5. Verify first element is reverted
        int finalX = pages.getDroppableRevertDragPositionPage().getLocationOfFirstDraggableX();
        int finalY = pages.getDroppableRevertDragPositionPage().getLocationOfFirstDraggableY();
        Assertions.assertEquals(initialX,finalX);
        Assertions.assertEquals(initialY,finalY);

        //6. Drag the second draggable element to box
        initialX = pages.getDroppableRevertDragPositionPage().getLocationOfSecondDraggableX();
        initialY = pages.getDroppableRevertDragPositionPage().getLocationOfSecondDraggableY();
        pages.getDroppableRevertDragPositionPage().dragSecondDraggableObject(150,10);
        BrowserUtils.wait(1.5);

        //7. Verify first element is not reverted
        finalX = pages.getDroppableRevertDragPositionPage().getLocationOfSecondDraggableX();
        finalY = pages.getDroppableRevertDragPositionPage().getLocationOfSecondDraggableY();
        Assertions.assertNotEquals(initialX,finalX);
        Assertions.assertNotEquals(initialY,finalY);

    }
}
