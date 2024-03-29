package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.autoComplete.AccentFolding_Page;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.controlGroup.Toolbar_Page;
import pages.datePicker.DisplayMultipleMonths_Page;
import pages.datePicker.SelectDateRange_Page;
import pages.dialog.ModalForm_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Droppable_Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.Droppable_RevertDragPosition_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe_Page;
import pages.menu.Icons_Page;
import pages.progressBar.ProgressBar_DownloadDialog_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronousResize_Page;
import pages.resizable.Textarea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Selectable_Serialize_Page;

public class Pages {

    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private ConstrainMovement_Page constrainMovementPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Handles_Page handlesPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private Droppable_Accept_Page droppableAcceptPage;

    private Droppable_RevertDragPosition_Page droppableRevertDragPositionPage;

    private HomePage homePage;

    private NestedIframe_Page nestedIframePage;

    private NormalIframe_Page normalIframePage;

    private MultipleAndRemote_Page multipleAndRemotePage;

    private ProgressBar_DownloadDialog_Page progressBarDownloadDialogPage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private Selectable_Serialize_Page selectableSerializePage;

    private SynchronousResize_Page synchronousResizePage;

    private Textarea_Page textareaPage;

    private WebAutomationPage webAutomationPage;

    private DisplayMultipleMonths_Page displayMultipleMonthsPage;

    private AccentFolding_Page accentFoldingPage;

    private SelectDateRange_Page selectDateRangePage;

    private Toolbar_Page toolbarPage;

    private ModalForm_Page modalFormPage;

    private Icons_Page iconsPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovementPage = new ConstrainMovement_Page();
        droppableAcceptPage = new Droppable_Accept_Page();
        multipleAndRemotePage = new MultipleAndRemote_Page();
        droppableRevertDragPositionPage = new Droppable_RevertDragPosition_Page();
        synchronousResizePage = new SynchronousResize_Page();
        textareaPage = new Textarea_Page();
        selectableSerializePage = new Selectable_Serialize_Page();
        normalIframePage = new NormalIframe_Page();
        progressBarDownloadDialogPage = new ProgressBar_DownloadDialog_Page();
        displayMultipleMonthsPage = new DisplayMultipleMonths_Page();
        accentFoldingPage = new AccentFolding_Page();
        selectDateRangePage = new SelectDateRange_Page();
        toolbarPage = new Toolbar_Page();
        modalFormPage = new ModalForm_Page();
        iconsPage = new Icons_Page();
        handlesPage = new Handles_Page();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage() {
        return nestedIframePage;
    }

    public NormalIframe_Page getNormalIframePage() {return normalIframePage;}

    public AlertTypes_Page getAlertTypesPage() {
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage() {
        return animatePage;
    }

    public ConstrainMovement_Page getConstrainMovementPage() {
        return constrainMovementPage;
    }

    public Droppable_Accept_Page getDroppableAcceptPage() {
        return droppableAcceptPage;
    }

    public MultipleAndRemote_Page getMultipleAndRemotePage() {
        return multipleAndRemotePage;
    }

    public Droppable_RevertDragPosition_Page getDroppableRevertDragPositionPage() {
        return droppableRevertDragPositionPage;
    }

    public SynchronousResize_Page getSynchronousResizePage() {
        return synchronousResizePage;
    }

    public Textarea_Page getTextareaPage() {
        return textareaPage;
    }

    public Selectable_Serialize_Page getSelectableSerializePage() {
        return selectableSerializePage;
    }

    public ProgressBar_DownloadDialog_Page getProgressBarDownloadDialogPage() {return progressBarDownloadDialogPage;}

    public DisplayMultipleMonths_Page getDisplayMultipleMonthsPage() {return displayMultipleMonthsPage;}

    public AccentFolding_Page getAccentFoldingPage() {return accentFoldingPage;}

    public SelectDateRange_Page getSelectDateRangePage() {return selectDateRangePage;}

    public Toolbar_Page getToolbarPage() {return toolbarPage;}

    public ModalForm_Page getModalFormPage() {return modalFormPage;}

    public Icons_Page getIconsPage() {return iconsPage;}

    public Handles_Page getHandlesPage() {return handlesPage;}
}
