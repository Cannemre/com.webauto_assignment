package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

/**
 * 1. Land on home page
 * 2. Click on web automation link
 * 3.Click on Iframe link
 * 4.Click on Normal Iframe link
 * 5.Verify that the header text "Inar academy" In iframe
 */

public class NormalIframe_Test extends Hooks {

    @Test
    void testNormalIframe() {
        //1. Land on home page
        //2. Click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();

        //3.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();
        BrowserUtils.scrollUpWithPageUp();

        //4.Click on Normal Iframe link
        pages.getWebAutomationPage().clickOnNormalIframeLink();

        //5.Verify that the header text "Inar academy" In iframe
        String expectedHeader = "Inar academy";
        String actualHeader = pages.getNormalIframePage().getHeaderInFrame();
        Assertions.assertEquals(expectedHeader, actualHeader, "Wrong Header !");
    }


}
