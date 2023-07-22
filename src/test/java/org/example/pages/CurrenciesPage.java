package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepdef.Hooks.driver;

public class CurrenciesPage {

    public WebElement list(){
        return driver.findElement(By.id("customerCurrency"));
    }

 public List<WebElement> symbol(){ return  driver.findElements(By.className("item-box"));}
}
