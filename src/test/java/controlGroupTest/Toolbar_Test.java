package controlGroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class Toolbar_Test extends Hooks {

    @Test
    void testToolbar() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Datepicker button
        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnControlGroupLink();

        //3. Click on the Display Multiple Months button
        pages.getWebAutomationPage().clickOnToolbarLink();

        //4. Select Red in Change Color Dropdown
        pages.getToolbarPage().chooseColour(3);
        BrowserUtils.wait(1);

        //5. Verify text color is red
        String expected = "zoom: 100%; width: 100%; min-height: 250px; font-weight: normal; font-style: normal; text-decoration: none; color: red;";
        Assertions.assertEquals(expected, pages.getToolbarPage().getColourName());
    }
}
