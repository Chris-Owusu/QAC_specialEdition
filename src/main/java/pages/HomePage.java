package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement managerLoginButton;
    public ManagerPage clickManagerLoginButton()
    {
        managerLoginButton.click();
        return new ManagerPage(driver);
    }

    public CustomerPage clickCustomerLoginButton()
    {

        return new CustomerPage(driver);
    }

}
