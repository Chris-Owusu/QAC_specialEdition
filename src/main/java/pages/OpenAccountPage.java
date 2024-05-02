package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage
{
    private WebDriver driver;

    public OpenAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "userSelect")
    private WebElement customerSelectionDropdown;
// "input[placeholder='Search Customer']"
    @FindBy(id = "currency")
    private WebElement currencySelectionDropDown;

    @FindBy(css = "button[type='submit']")
    private WebElement processButton;

    public void selectCustomer(String name)
    {
        customerSelectionDropdown.click();
        Select customers = new Select(customerSelectionDropdown);
        customers.selectByVisibleText(name);
    }

    public void selectCurrency(String currency)
    {
        currencySelectionDropDown.click();
        Select customers = new Select(currencySelectionDropDown);
        customers.selectByVisibleText(currency);
    }

    public void process()
    {
      processButton.click();
    }
}
