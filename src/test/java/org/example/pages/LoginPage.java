package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepdef.Hooks.driver;


public class LoginPage {

public WebElement logintab() {
    return driver.findElement(By.className("ico-login"));
}

public  WebElement vemail(){
    return driver.findElement(By.id("Email"));
}
public WebElement password() {
    return driver.findElement(By.id("Password"));
}

public WebElement logbtn(){
    return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
}

public WebElement myaccount(){
    return driver.findElement(By.className("ico-account"));
}
public WebElement msg(){
    return driver.findElement(By.className("message-error validation-summary-errors"));
}

}
