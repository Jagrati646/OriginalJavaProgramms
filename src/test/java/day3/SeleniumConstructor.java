package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConstructor {
    WebDriver driver;
    SeleniumConstructor(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void main(String[] args) {
        SeleniumConstructor sc = new SeleniumConstructor();

        sc.openURL("https://www.amazon.in");
        sc.openURL("https://www.google.in");
        sc.closeBrowser();
    }
        public void openURL(String url){
            driver.get(url);

        }

        public void closeBrowser(){
        driver.quit();
    }






}
