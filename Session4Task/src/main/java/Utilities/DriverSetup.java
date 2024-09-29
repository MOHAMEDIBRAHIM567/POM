package Utilities;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    static WebDriver driver;
    //static WebDriverManager Browser;
    public static WebDriver SetBrwser(String BrowserName) {
        BrowserName = BrowserName.toLowerCase();
        if (BrowserName.equals("chrome")){
            driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();

        }
        else if (BrowserName.equals("edge")){
            driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
        }
        return driver;
        }
       }
// driver = new ChromeDriver();
// WebDriverManager.chromedriver().setup();
// driver = new ChromeDriver();
