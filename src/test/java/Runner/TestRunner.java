package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/*https://www.numpyninja.com/post/generating-various-cucumber-reports*/
@CucumberOptions(
        features = "src/test/resources/features/",
        glue =  { "StepDefinition", "hooks" },
        plugin = { "pretty"},
        monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
