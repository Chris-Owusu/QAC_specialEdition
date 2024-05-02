package pages;


import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ManagerPage managerLoginButton()
    {

        return new ManagerPage(driver);
    }

    public CustomerPage customerLoginButton()
    {

        return new CustomerPage(driver);
    }

}
