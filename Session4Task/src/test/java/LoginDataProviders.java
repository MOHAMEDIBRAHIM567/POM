import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProviders extends BaseTest {

    @DataProvider(name = "LoginData")
    public Object[][]providerLoginData(){
        return new Object[][]{
                {"esraa5321@gmail.com","esraa123"},
                {"esraa321@gmail.com","esraa123"}
        };
    }
    @Test(dataProvider = "LoginData")
    public void LoginProvider(String username, String Password){
        HomePage homePage =new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterEmail(username);
        loginPage.enterPassword(Password);
        loginPage.ClickLogin();

    }
}
