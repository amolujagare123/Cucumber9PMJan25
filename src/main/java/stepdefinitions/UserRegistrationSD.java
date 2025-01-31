package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UserRegistrationSD {
WebDriver driver;
    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/multipleElements.html");
    }
    @When("I enter below Data")
    public void i_enter_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        List<List<String>> data = dataTable.asLists();

        driver.findElement(By.id("input1")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("input2")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("input3")).sendKeys(data.get(0).get(2));
        driver.findElement(By.id("input4")).sendKeys(data.get(0).get(3));
        driver.findElement(By.id("input5")).sendKeys(data.get(0).get(4));
        driver.findElement(By.id("input6")).sendKeys(data.get(0).get(5));
        driver.findElement(By.id("input7")).sendKeys(data.get(0).get(6));
        driver.findElement(By.id("input8")).sendKeys(data.get(0).get(7));
        driver.findElement(By.id("input9")).sendKeys(data.get(0).get(8));
        driver.findElement(By.id("input10")).sendKeys(data.get(0).get(9));


    }
    @And("I click on submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.tagName("button")).click();
    }

    @Then("user should be submitted")
    public void userShouldBeSubmitted() {
    }
}
