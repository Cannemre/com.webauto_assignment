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
 * 5. click on the Show Prompt button
 * 6. verify that alert text is "Enter your name:"
 * 7. send emre to text field
 * 8. click OK button
 * 9. verify that alert text is "Hello, emre!"
 * 10. confirm the alert
 */

public class AlertTypes_ShowPrompt_Test extends Hooks {

    @Test
    void testShowPromptAlert() {

        //1. Land on home page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the Alerts button
        JSUtils.executeJavaScript("window.scroll(0,500)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnAlertsLink();

        //4. click on the Alert Types button
        //5. click on the Show Prompt button
        pages.getAlertTypesPage().clickOnShowPromptButton();
        BrowserUtils.wait(1);

        //6. verify that alert text is "Enter your name:"
        String expectedText = "Enter your name:";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText,actualText,"Wrong Text Prompted !");

        //7. send emre to text field
        pages.getAlertTypesPage().enterInputIntoAlert("emre");

        //8. click OK button
        pages.getAlertTypesPage().confirmTheAlert();
        BrowserUtils.wait(1);

        //9. verify that alert text is "Hello, emre!"
        expectedText = "Hello, emre!";
        actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText,actualText,"Wrong Text Prompted !");

        //10. confirm the alert
        pages.getAlertTypesPage().confirmTheAlert();
    }
}
