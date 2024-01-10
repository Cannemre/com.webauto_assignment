package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;

    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDragPositionLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronousResizeLink;

    @FindBy(linkText = "Textarea")
    private WebElement textareaLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autoCompleteLink;

    @FindBy(linkText = "Multiple & Remote")
    private WebElement multipleAndRemoteLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy (linkText = "Normal Iframe")
    private WebElement normalIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickHandlesLink() {
        handlesLink.click();
    }

    public void clickAcceptLink() {
        acceptLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSynchronousResizeLink() {
        synchronousResizeLink.click();
    }

    public void clickOnTextareaLink() {
        textareaLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnSerializeLink() {
        serializeLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnAutoCompleteLink() {
        autoCompleteLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnNormalIframeLink() {
        normalIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnMultipleAndRemoteLink() {
        multipleAndRemoteLink.click();
    }

    public void clickOnRevertDragPositionLink() {
        revertDragPositionLink.click();
    }
}
