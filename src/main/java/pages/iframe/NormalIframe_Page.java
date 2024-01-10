package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframe_Page extends BasePage {

    @FindBy(css = "h1")
    private WebElement headerInFrame;

    @FindBy(id = "nestedIframe")
    private WebElement iFrameElement;

    public void switchToIFrame(){
        DRIVER.switchTo().frame(iFrameElement);
    }

    public String getHeaderInFrame(){
        switchToIFrame();
        return headerInFrame.getText();
    }
}
