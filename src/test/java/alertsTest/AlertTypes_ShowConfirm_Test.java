package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

/**
 * 1. Land on home page
 * 2. click on web automation link
 * 3. click on the Alerts button
 * 4. click on the Alert Types button
 * 5. click on the Show Confirm button
 * 6. verify that alert text is "Are you sure?"
 * 7. confirm the alert
 * 8. verify that alert text is "Confirmed!"
 */

public class AlertTypes_ShowConfirm_Test extends Hooks {

    @Test
    void testShowConfirmAlert() {

        //1. Land on home page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the Alerts button
        JSUtils.executeJavaScript("window.scroll(0,500)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnAlertsLink();

        //4. click on the Alert Types button
        //5. click on the Show Confirm button
        pages.getAlertTypesPage().clickOnShowConfirmButton();
        BrowserUtils.wait(1);

        //6. verify that alert text is "Are you sure?"
        String expectedText = "Are you sure?";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText,actualText,"Wrong Text Prompted !");

        //7. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();

        //8. verify that alert text is "Confirmed!"
        expectedText = "Confirmed!";
        actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText,actualText,"Wrong Text Prompted !");

    }


}
