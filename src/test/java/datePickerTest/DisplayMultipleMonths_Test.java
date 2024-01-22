package datePickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the Datepicker button
 * 3. Click on the Display Multiple Months button
 * 4. Click on the date button
 * 5. Verify that more than one month is shown
 */

public class DisplayMultipleMonths_Test extends Hooks {

    @Test
    void testDisplayMultipleMonths() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Datepicker button
        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnDatePickerLink();

        //3. Click on the Display Multiple Months button
        pages.getWebAutomationPage().clickOnDisplayMultipleMonths();

        //4. Click on the date button
        pages.getDisplayMultipleMonthsPage().clickOnDateButton();

        //5. Verify that more than one month is shown
        System.out.println(pages.getDisplayMultipleMonthsPage().getSizeDatePicker());
        Assertions.assertTrue(pages.getDisplayMultipleMonthsPage().getSizeDatePicker() > 1);
    }
}
