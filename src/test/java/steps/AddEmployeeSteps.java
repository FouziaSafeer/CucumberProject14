package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on Pim option")
    public void user_clicks_on_pim_option() {
       WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
       pimOption.click();
    }


    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        WebElement addEmpBtn =driver.findElement(By.id("menu_pim_addEmployee"));
        addEmpBtn.click();

    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {
        WebElement firstnameTextBox=driver.findElement(By.id("firstName"));
        firstnameTextBox.sendKeys("fouziafaiza");
        WebElement lastNameTextBox=driver.findElement(By.id("lastName"));
        lastNameTextBox.sendKeys("safeerhajira");

    }
    @When("user click on save button")
    public void user_click_on_save_button() {
        WebElement saveBtn=driver.findElement(By.id("btnSave"));
        saveBtn.click();

    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added test case passed");

    }
}
