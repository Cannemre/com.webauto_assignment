package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ModalForm_Page extends BasePage {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]")
    private List<WebElement> usersName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[2]")
    private List<WebElement> usersSurname;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[3]")
    private List<WebElement> usersEmail;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "surname")
    private WebElement surnameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }

    public void sendNameInput(String name) {
        nameInput.sendKeys(name);
    }

    public void sendSurnameInput(String surname) {
        surnameInput.sendKeys(surname);
    }

    public void sendEmailInput(String email) {
        emailInput.sendKeys(email);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public String getUserName(int userNumber) {
        return usersName.get(userNumber).getText();
    }

    public String getUserSurname(int userNumber) {
        return usersSurname.get(userNumber).getText();
    }

    public String getUserEmail(int userNumber) {
        return usersEmail.get(userNumber).getText();

    }
}
