package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage
{
    private WebDriver driver;
    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userSelect")
    private WebElement selectCustomer;

    @FindBy(css = "button[type='submit']")
    private WebElement customerLoginButton;

    public void chooseCustomer(String name)
    {
        Select options = new Select(selectCustomer);
        selectCustomer.click();
        options.selectByVisibleText(name);
    }

    public TransactionsPage loginCustomer()
    {
        customerLoginButton.click();
        return new TransactionsPage(driver);
    }
}
