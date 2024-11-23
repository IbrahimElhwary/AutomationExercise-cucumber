package StepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void Precondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void PostCondition(){
        driver.quit();
    }
}
