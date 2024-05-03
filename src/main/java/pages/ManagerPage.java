package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage
{
    private WebDriver driver;
    public ManagerPage  (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    private WebElement addCustomerButton;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    private WebElement openAccountButton;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    private WebElement viewCustomersButton;
    public AddCustomerPage clickAddCustomerButton()
    {
        addCustomerButton.click();
        return new AddCustomerPage(driver);
    }

    public OpenAccountPage clickOpenAccountButton()
    {
        openAccountButton.click();
        return new OpenAccountPage(driver);
    }

    public CustomerListPage clickCustomersButton()  {
        viewCustomersButton.click();
        return new CustomerListPage(driver);
    }


}
