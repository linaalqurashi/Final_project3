package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepdef.Hooks.driver;
public class HomePage {


    public WebElement registertab(){

        return driver.findElement(By.className("ico-register"));
    }
    public WebElement gender(){

        return driver.findElement(By.id("gender-female"));

    }
  public  WebElement firstname(){
        return driver.findElement(By.id("FirstName"));
  }
  public WebElement lastname (){
        return driver.findElement(By.id("LastName"));
  }
  public WebElement email(){
        return driver.findElement(By.id("Email"));
  }
  public WebElement password(){
        return driver.findElement(By.id("Password"));
  }
  public WebElement passwordconfirm (){
        return driver.findElement(By.id("ConfirmPassword"));
  }

  public WebElement msg(){return driver.findElement(By.className("result"));}


}
