package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Textarea_Page extends BasePage {
    @FindBy(id = "resizable-text-area-res")
    private WebElement resizableElement;

    @FindBy(css = ".ui-wrapper > div.ui-icon")
    private WebElement resizeHandle;

    public void resizeTheWebElement(int xOffset, int yOffset){
        actions.clickAndHold(resizeHandle).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public int getWidthOfResizableElement(){
        return resizableElement.getSize().getWidth();
    }

    public int getHeightOfResizableElement(){
        return resizableElement.getSize().getHeight();
    }
}
