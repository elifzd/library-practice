package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Login_Page;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Login_Step_Definitions {

    Login_Page loginPage = new Login_Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("librarian1.username"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarian1.password"));
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        loginPage.loginButton.click();
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("student2.username"));
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("student2.password"));
    }

    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String username) {
        loginPage.userNameBox.sendKeys(username);
    }
    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String username) {
        loginPage.userNameBox.sendKeys(username);
    }
    @When("user enters student password {string}")
    public void user_enters_student_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }


    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {
        loginPage.userNameBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
        loginPage.loginButton.click();
    }

    @And("there should be {int} users")
    public void thereShouldBeUsers(int numberOfUsers) {
        String actualUserNumbers = loginPage.userCount.getText();
        String expectedUserNumbers = String.valueOf(numberOfUsers);
        Assert.assertTrue(actualUserNumbers.equals(expectedUserNumbers));


    }
}
