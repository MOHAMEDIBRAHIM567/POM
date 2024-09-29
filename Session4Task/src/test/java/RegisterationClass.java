import Pages.RegisterationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//BaseTest
//Add SoftAssert to avoid duplication
public class RegisterationClass {
    WebDriver driver;

    @BeforeTest
    public void driver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void MakeSuceesRegisteration(){

        SoftAssert softAssert = new SoftAssert();
        //HomePage homePage = new HomePage(driver);
        //homePage.ClickHomeRegisterButton();
        RegisterationPage registerationPage =new RegisterationPage(driver);
        registerationPage.ClickHomeRegisterButton();
        registerationPage.enterFirstName();
        registerationPage.enterLastName();
        registerationPage.enterRegisterationEmail();
        registerationPage.enterNewPassword();
        registerationPage.enterConfirmPassword();
        registerationPage.ClickRegisteration();
        registerationPage.getsuccessMsg();
        softAssert.assertEquals(registerationPage.getsuccessMsg(),"Your registration completed");
        softAssert.assertAll();

    }


}
