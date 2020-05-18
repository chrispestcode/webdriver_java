package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public FramePage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToEditor();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor() {
        switchToEditor();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndentation() {
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToEditor() {
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
