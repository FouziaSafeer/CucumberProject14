package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {


    @FindBy(id="firstName")
    public WebElement firstnameTextBox;




    @FindBy(id="lastName")
    public WebElement lastNameTextBox;



    @FindBy(id="btnSave")
    public WebElement saveBtn;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

}
