package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static stepdefinitions.LoginSD.driver;

public class AddCustomerSD {

    @When("I click on add customer link")
    public void i_click_on_add_customer_link() {

       driver.findElement(By.linkText("Add Customer")).click();

     }
    @When("I enter name , address , Contact1 , Contact2")
    public void i_enter_name_address_contact1_contact() {

        driver.findElement(By.name("name")).sendKeys("Pragati");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("343434");
        driver.findElement(By.name("contact2")).sendKeys("43434");


    }
    @When("I click on add button")
    public void i_click_on_add_button() {
      //  driver.findElement(By.name("Submit")).click();

    }
    @Then("user should be added")
    public void user_should_be_added() {

    }

    @And("I enter {}, {}, {}, {}")
    public void iEnterUserDetails(String name, String address, String contact1, String contact2) {
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);

    }
}
