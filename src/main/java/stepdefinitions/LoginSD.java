package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

    public static WebDriver driver;

    @Given("I am on login page")
    public void loginPage()
    {
        System.out.println("I am on login page");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
    }

    /*@Given("I am on login page")
    public void i_am_on_login_page() {

       }*/


    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }

   /* @When*/
    @And("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
     }


    @Then("I should be on Dashboard")
    public void i_should_be_on_dashboard() {
         System.out.println("I should be on Dashboard");

         String expected = "https://stock.scriptinglogic.in/dashboard.php";
         String actual = driver.getCurrentUrl();

        Assert.assertEquals("",expected,actual);

      }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("dsdsd");
        driver.findElement(By.id("login-password")).sendKeys("dsdsd");

    }

    @When("I enter blank username and password")
    public void i_enter_blank_username_and_password() {
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");


    }


    @Then("I should get error")
    public void i_should_get_error() {
        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        Assert.assertEquals("",expected,actual);
    }

    @When("I enter {string} as username and {string} as password")
    public void iEnterAsUsernameAndAsPassword(String username, String password) {


        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }
}
