package org.example.stepdef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.example.stepdef.Hooks.driver;


public class D01_Register {
    HomePage home = new HomePage();
    public static String Email;
public static String pass;
    @Given("user go to register page")

    public void register(){

        System.out.print("this is a test");
        home.registertab().click();

    }

    @When("user choose gender")
    public void userChooseGender() {

home.gender().click();

    }

    @And("user enters first name{string} last name {string}")
    public void userEntersFirstNameLastName(String arg0, String arg1) {
        home.firstname().sendKeys(arg0);
        home.lastname().sendKeys(arg1);

    }



    @And("user selscts date of birth")
    public void userSelsctsDateOfBirth() {

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
Select staticlist = new Select(day);
staticlist.selectByValue("25");
WebElement month =driver.findElement(By.name("DateOfBirthMonth"));
Select staticlist1 = new Select(month);
staticlist1.selectByValue("12");
WebElement year = driver.findElement(By.name("DateOfBirthYear"));
Select staticlist2 = new Select(year);
staticlist2.selectByValue("1988");
    }


    @And("user enters email field{string}")
    public void userEntersEmailField(String arg0) {

        Faker fake = new Faker();
        Email = fake.internet().emailAddress();
    home.email().sendKeys(Email);
    }



    @And("user fills pasword fields")
    public void userFillsPaswordFields() throws IOException {

pass="1234@@";
        home.password().sendKeys(pass);

home.passwordconfirm().sendKeys(pass);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {

        driver.findElement(By.id("register-button")).click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(home.msg().getText()
,"Your registration completed");

soft.assertEquals(home.msg().getCssValue("color"), "rgba(76, 177, 124, 1)");
soft.assertAll();
    }
}
