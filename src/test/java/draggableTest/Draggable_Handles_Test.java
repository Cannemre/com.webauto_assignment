package draggableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Draggable_Handles_Test extends Hooks {

    @Test
    void testHandles() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. click on the handles button
        pages.getWebAutomationPage().clickOnHandlesLink();

        //4. Drag the second draggable element with "you can drag me around" text
        int initialX = pages.getHandlesPage().getLocationOfBox2("x");
        pages.getHandlesPage().dragByBox2(100, 0);
        BrowserUtils.wait(1);

        //5. Verify that the element has been dragged
        int finalX = pages.getHandlesPage().getLocationOfBox2("x");
        Assertions.assertThat(finalX).isGreaterThan(initialX);

        //6. Drag the second draggable element with "…but you can't drag me by this handle." text
        initialX = pages.getHandlesPage().getLocationOfBox2("x");
        pages.getHandlesPage().dragByBox2NotDraggable(100, 0);
        BrowserUtils.wait(1);

        //7. Verify that the element has not dragged
        finalX = pages.getHandlesPage().getLocationOfBox2("x");
        org.junit.jupiter.api.Assertions.assertEquals(initialX, finalX);
    }
}
