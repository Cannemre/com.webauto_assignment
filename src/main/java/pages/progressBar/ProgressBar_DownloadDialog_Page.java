package pages.progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ProgressBar_DownloadDialog_Page extends BasePage {
    @FindBy(id = "downloadButton-download-dialog")
    private WebElement startDownloadButton;

    @FindBy(css = "#dialog-download-dialog")
    private WebElement downloadItem;

    public String getDownloadItemText() {
        return downloadItem.getText();
    }

    public void clickOnStartDownloadButton() {
        startDownloadButton.click();
    }
}
