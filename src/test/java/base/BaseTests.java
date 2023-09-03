package base;

import org.openqa.selenium.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver webDriver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/geckodriver");
        webDriver =new FirefoxDriver();
        webDriver.get("https://the-internet.herokuapp.com/");

//        List<WebElement> links=  webDriver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        WebElement inputslink= webDriver.findElement(By.linkText("Inputs"));
//        inputslink.click();
        homePage =new HomePage(webDriver);
        System.out.println(webDriver.getTitle());

    }
    @AfterClass
    public void tearDown(){
        webDriver.quit();
    }
}
