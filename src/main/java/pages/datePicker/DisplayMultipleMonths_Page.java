package pages.datePicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayMultipleMonths_Page extends BasePage {
    @FindBy(css = "#ui-datepicker-div>div")
    private List<WebElement> datePicker;

    @FindBy (id = "datepicker-multiple-months")
    private WebElement dateButton;

    public void clickOnDateButton() {
        dateButton.click();
    }

    public int getSizeDatePicker() {
        return datePicker.size();
    }
}
