import cucumber.api.java.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.WrapWebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps")
public class TestRunner {

    @AfterClass
    public static void afterAll(){
        System.out.println("This will run after all");
        WrapWebDriver.getInstance().close();
    }
}

