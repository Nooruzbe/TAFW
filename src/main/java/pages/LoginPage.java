package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import static javax.naming.spi.NamingManager.helper;

public class LoginPage {

    public loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath = "")
    public WebElement passwordInput;

    @FindBy(xpath = "")
    public WebElement loginButton;

    public LoginPage inputUserNameOrEmail(String userNameOrEmail){
        helper.sendKeys(passwordInput.password);
        return this;
    }

    public LoginPage clickLogin


}
