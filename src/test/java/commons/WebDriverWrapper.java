package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWrapper {

    private static WebDriverWrapper wrapper;
    
    private WebDriver driver;

    private WebDriverWrapper(){
    	System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		driver= new ChromeDriver();
    }

    public static WebDriverWrapper getInstance(){
        if(wrapper==null){
        	wrapper = new WebDriverWrapper();
        }
        return wrapper;
    }

    public WebDriver getDriver()
    {
    	return driver;
    }

}
