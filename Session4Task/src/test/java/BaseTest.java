import Pages.HomePage;
import Utilities.BrowserActions;
import Utilities.DriverSetup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver ;

    // HomePage homePage =new HomePage(driver);

    @BeforeTest
    public void driver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        DriverSetup.SetBrwser("Chrome");
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }

}
