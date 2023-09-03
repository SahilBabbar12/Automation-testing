package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver webDriver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // generic method clicklink to find the element by linktext and click on that link...
    public void clickLink(String linkText){
        webDriver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(webDriver);
    }
    public DropDownPage clickDropDown(){
        clickLink("DropDown");
        return new DropDownPage(webDriver);
    }
}
