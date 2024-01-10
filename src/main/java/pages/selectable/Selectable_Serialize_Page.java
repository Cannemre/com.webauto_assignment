package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Selectable_Serialize_Page extends BasePage {
    @FindBy(css = "#selectable-serialize > li")
    private List<WebElement> itemList;

    @FindBy(id = "select-result")
    private WebElement selectMessage;

    public void selectTwoItemWithControlKey(int a, int b) {
        actions.keyDown(Keys.CONTROL).click(itemList.get(a)).click(itemList.get(b)).keyUp(Keys.CONTROL).build().perform();
    }

    public void selectThreeItemWithClickAndHold(int a, int b, int c) {
        actions.clickAndHold(itemList.get(a)).moveToElement(itemList.get(b)).moveToElement(itemList.get(c)).release().build().perform();
    }

    public List<WebElement> getItemList() {
        return itemList;
    }

    public String getSelectMessage() {
        return selectMessage.getText();
    }
}
