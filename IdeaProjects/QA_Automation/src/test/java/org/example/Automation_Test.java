package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Automation_Test {
    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement loginBtn = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
        loginBtn.click();
        WebElement addCustomerBtn = driver.findElement(By.xpath("//button[normalize-space()='Add Customer']"));
        addCustomerBtn.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        WebElement postCode  = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        WebElement customer = driver.findElement(By.xpath("//button[@type='submit']"));
        firstName.sendKeys("John");
        lastName.sendKeys("Mensah");
        postCode.sendKeys("325");
        customer.click();

        WebElement customerBtn = driver.findElement(By.xpath("//button[normalize-space()='Customers']"));
        customerBtn.click();

        WebElement searchBtn = driver.findElement(By.xpath("input[placeholder='Search Customer']"));
        searchBtn.sendKeys("john");

        WebElement row = driver.findElement(By.cssSelector("tbody td:nth-child(1)"));
        Assert.assertEquals(row.getText(),"John");



    }
}
