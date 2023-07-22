package org.example.stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.example.stepdef.Hooks.driver;
import org.example.pages.LoginPage;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_Login {

    LoginPage login = new LoginPage();

    @Given("user go to login page")

    public void login(){

        login.logintab().click();
    }


    @When("user login with valid mail and password")
    public void userLoginWithValidMailAndPassword() {


        login.vemail().sendKeys(D01_Register.Email);
        login.password().sendKeys(D01_Register.pass);
    }


    @And("user presses on login button")
    public void userPressesOnLoginButton() {
        login.logbtn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        Boolean button =login.myaccount().isDisplayed();
        soft.assertTrue(button);
        String currenturl=  driver.getCurrentUrl();
        soft.assertEquals(currenturl,"https://demo.nopcommerce.com/");

        soft.assertAll();



    }


    @When("user login with invalid email and password")
    public void userLoginWithInvalidEmailAndPassword() {

       Faker fake = new Faker();
       String arg0 =fake.name().firstName();
D01_Register.pass="1234@@";
        login.vemail().sendKeys(arg0+"example.com");
        login.password().sendKeys(D01_Register.pass);
    }





    @Then("user couldn't login to the system")
    public void userCouldnTLoginToTheSystem() {
String currenturl=driver.getCurrentUrl();
       SoftAssert soft = new SoftAssert();
soft.assertEquals(login.msg().getText(),"Login was unsuccessful.");
String expected = Color.fromString("(228, 67, 75, 1)").asHex();
        soft.assertEquals(login.msg().getCssValue("color"), "expected");
        soft.assertEquals(currenturl,"https://demo.nopcommerce.com/login?returnurl=%2F");
        soft.assertAll();

    }

}
