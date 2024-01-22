package datePickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class SelectDateRange_Test extends Hooks {
    @Test
    void testDisplayMultipleMonths() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Datepicker button
        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnDatePickerLink();

        //3. Click on the Display Multiple Months button
        pages.getWebAutomationPage().clickOnSelectDateRangeLink();

        //4. Click on the from button
        pages.getSelectDateRangePage().clickOnFromInputField();

        //5. Choose Day "5"
        pages.getSelectDateRangePage().chooseDayOnCalendar(5);

        //6. Click on the to button
        pages.getSelectDateRangePage().clickOnToInputField();

        //7. Choose Day "6"
        pages.getSelectDateRangePage().chooseDayOnCalendar(2);

        //8. Verify that the selection was made correctly
        Assertions.assertEquals("01/05/2024", pages.getSelectDateRangePage().getTextFromField());
        Assertions.assertEquals("01/06/2024", pages.getSelectDateRangePage().getTextToField());

    }
}
