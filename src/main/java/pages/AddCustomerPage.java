package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage
{
    private WebDriver driver;
    public AddCustomerPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstNameInput;

    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameInput;

    @FindBy(css = "input[placeholder='Post Code']")
    private WebElement postCodeInput;

    @FindBy(css = "button[type='submit']")
    private WebElement submitCustomerDetailButton;

    public void enterCustomerDetails(String firstName, String lastName, String postCode )
    {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postCodeInput.sendKeys(postCode);
    }

    public void submitCustomerInfo()
    {
        submitCustomerDetailButton.click();
        driver.switchTo().alert().accept();
    }
}
