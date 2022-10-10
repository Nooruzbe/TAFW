package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class Helper {
// chain of invocations

    public Helper waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;

    }

    public Helper waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
}

  public Helper click(WebElement element){
    waitElementToBeDisplayed(element);
    waitElementToBeClickable(element);
    element.click();
    return this;
    }

    public Helper sendKeys(WebElement element){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public String
}
