package org.example.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CurrenciesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currencies {
    static String eurosign;
    CurrenciesPage currency = new CurrenciesPage();

    @Given("user goes to homepage")
    public void usergoestohomepage() {
        currency.list().click();
    }


    @When("user chooses euro currency")
    public void userChoosesEuroCurrency() {
        Select staticselect = new Select(currency.list());
        staticselect.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("euro symbol is shown for displayed product in homepage")
    public void euroSymbolIsShownForDisplayedProductInHomepage() {
       WebElement s = null;
        for (int i=0; i<currency.symbol().size();i++){s =currency.symbol().get(i);
        String price =s.getText();
            System.out.print(price);}
        String exprice ="€";
        Boolean result = s.getText().contains("€");

        Assert.assertTrue(result);

        }

    }
