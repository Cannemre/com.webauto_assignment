package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class ModalForm_Test extends Hooks {

    @Test
    void testModalForm() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the Datepicker button
        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(1);
        pages.getWebAutomationPage().clickOnDialogLink();

        //3. Click on the Display Multiple Months button
        pages.getWebAutomationPage().clickOnModalFormLink();

        //4. Click on the Create Account button
        pages.getModalFormPage().clickOnCreateAccountButton();

        //5. Enter user information
        pages.getModalFormPage().sendNameInput("emre");
        pages.getModalFormPage().sendSurnameInput("can");
        pages.getModalFormPage().sendEmailInput("crazyemre@hotmail.com");

        //6. Click on the submit button
        pages.getModalFormPage().clickOnSubmitButton();

        //7. Verify user information
        String expected = "emre";
        Assertions.assertEquals(expected, pages.getModalFormPage().getUserName(1));
        expected = "can";
        Assertions.assertEquals(expected, pages.getModalFormPage().getUserSurname(1));
        expected = "crazyemre@hotmail.com";
        Assertions.assertEquals(expected, pages.getModalFormPage().getUserEmail(1));

    }
}
