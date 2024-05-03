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
    @FindBy(css = "tbody td:nth-child(1)")
    private WebElement searchedItemContainer;
    @FindBy(css = "input[placeholder='Search Customer']")
    private WebElement searchCustomerInput;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement deleteButton;
    public void searchCustomer(String customerName)
    {
        searchCustomerInput.sendKeys(customerName);
        // tbody td:nth-child(1)
        // //button[normalize-space()='Delete']  //
    }

    public String getSearchedResult()
    {
        return searchedItemContainer.getText();
    }

    public void deleteCustomer()
    {
        deleteButton.click();
    }

}
