package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.LoginPage;
import com.Castor_Sprint2.pages.RuthPage;
import com.Castor_Sprint2.utilities.ConfigurationReader;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ruth_step_definitions {
    LoginPage loginPage = new LoginPage();
    RuthPage ruthPage = new RuthPage();

    @When("user open login page")
    public void userOpenLoginPage(){
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
    }

    @Given("user logged in as {string} and {string}")
    public void userLoggedInAsAnd(String user,String password){
        loginPage.login(user,password);
    }


    @When("user hovers over on marketing module.")
    public void userHoversOverOnMarketingModule() {
    }

    @When("user clicks on the Campaings option.")
    public void userClicksOnTheCampaingsOption() {
    }

    @When("user clicks on the Icon filters.")
    public void userClicksOnTheIconFilters() {
    }

    @When("user clicks on the Manage filters dropdown.")
    public void userClicksOnTheManageFiltersDropdown() {
    }

    @Then("user should be able to unchecks any amount of boxes.")
    public void userShouldBeAbleToUnchecksAnyAmountOfBoxes() {
    }
}
