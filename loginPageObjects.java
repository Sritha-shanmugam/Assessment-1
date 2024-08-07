package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPageObjects {
    WebDriver driver;
    WebDriverWait wait;
    By username=By.id("user-name");
    By password=By.id("password");
    By loginButton =By.id("login-button");
//    By errorMessage =By.xpath("//h3[@data-test='error']");


    public loginPageObjects(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public void userName(String userName){
        driver.findElement(username).sendKeys(userName);
    }
    public void password(String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public void loginButton(){
        driver.findElement(loginButton).click();
    }
}
