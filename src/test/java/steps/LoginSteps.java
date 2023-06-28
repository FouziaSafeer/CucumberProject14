package steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonMethods {
   // WebDriver driver;//declare at class level
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
        /*WebDriverManager.chromedriver().setup();//liberary dependance we are using
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
    }

    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        LoginPage login=new LoginPage();

     //   WebElement usernameFeild=driver.findElement(By.id("txtUsername"));
       // WebElement passwordFeild=driver.findElement(By.id("txtPassword"));
        sendText(login.usernameTextFeild,ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextFeild,ConfigReader.getPropertyValue("password"));
        //usernameFeild.sendKeys(ConfigReader.getPropertyValue("username"));//now we changed these to common methods
        //for send keys
       // passwordFeild.sendKeys(ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        LoginPage login=new LoginPage();
       // WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        click(login.loginButton);//using commom methods, it will wait for element to be clickable then click
      //  loginBtn.click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        LoginPage login=new LoginPage();
       // WebElement welcomeMessage=driver.findElement(By.id("welcome"));
        String message= login.getWelcomeMessage.getText();
        if(login.getWelcomeMessage.isDisplayed()){
            System.out.println("test is passed");
        }else {
            System.out.println("Test is failed");
        }
        System.out.println(message);
    }


    @When("user enters valid  ess username and valid  ess password")
    public void user_enters_valid_ess_username_and_valid_ess_password() {
        LoginPage login =new LoginPage();
        //WebElement usernameFeild=driver.findElement(By.id("txtUsername"));
        sendText(login.usernameTextFeild, "Fouzia1");
       // WebElement passwordFeild=driver.findElement(By.id("txtPassword"));
        sendText(login.passwordTextFeild, "Fouzia1?");
    }

    @When("user enters invalid username and  password")
    public void user_enters_invalid_username_and_password() {
        LoginPage login =new LoginPage();
      //  WebElement usernameFeild=driver.findElement(By.id("txtUsername"));
        sendText(login.usernameTextFeild, "Fouzia");
      //  WebElement passwordFeild=driver.findElement(By.id("txtPassword"));
        sendText(login.passwordTextFeild, "Fouzia1");
    }



    @Then("error message displayed")
    public void error_message_displayed() {

        System.out.println("Error message invalid username and password");
    }

}
