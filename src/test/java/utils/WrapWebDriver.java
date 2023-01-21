package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapWebDriver {

    private static WebDriver instance;

    private WrapWebDriver(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new ChromeDriver();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton driver instance");
        }
    }

    public static WebDriver getInstance() {
        return instance;
    }

}
