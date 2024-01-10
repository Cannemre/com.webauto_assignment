package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_Accept_Page extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement firstDraggable;

    @FindBy(id = "draggable-accept")
    private WebElement secondDraggable;

    @FindBy(id = "droppable-accept")
    private WebElement droppableAccept;

    public void dragFirstDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(firstDraggable, xOffset, yOffset).perform();
    }

    public void dragSecondDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(secondDraggable, xOffset, yOffset).perform();
    }

    public String getDroppableAcceptText() {
       return droppableAccept.getText();
    }
}
