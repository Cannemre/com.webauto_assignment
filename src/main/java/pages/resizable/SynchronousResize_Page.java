package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SynchronousResize_Page extends BasePage {
    @FindBy(id = "resizable-synchr-resize")
    private WebElement firstResizableElement;

    @FindBy(css = "#resizable-synchr-resize > div.ui-icon")
    private WebElement firstResizeHandle;

    @FindBy(id = "also-synchr-resize")
    private WebElement secondResizableElement;

    @FindBy(css = "#also-synchr-resize > div.ui-icon")
    private WebElement secondResizeHandle;

    public void resizeTheFirstWebElementByOffsets(int xOffset, int yOffset) {
        actions.clickAndHold(firstResizeHandle).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void resizeTheSecondWebElementByOffsets(int xOffset, int yOffset) {
        actions.clickAndHold(secondResizeHandle).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public int getWidthOfFirstResizableElement() {
        return firstResizableElement.getSize().getWidth();
    }

    public int getHeightOfFirstResizableElement() {
        return firstResizableElement.getSize().getHeight();
    }

    public int getWidthOfSecondResizableElement() {
        return secondResizableElement.getSize().getWidth();
    }

    public int getHeightOfSecondResizableElement() {
        return secondResizableElement.getSize().getHeight();
    }
}
