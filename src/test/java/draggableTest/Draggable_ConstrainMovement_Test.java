package draggableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.Driver;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the draggable button
 * 3. click on the auto scrolling button
 * 4. Drag the first draggable element to the right and drop
 * 5. Verify that first draggable element do not move
 * 6. Drag the second draggable element to the up and drop
 * 7. Verify that second draggable element do not move
 * 8. Drag the third draggable element to the up and left and drop
 * 9. Verify that the third draggable element is inside the box
 * 10. Drag the third draggable element to the down and right and drop
 * 11. Verify that the third draggable element is inside the box
 * 12. Drag the fourth draggable element to the up and left and drop
 * 13. Verify that the fourth draggable element is inside the parent box
 * 14. Drag the fourth draggable element to the down and right and drop
 * 15. Verify that the fourth draggable element is inside the parent box
 */

public class Draggable_ConstrainMovement_Test extends Hooks {

    Pages pages = new Pages();
    @Test
    void testConstrainMovement() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();
        //3. Click on the auto scrolling button
        pages.getWebAutomationPage().clickConstrainMovementLink();
        //4. Drag the first draggable element to the right and drop
        int initialX = pages.getConstrainMovementPage().getLocationOfFirstDraggableX();
        pages.getConstrainMovementPage().dragFirstDraggableObject(100,0);
        //5. Verify that first draggable element do not move
        int finalX = pages.getConstrainMovementPage().getLocationOfFirstDraggableX();
        Assertions.assertEquals(finalX, initialX);
        //6. Drag the second draggable element to the up and drop
        int initialY = pages.getConstrainMovementPage().getLocationOfSecondDraggableY();
        pages.getConstrainMovementPage().dragSecondDraggableObject(0,100);
        //7. Verify that second draggable element do not move
        int finalY = pages.getConstrainMovementPage().getLocationOfSecondDraggableY();
        Assertions.assertEquals(finalY, initialY);
        //8. Drag the third draggable element to the up and left and drop
        pages.getConstrainMovementPage().dragThirdDraggableObject(-100,-100);
        //9. Verify that the third draggable element is inside the box
        finalX = pages.getConstrainMovementPage().getLocationThirdDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationThirdDraggableY();
        int bigBoxX = pages.getConstrainMovementPage().getLocationBigBoxX();
        int bigBoxY = pages.getConstrainMovementPage().getLocationBigBoxY();
        Assertions.assertTrue(finalX > bigBoxX);
        Assertions.assertTrue(finalY > bigBoxY);
        //10. Drag the third draggable element to the down and right and drop
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scroll(0,300)");
        Thread.sleep(1000);
        pages.getConstrainMovementPage().dragThirdDraggableObject(800,200);
        //11. Verify that the third draggable element is inside the box
        finalX = pages.getConstrainMovementPage().getLocationThirdDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationThirdDraggableY();
        int bigBoxEndX = pages.getConstrainMovementPage().getLocationBigBoxEndX();
        int bigBoxEndY = pages.getConstrainMovementPage().getLocationBigBoxEndY();
        Assertions.assertTrue(finalX < bigBoxEndX);
        Assertions.assertTrue(finalY < bigBoxEndY);
        //12. Drag the fourth draggable element to the up and left and drop
        pages.getConstrainMovementPage().dragFourthDraggableObject(-100,-100);
        //13. Verify that the fourth draggable element is inside the parent box
        finalX = pages.getConstrainMovementPage().getLocationFourthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationFourthDraggableY();
        int smallBoxX = pages.getConstrainMovementPage().getLocationSmallBoxX();
        int smallBoxY = pages.getConstrainMovementPage().getLocationSmallBoxY();
        Assertions.assertTrue(finalX > smallBoxX);
        Assertions.assertTrue(finalY > smallBoxY);
        //14. Drag the fourth draggable element to the down and right and drop
        pages.getConstrainMovementPage().dragFourthDraggableObject(100,100);
        //15. Verify that the fourth draggable element is inside the parent box
        finalX = pages.getConstrainMovementPage().getLocationFourthDraggableX();
        finalY = pages.getConstrainMovementPage().getLocationFourthDraggableY();
        int smallBoxEndX = pages.getConstrainMovementPage().getLocationSmallBoxEndX();
        int smallBoxEndY = pages.getConstrainMovementPage().getLocationSmallBoxEndY();
        Assertions.assertTrue(finalX < smallBoxEndX);
        Assertions.assertTrue(finalY < smallBoxEndY);

    }
}
