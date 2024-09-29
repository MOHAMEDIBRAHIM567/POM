package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    //WebDriver driver;

    By Email = By.xpath("//*[@id=\"Email\"]");
    By Password = By.xpath("//*[@id=\"Password\"]");
    By LoginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    By LoginMsg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2");
    public LoginPage (WebDriver driver){
        super(driver);

    }
    public  void enterEmail(String username){
        driver.findElement(Email).sendKeys(username);}
    public  void enterPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
        driver.findElement(Password).sendKeys(password);}
    public  void ClickLogin(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
        driver.findElement(LoginButton).click();}
    public String getText() {
        String SuccessMessage;
        SuccessMessage = driver.findElement(LoginMsg).getText();
        if (SuccessMessage != "Welcome to our store") {
            System.out.println("Login Faild Please Try agin");
        }
        return SuccessMessage;
    }



}

