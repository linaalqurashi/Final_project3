package org.example.stepdef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;


    public Hooks() throws IOException {
    }

    @Before
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }

@After
    public void QuitBrowser() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

}



}
