package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver webDriver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option); // selectByVisibleText -->the text that we actually see in the dropdown options.
    }
    // getSelected Options find all the selected options in dropdown and converts the list of WebElement to stream of strings and return the list.
    public List<String> getSelectedOptions(){
    List<WebElement> selectedElements=findDropDownElement().getAllSelectedOptions();
    return  selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    // for dropdownElements we have Select class as if we write only webDriver.findElement then it will return WebElement
    // but dropdown is not a WebElement so for that we have select class
    // to include Select class we have to also add "selenium support dependency" in pom.xml that supports select class
    private Select findDropDownElement(){
        return new Select(webDriver.findElement(dropdown));
    }
}
