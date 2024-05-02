import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest
{

        private WebDriver driver;

        @BeforeClass
        public void setUp()
        {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver(getChromeOptions());
        }

        private ChromeOptions getChromeOptions()
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-inforbars");
            return options;
        }
        @BeforeMethod
        public void goHome()
        {
            driver.manage().window().maximize();
            driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        }

        @AfterClass
        public void tearDown()
        {
            driver.quit();
        }


}
