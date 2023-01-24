package utils;

import static org.openqa.selenium.remote.Browser.CHROME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class WrapWebDriver {

    private static WrapWebDriver instance;
    private WebDriver driver;


    private WrapWebDriver(Boolean remote){
        try {
            if (remote){
                final DesiredCapabilities caps = new DesiredCapabilities ();
                caps.setBrowserName (CHROME.browserName ());
                driver = new RemoteWebDriver (new URL ("http://localhost:4444/wd/hub"), caps);
            }else{
                driver = new ChromeDriver();
            }

        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton driver instance");
        }
    }

    public static WebDriver getInstance(Boolean remote) {
        if (instance == null){
            instance = new WrapWebDriver(remote);
        }
        return instance.driver;
    }

}
