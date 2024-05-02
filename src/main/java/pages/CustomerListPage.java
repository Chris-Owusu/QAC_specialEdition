package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerListPage
{
    private WebDriver driver;
    public CustomerListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "input[placeholder='Search Customer']")
    private WebElement searchCustomerInput;

    public void searchCustomer(String customerName)
    {
        searchCustomerInput.sendKeys(customerName);
        // tbody td:nth-child(1)
        // //button[normalize-space()='Delete']
    }

}
