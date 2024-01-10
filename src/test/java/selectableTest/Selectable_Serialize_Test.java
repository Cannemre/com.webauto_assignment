package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on webautomation link
 * 3. Click on Selectable button
 * 4. Click on Serialize button
 * 5. Click on Item 5
 * 6. Verify that Item 5 is selected
 * 7. Verify that "You've selected: #5" is displayed
 * 8. Click on Item 6
 * 9. Verify that Item 6 is selected
 * 10. Verify that "You've selected: #6" is displayed
 * 11. Click on Item 1, Item 3 by holding down the Ctrl key
 * 12. Verify that Item 1, Item 3 are selected
 * 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
 * 14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 * 15. Verify that Item 1, Item 2, Item 3 are selected
 * 16. Verify that "You've selected: #1 #2 #3" is displayed
 */

public class Selectable_Serialize_Test extends Hooks {
    @Test
    void testSerialize() {
        //1. Open the browser and navigate to the URL
        //2. Click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Selectable button
        pages.getWebAutomationPage().clickOnSelectableLink();

        //4. Click on Serialize button
        pages.getWebAutomationPage().clickOnSerializeLink();

        //5. Click on Item 5
        JSUtils.executeJavaScript("window.scroll(0,500)");
        BrowserUtils.wait(1);
        pages.getSelectableSerializePage().getItemList().get(4).click();

        //6. Verify that Item 5 is selected
        boolean isSelected4 = pages.getSelectableSerializePage().getItemList().get(4).getAttribute("class").contains("ui-selected");
        Assertions.assertTrue(isSelected4, "good job");

        //7. Verify that "You've selected: #5" is displayed
        assertEquals("#5", pages.getSelectableSerializePage().getSelectMessage());

        //8. Click on Item 6
        pages.getSelectableSerializePage().getItemList().get(5).click();

        //9. Verify that Item 6 is selected
        boolean isSelected5 = pages.getSelectableSerializePage().getItemList().get(5).getAttribute("class").contains("ui-selected");
        Assertions.assertTrue(isSelected5, "good job");

        //10. Verify that "You've selected: #6" is displayed
        assertEquals("#6", pages.getSelectableSerializePage().getSelectMessage());

        //11. Click on Item 1, Item 3 by holding down the Ctrl key
        pages.getSelectableSerializePage().selectTwoItemWithControlKey(0,2);

        //12. Verify that Item 1, Item 3 are selected
        boolean isSelected1 = pages.getSelectableSerializePage().getItemList().get(0).getAttribute("class").contains("ui-selected");
        boolean isSelected3 = pages.getSelectableSerializePage().getItemList().get(2).getAttribute("class").contains("ui-selected");
        Assertions.assertTrue(isSelected1, "good job");
        Assertions.assertTrue(isSelected3, "good job");

        //13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
        assertEquals("#1 #3 #6", pages.getSelectableSerializePage().getSelectMessage());

        //14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
        pages.getSelectableSerializePage().selectThreeItemWithClickAndHold(0,1,2);

        //15. Verify that Item 1, Item 2, Item 3 are selected
        isSelected1 = pages.getSelectableSerializePage().getItemList().get(0).getAttribute("class").contains("ui-selected");
        isSelected3 = pages.getSelectableSerializePage().getItemList().get(2).getAttribute("class").contains("ui-selected");
        boolean isSelected2 = pages.getSelectableSerializePage().getItemList().get(1).getAttribute("class").contains("ui-selected");
        Assertions.assertTrue(isSelected1, "good job");
        Assertions.assertTrue(isSelected2, "good job");
        Assertions.assertTrue(isSelected3, "good job");

        //16. Verify that "You've selected: #1 #2 #3" is displayed
        assertEquals("#1 #2 #3", pages.getSelectableSerializePage().getSelectMessage());
    }
}
