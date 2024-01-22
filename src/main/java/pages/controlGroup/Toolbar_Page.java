package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class Toolbar_Page extends BasePage {

    @FindBy(id = "page")
    private WebElement textArea;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[3]")
    private WebElement colourField;

    public void chooseColour(int index) {
        Select select = new Select(colourField);
        select.selectByIndex(index);
    }

    public String getColourName() {
        return textArea.getAttribute("style");
    }
}
