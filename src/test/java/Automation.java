import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Automation {
    WebDriver driver;
    @Test
    public void test(){
        this.driver = new ChromeDriver();
        driver.get("https://www.google.com/");


    }
}
