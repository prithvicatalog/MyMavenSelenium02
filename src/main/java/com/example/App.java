package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App 
{
    public static void main( String[] args )
    {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/opt/chrome146/chrome");
        options.addArguments("--headless=new");       
        options.addArguments("--no-sandbox");         
        options.addArguments("--disable-dev-shm-usage"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080"); 
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        try { Thread.sleep(5000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("student");
        try { Thread.sleep(5000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        driver.findElement(By.id("password")).sendKeys("Password123");
        try { Thread.sleep(5000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        driver.findElement(By.id("submit")).click();
        try { Thread.sleep(5000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
