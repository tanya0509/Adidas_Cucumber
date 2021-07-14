package com.adidas.step_definitions;

import com.adidas.pages.GoogleSearchPage;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class PurchaseSterDefs {

    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

}
