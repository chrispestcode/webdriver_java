package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ShiftingContentMenuElementPage {

    private final WebDriver driver;
    private By menuItem = By.tagName("li");

    public ShiftingContentMenuElementPage (WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getMenuElements(){
          List<WebElement> menuItems = driver.findElements(menuItem);
          return menuItems.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
