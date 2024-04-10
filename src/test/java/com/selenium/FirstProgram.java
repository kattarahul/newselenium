package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstProgram {

    public WebDriver driver;

    @Test
    public void webDriver()
    {
        driver =new ChromeDriver();
        driver.get("https://www.oracle.com/");
    }


}
