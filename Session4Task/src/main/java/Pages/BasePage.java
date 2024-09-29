package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    By HomeRgisterButton= By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By LoginButton = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");

    public BasePage(WebDriver driver) {
        this.driver=(driver);
    }

    //Add waits
    public void ClickHomeRegisterButton(){
        BrowserActions.clickOnElement(HomeRgisterButton,driver);
        //driver.findElement(HomeRgisterButton).click();
    }
    public  void clickLoginButton(){driver.findElement(LoginButton).click();}


}
