package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchPage;

public class D04_search {
    SearchPage search = new SearchPage();





    @When("user enters product name {String}")
    public void userEntersProductNameRound(String arg0) {

        search.field().sendKeys(arg0);
    }

    public SearchPage getSearch() {

    }

    @And("user clicks on search button")
    public void userclicksonsearchbutton (){}



    @Then("search shows relevant results")
    public void searchShowsRelevantResults() {
    }

    @When("user enters sku<sku>")
    public void userEntersSkuSku() {
    }

    @And("user clicks on search")
    public void userClicksOnSearch() {
    }

    @And("user clicks on the product in search results")
    public void userClicksOnTheProductInSearchResults() {
    }

    @Then("user gets the results")
    public void userGetsTheResults() {
    }
}
