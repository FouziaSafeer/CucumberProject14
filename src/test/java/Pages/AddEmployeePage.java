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


    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastNameTextBox;



    @FindBy(id="btnSave")
    public WebElement saveBtn;

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement employeeFirstNameValue;

    //personal_txtEmpMiddleName
    @FindBy(id="personal_txtEmpMiddleName")
    public WebElement employeeMiddleNameValue;

    //personal_txtEmpLastName
    @FindBy(id="personal_txtEmpLastName")
    public WebElement employeeLastNameValue;



    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

}
