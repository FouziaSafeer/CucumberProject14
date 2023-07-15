package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {
    @Then("user verify dashboard page")
    public void user_verify_dashboard_page() {
        System.out.println("happy");

    }
    @Then("user verify all the dashboard tabs")
    public void user_verify_all_the_dashboard_tabs(DataTable dataTable) {

        List<String> expectedTabs=dataTable.asList();

        List<String>actualTabs=new ArrayList<>(); //why need arry list to get the value in order
//for using data arry list work as it faster
        for (WebElement ele:dashboard.dashboardTabs) {

            actualTabs.add(ele.getText());

        }
//print the text for both feature and from application
        System.out.println(expectedTabs);
        System.out.println(actualTabs);

        //.equals is the method we use to compare two list togather
        Assert.assertTrue(expectedTabs.equals(actualTabs));//comparing two strings

    }
}
