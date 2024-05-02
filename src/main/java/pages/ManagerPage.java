package pages;

import org.openqa.selenium.WebDriver;

public class ManagerPage
{
    private WebDriver driver;
    public ManagerPage  (WebDriver driver) {
        this.driver = driver;
    }

    public AddCustomerPage addCustomerButton()
    {

        return new AddCustomerPage(driver);
    }

    public OpenAccountPage clickOpenAccountButton()
    {

        return new OpenAccountPage(driver);
    }

    public CustomerListPage clickCustomersButton()
    {
        return new CustomerListPage(driver);
    }

}
