package steps;

import Pages.AddEmployeePage;
import Pages.DashboardPage;
import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static DashboardPage dashboard;

    public static AddEmployeePage addEmployee;
   // public static

    public static void initializaPageObjects(){//this will initialize all the objects of our pages objects so we dont need
        //to creat
        login=new LoginPage();
        dashboard=new DashboardPage();
        addEmployee=new AddEmployeePage();
    }
}