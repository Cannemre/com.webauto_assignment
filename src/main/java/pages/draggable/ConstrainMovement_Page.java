package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {
    @FindBy(id = "draggable5")
    private WebElement firstDraggable;
    @FindBy(id = "draggable6")
    private WebElement secondDraggable;
    @FindBy(id = "draggable7")
    private WebElement thirdDraggable;
    @FindBy(id = "draggable8")
    private WebElement fourthDraggable;
    @FindBy(id = "containment-wrapper")
    private WebElement bigBox;
    @FindBy(xpath = "//*[@id='containment-wrapper']/div[2]")
    private WebElement smallBox;

    public void dragFirstDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(firstDraggable, xOffset, yOffset).perform();
    }
    public void dragSecondDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(secondDraggable, xOffset, yOffset).perform();
    }
    public void dragThirdDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(thirdDraggable, xOffset, yOffset).perform();
    }
    public void dragFourthDraggableObject(int xOffset, int yOffset) {
        actions.dragAndDropBy(fourthDraggable, xOffset, yOffset).perform();
    }
    public int getLocationOfFirstDraggableX() {
        return firstDraggable.getLocation().getX();
    }
    public int getLocationOfSecondDraggableY() {
        return secondDraggable.getLocation().getY();
    }
    public int getLocationThirdDraggableX() {
        return thirdDraggable.getLocation().getX();
    }
    public int getLocationThirdDraggableY() {
        return thirdDraggable.getLocation().getY();
    }
    public int getLocationFourthDraggableX() {
        return fourthDraggable.getLocation().getX();
    }
    public int getLocationFourthDraggableY() {
        return fourthDraggable.getLocation().getY();
    }
    public int getLocationBigBoxX() {
        return bigBox.getLocation().getX();
    }
    public int getLocationBigBoxY() {
        return bigBox.getLocation().getY();
    }
    public int getLocationBigBoxEndX() {
        return getLocationBigBoxX() + bigBox.getSize().getWidth();
    }
    public int getLocationBigBoxEndY() {
        return getLocationBigBoxY() + bigBox.getSize().getHeight();
    }
    public int getLocationSmallBoxX() {
        return smallBox.getLocation().getX();
    }
    public int getLocationSmallBoxY() {
        return smallBox.getLocation().getY();
    }
    public int getLocationSmallBoxEndX() {
        return getLocationSmallBoxX() + smallBox.getSize().getWidth();
    }
    public int getLocationSmallBoxEndY() {
        return getLocationSmallBoxY() + smallBox.getSize().getHeight();
    }
}
