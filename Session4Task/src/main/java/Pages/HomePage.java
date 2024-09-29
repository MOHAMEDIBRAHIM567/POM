package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
        /*******element lecetor******/
        By searctextbox = By.id("small-searchterms");
        By searchButton = By.xpath("//button[@type=\"submit\"]");

        public HomePage(WebDriver driver) {
            super(driver);
        }


}
