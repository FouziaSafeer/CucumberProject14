package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files, soo all feature files can run

        features =
                "src/test/resources/features" //run all feature feature classes
                        ,glue = "steps"
        //when we set true, it stops actual execution,it will quickly scan all ghirkin steps whether they are implemented or not
        ,dryRun = false,
        tags = "@sprint3" ,// ""@sprint1 or @sprint2 it will execute both, to group the sinario or specific type of execution
        monochrome = true ,//to remove irrleavent information from console
        plugin = {"pretty"}// pretty keywords prints the steps in the console to increase readibility
)

public class SmokeRunner {

}
