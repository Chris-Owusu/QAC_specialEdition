package org.example.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.ListOfItems.Signup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-disable-pop-blocking");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    @Test
    public void Test(){
        Signup Register = new Signup(driver);
        Register.setSignUp();
    }

    @Test
    public void  mismatchPassword(){
        Signup mismacthPassword = new Signup(driver);
        mismacthPassword.MismatchPassword();
    }
    @Test
    public void  wrongEmail() throws InterruptedException {
        Signup wrongEmail = new Signup(driver);
        wrongEmail.wrongEmail();
    }
    @Test
    public void  we() throws InterruptedException{
        Signup WE = new Signup(driver);
        WE.ewr();
    }
}
