package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private By usernameField= By.id("username");
    private By passwordField=By.id("password");
    private By loginButton= By.cssSelector("#login button");
    public void setUsernameField(String username){
        webDriver.findElement(usernameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        webDriver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        webDriver.findElement(loginButton).click();
        return new SecureAreaPage(webDriver);
    }
}
