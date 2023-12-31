package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(){

        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);//configreader is class which read
        switch (ConfigReader.getPropertyValue("browser")){
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            break;
            case "fireFox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
    driver.manage().window().maximize();
      driver.get(ConfigReader.getPropertyValue("url"));
      driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
         initializaPageObjects();//to initialize all pages objects
    }
    public static void closeBrowser(){
        driver.quit();
    }



    //we use this method instead of send keys
    public static void sendText(WebElement element,String textToSend)
    {  element.clear();
        element.sendKeys(textToSend);

    }
        //to get webdriver wait
        public static WebDriverWait getWait(){
        WebDriverWait wait =new WebDriverWait(driver,Constants.EXPLICIT_WAIT);
    return  wait;
    }

    public static void waitForClickablity(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
//this method will perform click operation but before click, it will wait for element to be clickable
    public static void click(WebElement element){
        waitForClickablity(element);
        element.click();
    }
// in which condition we use Java script executor, to scroll, to high light, mouse and keybord action
    //this method will return JavaScript Executor object
    public static JavascriptExecutor getJSExecutor(){
JavascriptExecutor js=(JavascriptExecutor) driver;
return js;
    }
//this method will perform click on element using javascript executor
    public static void jsClick(WebElement element){
        getJSExecutor().executeScript("arguments[0].click();",element);
    }
//selecting dropdown using text
    public static void selectDropdown(WebElement element,String text){

    Select s=new Select(element);
    s.selectByVisibleText(text);

}





}
