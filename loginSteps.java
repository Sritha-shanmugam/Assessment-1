package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.loginPageObjects;

public class loginSteps {
    WebDriver driver;
    loginPageObjects loginPage;

    @Given("I open the login page")
    public void i_open_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        loginPage=new loginPageObjects(driver);

    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.userName("standard_user");
        loginPage.password("secret_sauce");
        loginPage.loginButton();

    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
}
