package utils;

import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
        //singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
            }
        }

        return driver;
    }
    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;

                }
            }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
