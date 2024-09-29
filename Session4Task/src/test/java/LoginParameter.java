import Pages.HomePage;
import Pages.LoginPage;
import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginParameter extends BaseTest

{
    @Parameters({"username", "password"})
    @Test
    public void  loginTest(){
        HomePage homePage =new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterEmail("username");
        loginPage.enterPassword("password");
        loginPage.ClickLogin();

    }
}
