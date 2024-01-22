package progressBarTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the Progress Bar button
 * 3. Click on the Download Dialog button
 * 4. Click on the Start Download button
 * 5. Verify download is complete
 */

public class ProgressBar_DownloadDialog_Test extends Hooks {
    @Test
    void testDownloadDialog() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Progress Bar button
        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnProgressBarLink();

        //3. Click on the Download Dialog button
        pages.getWebAutomationPage().clickOnDownloadDialogLink();

        //4. Click on the Start Download button
        pages.getProgressBarDownloadDialogPage().clickOnStartDownloadButton();
        BrowserUtils.wait(10);

        //5. Verify download is complete
        String expectedText = "Complete!";
        String actualText = pages.getProgressBarDownloadDialogPage().getDownloadItemText();
        Assertions.assertEquals(expectedText,actualText);

    }
}
