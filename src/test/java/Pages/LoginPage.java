package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameTextFeild;


    @FindBy(id="txtPassword")
    public WebElement passwordTextFeild;

    @FindBy(id="btnLogin")
    public WebElement loginButton;
    //
   // WebElement welcomeMessage=driver.findElement(By.id("welcome"));


    @FindBy(id="spanMessage")
    public WebElement getErrorMessage;

    //how to implement in our code, what is the concept of constructor
    //inicialize object,variables, constructor  the block of code having same name as our class name
    //e.g loginpage(){}

   public LoginPage(){
//call selenium paghe factory generally initailze all webelements, this refer to current class object or its pointer
       //pointing to current class object
       PageFactory.initElements(driver,this);
   }


}
