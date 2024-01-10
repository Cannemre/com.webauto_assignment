package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class MultipleAndRemote_Page extends BasePage {

    @FindBy(id = "tags-multipleremotes")
    private WebElement multipleRemoteInput;

    @FindBy(xpath = "//input[@id='tags-multipleremotes']/../span")
    private WebElement suggestionMessage;

    @FindBy(css = "#ui-id-43>li>div")
    private List<WebElement> suggestionMenu;

    public void sendInputMultipleRemoteInput(String input) {
        multipleRemoteInput.clear();
        multipleRemoteInput.sendKeys(input);
    }

    public boolean suggestionMenuIsDisplayed() {
        return suggestionMenu.size() > 0;
    }

    public void clearMultipleRemoteInput() {
        multipleRemoteInput.clear();
    }

    public String getSuggestionMessage() {
        return suggestionMessage.getText();
    }

    public List<String> getSuggestionMenu() {
        return suggestionMenu.stream().map(WebElement::getText).toList();
    }

    public boolean theElementInTheMenuStartWith(String text) {
        return getSuggestionMenu().stream().allMatch(e -> e.toLowerCase().startsWith(text.toLowerCase()));
    }
}
