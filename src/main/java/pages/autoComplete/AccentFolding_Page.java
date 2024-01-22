package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFolding_Page extends BasePage {

    @FindBy(id = "developer-accentFolding")
    private WebElement accentFoldingInput;

    @FindBy(css = "#ui-id-40>li>div")
    private List<WebElement> suggestionMenu;

    public List<String> getSuggestionMenu() {
        return suggestionMenu.stream().map(WebElement::getText).toList();
    }

    public void sendInputAccentFoldingInput(String input) {
        accentFoldingInput.clear();
        accentFoldingInput.sendKeys(input);
    }
}
