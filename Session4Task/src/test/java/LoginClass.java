import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginClass extends BaseTest{
   // WebDriver driver ;
    //BaseTest baseTest =new BaseTest();


   /** @BeforeTest
    public void driver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }**/
    @Test
    public void LoginValidUser() {

        SoftAssert softAssert = new SoftAssert();
        HomePage homePage =new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage= new LoginPage(driver);
        //loginPage.clickLoginButton();
        loginPage.enterEmail("usermname");
        loginPage.enterPassword("password");
        loginPage.ClickLogin();
        softAssert.assertEquals(loginPage.getText(),"Welcome to our store");
        softAssert.assertAll();

    }

}
