/*
package CucumberTool;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepsDefClass {
    WebDriver driver;//declare at class level
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        WebDriverManager.chromedriver().setup();//liberary dependance we are using
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {

        WebElement usernameFeild=driver.findElement(By.id("txtUsername"));
        WebElement passwordFeild=driver.findElement(By.id("txtPassword"));
        usernameFeild.sendKeys("admin");
        passwordFeild.sendKeys("Hum@nhrm123");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {

       WebElement welcomeMessage=driver.findElement(By.id("welcome"));
      String message= welcomeMessage.getText();
      if(welcomeMessage.isDisplayed()){
          System.out.println("test is passed");
      }else {
          System.out.println("Test is failed");
      }
        System.out.println(message);
    }



    @Then("user verify dashboard page")
    public void user_verify_dashboard_page() {

    }

}
*/
