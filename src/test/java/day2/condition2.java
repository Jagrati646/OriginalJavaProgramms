package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class condition2 {
    public static void main(String[] args) {
        WebDriver driver=null;
        String browser="Chrome";

        if(browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else{

            System.out.println("Enter correct browser");
        }
            driver.get("https://swiggy.com");
        driver.quit();

        }

}
