package testBases;

import dataReader.Load_Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

//import static model.CustomWebDriver.initDriver;


public abstract class TestBase {

    /************************************OBJECTS_DECLARATIONS/INSTANTIATIONS*****************************/
    protected WebDriver driver;

    /**************************************GLOBAL_VARIABLES***********************************************/
    private String url="https://www.saucedemo.com/";;
    private final String browser = "chrome";

    /******************************************METHODS**************************************************/

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp_Environment()
    {
        switch (browser)
        {
            case "chrome" : driver = new ChromeDriver();break;
            case "firefox" : driver = new FirefoxDriver();break;
            case "edge" : driver = new EdgeDriver();break;
            default : driver = new ChromeDriver();break;
        }
        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown()
    {driver.quit();
    }
}
