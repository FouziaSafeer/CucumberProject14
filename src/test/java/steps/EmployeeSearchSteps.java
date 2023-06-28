package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on EmployeeList Option")
    public void user_clicks_on_employee_list_option() {
        WebElement empListOption=driver.findElement(By.id("menu_pim_viewEmployeeList"));
            click(empListOption);
    }
    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {
        WebElement empIdFeild=driver.findElement(By.id("empsearch_id"));
        sendText(empIdFeild,"59707187");

    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement searchButton=driver.findElement(By.id("searchBtn"));
        click(searchButton);

    }
    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Employee information can be seen");

    }

}
