
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
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class BaseTest
{
    protected HomePage homePage;
    private WebDriver driver;

        @BeforeClass
        public void setUp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver(getChromeOptions());
            goHome();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
            Thread.sleep(3000);
            homePage = new HomePage(driver);
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

//        @AfterClass
//        public void tearDown()
//        {
//            driver.quit();
//        }
    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src/resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
