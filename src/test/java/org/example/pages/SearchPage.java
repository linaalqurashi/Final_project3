package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepdef.Hooks.driver;

public class SearchPage {
    public WebElement field(){
        return driver.findElement(By.id("small-searchterms"));
    }

















}
