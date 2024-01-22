package pages.datePicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SelectDateRange_Page extends BasePage {

    @FindBy(id = "from-selectDateRange")
    private WebElement fromInputField;

    @FindBy(id = "to-selectDateRange")
    private WebElement toInputField;

    @FindBy(xpath = "/html[1]/body[1]/div[8]/div/table[1]/tbody[1]/tr/td/a")
    private List<WebElement> calendar;



    public void clickOnFromInputField() {
        fromInputField.click();
    }

    public void clickOnToInputField() {
        toInputField.click();
    }

    public void chooseDayOnCalendar(int day) {
        calendar.get(day).click();
    }

    public String getTextFromField() {
        return fromInputField.getText();
    }

    public String getTextToField() {
        return toInputField.getText();
    }
}
