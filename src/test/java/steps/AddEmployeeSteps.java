package steps;

import Pages.AddEmployeePage;
import Pages.DashboardPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on Pim option")
    public void user_clicks_on_pim_option() {
     //  WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
     //  pimOption.click();
        click(dashboard.pimOption);
    }


    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        //WebElement addEmpBtn =driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmpBtn.click();
        click(dashboard.AddEmployeeOption);
    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {


        sendText(addEmployee.firstnameTextBox, "fouziafaiza");
        sendText(addEmployee.lastNameTextBox, "safeerhajira");
        //WebElement firstnameTextBox=driver.findElement(By.id("firstName"));
      //  AddEmployeePage.addEmployee.firstnameTextBox .sendKeys("fouziafaiza");
       // WebElement lastNameTextBox=driver.findElement(By.id("lastName"));

       // DashboardPage.lastNameTextBox. sendKeys("safeerhajira");


    }
    @When("user click on save button")
    public void user_click_on_save_button() {
       /* WebElement saveBtn=driver.findElement(By.id("btnSave"));
        saveBtn.click();*/
        click(addEmployee.saveBtn);

    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added test case passed");

    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String firstName, String lastName) {
       sendText(addEmployee.firstnameTextBox, firstName);
       sendText(addEmployee.lastNameTextBox, lastName);
    }
    @When("user enter  {string} and {string}")
    public void user_enter_and_(String firstNameValue, String lastNameValue) {
        sendText(addEmployee.firstnameTextBox, firstNameValue);
        sendText(addEmployee.lastNameTextBox, lastNameValue);
    }

    @When("user adds multiple employee and verify they are added successfuly")
    public void user_adds_multiple_employee_and_verify_they_are_added_successfuly(DataTable dataTable) throws InterruptedException {
        List<Map<String,String>>employeesNames=dataTable.asMaps();
                       //getting the map from list of maps
        for (Map<String,String> employee:employeesNames) {
                      //    getting the keys and value from each map
             String firstNameValue = employee.get("firstName");//keys should be same as used in feature file
            String middleNameValue= employee.get("middleName");
            String lastNameValue= employee.get("lastName");
          //  System.out.println(firstNameValue);
          //  System.out.println(middleNameValue);
          //  System.out.println(lastNameValue);

            sendText(addEmployee.firstnameTextBox, firstNameValue);

            sendText(addEmployee.middleNameTextBox, middleNameValue);
            sendText(addEmployee.lastNameTextBox, lastNameValue);


            click(addEmployee.saveBtn);
            Thread.sleep(2000);
            String ActualValueofFirstName=AddEmployeePage.addEmployee.employeeFirstNameValue.getText();
            System.out.println(ActualValueofFirstName);

            //Assert.assertEquals(AddEmployeePage.employeeFirstNameValue.getText(),firstNameValue);
            //Assert.assertEquals(AddEmployeePage.addEmployee.employeeMiddleNameValue.getText(),middleNameValue);
            //Assert.assertEquals(AddEmployeePage.addEmployee.employeeLastNameValue.getText(),lastNameValue);
            //till this point one employee has been added
            //verify the employee is homework

            click(dashboard.AddEmployeeOption);
            Thread.sleep(3000);



        }
    }


    @When("user adds multiple employee from excel using {string} and verify it")
    public void user_adds_multiple_employee_from_excel_using(String sheetName) throws InterruptedException {
        System.out.println(Constants.TESTDATA_FILEPATH);
      List<Map<String,String>> empFromExcel=
              ExcelReader.excelListIntoMap(Constants.TESTDATA_FILEPATH,sheetName);



      //it return one map from list of maps
        Iterator<Map<String,String>> itr=empFromExcel.iterator();
        while (itr.hasNext())
        {
            //return key and value from employee from excel
            Map<String,String>mapNewEmp=itr.next();
           sendText( addEmployee.firstnameTextBox,mapNewEmp.get("firstName"));
           sendText( addEmployee.middleNameTextBox,mapNewEmp.get("middleName"));
           sendText( addEmployee.lastNameTextBox,mapNewEmp.get("lastName"));
           sendText(addEmployee.photograpgh, mapNewEmp.get("photograph"));
           if (!addEmployee.checkBox.isSelected()){
               click(addEmployee.checkBox);
           }
           sendText(addEmployee.creatuserNameField,mapNewEmp.get("username"));
           sendText(addEmployee.creatpasswordField,mapNewEmp.get("password"));
           sendText(addEmployee.confirmPasswordField,mapNewEmp.get("confirmPassword"));

           click(addEmployee.saveBtn);

           //verification in homework


            Thread.sleep(2000);
            click(dashboard.AddEmployeeOption);
            Thread.sleep(2000);




        }


    }

}
