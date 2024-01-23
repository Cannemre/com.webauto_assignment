package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;



public class Icons_Test extends Hooks {

    @Test
    void testIcons() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Menu button
        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnMenuLink();

        //3. Click on the Icons button
        pages.getWebAutomationPage().clickOnIconsLink();

        //4. Click on the playback
        pages.getIconsPage().clickOnPlayback();
        BrowserUtils.wait(1);

        //Verify that the options are listed as prev > stop > play > next
        String[] expectedList = {"Prev", "Stop", "Play", "Next"};
        for (int i = 0; i < 4; i++) {
            Assertions.assertEquals(expectedList[i], pages.getIconsPage().getTextPlaybackList(i));
        }
    }

}
