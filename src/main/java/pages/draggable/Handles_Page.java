package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {

    @FindBy(css = "#draggable13 > p")
    private WebElement draggable1;

    @FindBy(id = "draggable13")
    private WebElement draggableBox1;

    @FindBy(css = "#draggable14 > p")
    private WebElement draggable2;

    @FindBy(xpath = "//p[contains(text(),'but you')]")
    private WebElement notDraggable;

    @FindBy(id = "draggable14")
    private WebElement draggableBox2;

    public void dragByBox1(int xOffset, int yOffset) {
        actions.moveToElement(draggable1).dragAndDropBy(draggable1, xOffset, yOffset).build().perform();
    }

    public int getLocationOfBox1(String axis) {
        if (axis.equalsIgnoreCase("x")) {
            return draggableBox1.getLocation().getX();
        }
        return draggableBox1.getLocation().getY();
    }

    public void dragByBox2(int xOffset, int yOffset) {
        actions.moveToElement(draggable2).dragAndDropBy(draggable2, xOffset, yOffset).build().perform();
    }

    public void dragByBox2NotDraggable(int xOffset, int yOffset) {
        actions.moveToElement(notDraggable).dragAndDropBy(notDraggable, xOffset, yOffset).build().perform();
    }
    public int getLocationOfBox2(String axis) {
        if (axis.equalsIgnoreCase("x")) {
            return draggableBox2.getLocation().getX();
        }
        return draggableBox2.getLocation().getY();
    }


}
