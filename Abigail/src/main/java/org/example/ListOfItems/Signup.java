package org.example.ListOfItems;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {
    WebDriver driver;
    WebDriverWait wait;

    By signup = By.xpath("//a[normalize-space()='Register']");
    By female = By.xpath("//input[@id='gender-female']");
    By firstName = By.id("FirstName");
    By lastName = By.xpath("//input[@id='LastName']");
    By day = By.xpath("//select[@name='DateOfBirthDay']");
    By month = By.xpath("//select[@name='DateOfBirthMonth']");
    By year = By.xpath("//select[@name='DateOfBirthYear']");
    By email = By.xpath("//input[@id='Email']");
    By company = By.xpath("//input[@id='Company']");
    By telephone = By.id("input-telephone");
    By newsletter = By.xpath("//div[@id='main']//div[3]//div[2]//div[1]");
    By password = By.xpath("//input[@id='Password']");
    By confirm = By.xpath("//input[@id='ConfirmPassword']");
    By signupButton = By.xpath("//button[@id='register-button']");

    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    public void setSignUp() {
        driver.findElement(signup).click();
        driver.findElement(female).click();
        driver.findElement(firstName).sendKeys("Abigail");
        driver.findElement(lastName).sendKeys("Arko");
        String username = RandomStringUtils.randomAlphabetic(8).toUpperCase();
        Select Date = new Select(driver.findElement(day));
        Date.selectByVisibleText("8");
        Select months = new Select(driver.findElement(month));
        months.selectByVisibleText("June");
        Select yearSelect = new Select(driver.findElement(year));
        yearSelect.selectByVisibleText("1999");
        driver.findElement(email).sendKeys(username + "@gmail.com");
        driver.findElement(company).sendKeys("Amalitech company limited");
        WebElement newsletterCheckbox = driver.findElement(newsletter);
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }

        driver.findElement(password).sendKeys("abiail1223&Arko");
        driver.findElement(confirm).sendKeys("abiail1223&Arko");
        driver.findElement(signupButton).click();
    }

    public void wrongEmail() throws InterruptedException {
        driver.navigate().back();
        driver.wait(10);
        wait.until(ExpectedConditions.elementToBeClickable(female));

        driver.findElement(female).click();
        driver.findElement(firstName).sendKeys("Abigail");
        driver.findElement(lastName).sendKeys("Arko");
        String username = RandomStringUtils.randomAlphabetic(8).toUpperCase();
        Select Date = new Select(driver.findElement(day));
        Date.selectByVisibleText("8");
        Select months = new Select(driver.findElement(month));
        months.selectByVisibleText("June");
        Select yearSelect = new Select(driver.findElement(year));
        yearSelect.selectByVisibleText("1999");
        driver.findElement(email).sendKeys(username + "gmail.com");
        driver.findElement(company).sendKeys("Amalitech company limited");
        WebElement newsletterCheckbox = driver.findElement(newsletter);
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }
    }
    public void MismatchPassword() {
        driver.navigate().back();
        driver.findElement(female).click();
        driver.findElement(firstName).sendKeys("Abigail");
        driver.findElement(lastName).sendKeys("Arko");
        String username = RandomStringUtils.randomAlphabetic(8).toUpperCase();
        Select Date = new Select(driver.findElement(day));
        Date.selectByVisibleText("8");
        Select months = new Select(driver.findElement(month));
        months.selectByVisibleText("June");
        Select yearSelect = new Select(driver.findElement(year));
        yearSelect.selectByVisibleText("1999");
        driver.findElement(email).sendKeys(username + "@gmail.com");
        driver.findElement(company).sendKeys("Amalitech company limited");
        WebElement newsletterCheckbox = driver.findElement(newsletter);
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }

        driver.findElement(password).sendKeys("invalid");
        driver.findElement(confirm).sendKeys("abiail1223&Arko");
        driver.findElement(signupButton).click();
    }
    public void ewr(){
        driver.navigate().back();
        driver.findElement(female).click();
        driver.findElement(firstName).sendKeys("Abigail");
        driver.findElement(lastName).sendKeys("Arko");
        String username = RandomStringUtils.randomAlphabetic(8).toUpperCase();
        Select Date = new Select(driver.findElement(day));
        Date.selectByVisibleText("8");
        Select months = new Select(driver.findElement(month));
        months.selectByVisibleText("June");
        Select yearSelect = new Select(driver.findElement(year));
        yearSelect.selectByVisibleText("1999");
        driver.findElement(email).sendKeys(username + "gmail.com");
        driver.findElement(company).sendKeys("Amalitech company limited");
        WebElement newsletterCheckbox = driver.findElement(newsletter);
        if (!newsletterCheckbox.isSelected()) {
            newsletterCheckbox.click();
        }

        driver.findElement(password).sendKeys("abigail123Arko");
        driver.findElement(confirm).sendKeys("abiail1223&Arko");
        driver.findElement(signupButton).click();

    }

        }



