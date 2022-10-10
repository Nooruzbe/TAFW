package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){
        try {
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "Image/png", "screenshot");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Driver.closeDriver();
    }
}
