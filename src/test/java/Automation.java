import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Automation {
    WebDriver driver;
    @Test
    public void test(){
        this.driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Evans");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mbongo");
        driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
        WebElement customer = driver.findElement(By.xpath("//select[@id='userSelect']"));
        Select select = new Select(customer);
        select.selectByVisibleText("Evans Mbongo");

        WebElement currency = driver.findElement(By.xpath("//select[@id='currency']"));
        Select select1 = new Select(currency);
        select1.selectByVisibleText("Dollar");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@class='btn btn-lg tab btn-primary']")).click();

        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));










    }
}
