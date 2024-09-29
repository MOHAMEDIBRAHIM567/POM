package Pages;
import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterationPage  extends BasePage{
    //WebDriver driver;
    WebDriverWait wait;
    By FirstName = By.xpath("//*[@id=\"FirstName\"]");
    By LastName = By.xpath("//*[@id=\"LastName\"]");
    By EmailRegisteration = By.xpath("//*[@id=\"Email\"]");
    By NewPassword = By.xpath("//*[@id=\"Password\"]");
    By ConfirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By RegisterButton = By.xpath("//*[@id=\"register-button\"]");
    By SuccessRegisterationMsg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");

    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    /**   public RegisterationPage(WebDriver driver) {
        this.driver=(driver);

    }**/

    /**public RegisterationPage(WebDriverWait wait) {
        this.wait=(wait);

    }**/




    //public  void enterFirstName(){driver.findElement(FirstName).sendKeys("esraa");}
    //public void BasePage.ClickHomeRegisterButton(){driver.findElement(HomeRgisterButton).click();}
    public void enterFirstName(){
        //BrowserActions.clickOnElement(HomeRgisterButton,driver);
       // BrowserActions.clickOnElement(By by, WebDriver driver);
        driver.findElement(FirstName).sendKeys("esraa");}
    public  void enterLastName(){driver.findElement(LastName).sendKeys("Hnafy");}
    public  void enterRegisterationEmail(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LastName));
        driver.findElement(EmailRegisteration).sendKeys("esraa5321@gmail.com");}
    public  void enterNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailRegisteration));
        driver.findElement(NewPassword).sendKeys("esraa123");}
    public  void enterConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(NewPassword));
        driver.findElement(ConfirmPassword).sendKeys("esraa123");}
    public  void ClickRegisteration(){

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassword));
        driver.findElement(RegisterButton).click();
    }
    public String getsuccessMsg (){
        String SuccessMessage ;
        SuccessMessage = driver.findElement(SuccessRegisterationMsg).getText();
        //assertNotEquals
        if (SuccessMessage != "Your registration completed"){
            System.out.println("Faild to user Registeration");
        }
        return SuccessMessage;

    }
}
