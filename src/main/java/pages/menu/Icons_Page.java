package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Icons_Page extends BasePage {

    @FindBy(id = "ui-id-76")
    private WebElement playback;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[13]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li/div")
    private List<WebElement> playbackList;

    public String getTextPlaybackList(int index) {
        return playbackList.get(index).getText();
    }

    public List<WebElement> getPlaybackList() {
        return playbackList;
    }

    public void clickOnPlayback() {
        playback.click();
    }
}
