package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_RevertDragPosition_Page extends BasePage {

    @FindBy(id = "draggable-revert-draggable")
    private WebElement firstDraggable;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement secondDraggable;

    public void dragFirstDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(firstDraggable, xOffset, yOffset).perform();
    }

    public void dragSecondDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(secondDraggable, xOffset, yOffset).perform();
    }

    public int getLocationOfFirstDraggableX() {
        return firstDraggable.getLocation().getX();
    }

    public int getLocationOfFirstDraggableY() {
        return firstDraggable.getLocation().getY();
    }

    public int getLocationOfSecondDraggableX() {
        return secondDraggable.getLocation().getX();
    }

    public int getLocationOfSecondDraggableY() {
        return secondDraggable.getLocation().getY();
    }

}
