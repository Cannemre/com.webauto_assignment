package autoComplateTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class AccentFolding_Test extends Hooks {

    @Test
    void testAccentFolding() {

        //1. Open the browser and navigate to the page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the auto complete button
        pages.getWebAutomationPage().clickOnAutoCompleteLink();

        //4. click on the Accent Folding button
        pages.getWebAutomationPage().clickOnAccentFoldingLink();

        //5. Enter "jo" in the text field
        pages.getAccentFoldingPage().sendInputAccentFoldingInput("jo");

        //6. Verify that the John Resig and Jörn Zaefferer is displayed in Suggestion menu
        Assertions.assertEquals("John Resig", pages.getAccentFoldingPage().getSuggestionMenu().get(1));
        Assertions.assertEquals("Jörn Zaefferer", pages.getAccentFoldingPage().getSuggestionMenu().get(0));

        //7. Enter "jö" in the text field
        pages.getAccentFoldingPage().sendInputAccentFoldingInput("jö");
        BrowserUtils.wait(1);

        //8. Verify that the Jörn Zaefferer is displayed in Suggestion menu
        Assertions.assertEquals("Jörn Zaefferer", pages.getAccentFoldingPage().getSuggestionMenu().get(0));
    }
}
