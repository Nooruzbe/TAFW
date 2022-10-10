package pages;

import helpers.Helper;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements();
    }
    Helper helper = new Helper();


}
