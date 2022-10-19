package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Login_Page;
import com.cydeo.library.pages.Search_ResultPages;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Search_Result_StepDefinition {

    Login_Page loginPage = new Login_Page();
    Search_ResultPages search_resultPages = new Search_ResultPages();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("librarian1.username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarian1.password"));
        loginPage.loginButton.click();
    }
    @Given("I click on Users link")
    public void i_click_on_link() {
        search_resultPages.usersButton.click();
    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String > options) {
        List<WebElement> columnOptions = search_resultPages.allButton;

        List<String> artik = new ArrayList<>();

        for (WebElement each : columnOptions) {
            artik.add(each.getText());
        }

        Assert.assertEquals(options, artik);



    }


}
