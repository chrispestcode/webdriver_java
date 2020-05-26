package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {

    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_MenuElement = By.xpath(String.format(linkXpath_Format, "Example 1: Menu Element"));

    public ShiftingContentPage (WebDriver driver) {
        this.driver = driver;
    }

    public ShiftingContentMenuElementPage clickMenuElement(){
        driver.findElement(link_MenuElement).click();
        return new ShiftingContentMenuElementPage(driver);
    }



}
