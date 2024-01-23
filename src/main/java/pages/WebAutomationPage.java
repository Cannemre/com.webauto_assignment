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

    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBar;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialog;

    @FindBy(linkText = "Datepicker")
    private WebElement datePicker;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonths;

    @FindBy(linkText = "Accent Folding")
    private WebElement accentFolding;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRange;

    @FindBy (linkText = "Control Group")
    private WebElement controlGroup;

    @FindBy(linkText = "Toolbar")
    private WebElement toolbar;

    @FindBy(linkText = "Dialog")
    private WebElement dialog;

    @FindBy(linkText = "Modal Form")
    private WebElement modalForm;

    @FindBy(linkText = "Menu")
    private WebElement menu;

    @FindBy(linkText = "Icons")
    private WebElement icons;

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

    public void clickOnProgressBarLink() {
        progressBar.click();
    }

    public void clickOnDownloadDialogLink() {
        downloadDialog.click();
    }

    public void clickOnDatePickerLink() {
        datePicker.click();
    }

    public void clickOnDisplayMultipleMonths() {
        displayMultipleMonths.click();
    }

    public void clickOnAccentFoldingLink() {
        accentFolding.click();
    }

    public void clickOnSelectDateRangeLink() {
        selectDateRange.click();
    }

    public void clickOnToolbarLink() {
        toolbar.click();
    }

    public void clickOnControlGroupLink() {
        controlGroup.click();
    }

    public void clickOnDialogLink() {
        dialog.click();
    }

    public void clickOnModalFormLink() {
        modalForm.click();
    }

    public void clickOnMenuLink() {
        menu.click();
    }

    public void clickOnIconsLink() {
        icons.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }
}
