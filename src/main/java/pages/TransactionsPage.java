package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPage
{
    private WebDriver driver;
    private String amountDeposited = "9000";
    public TransactionsPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    private WebElement depositButton;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    private WebElement withDrawlButton;

    @FindBy(xpath = "//button[contains(text(),'Transactions')]")
    private WebElement transactionsButton;

    @FindBy(id = "accountSelect")
    private WebElement accountNumberDropDown;

    @FindBy(css = "input[type='number']")
    private WebElement depositAmountInputField;

    @FindBy(css = "input[placeholder='amount']")
    private WebElement withdrawAmountInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement depositSubmitButton;

    @FindBy(xpath = "//button[contains(text(),'Withdraw')]")
    private WebElement withdrawSubmitButton;
    public void depositMoney()
    {
        depositButton.click();
        depositAmountInputField.sendKeys(amountDeposited);
        depositSubmitButton.click();

    }

    public void withdrawAmount() throws InterruptedException {

        int depositAmount = Integer.parseInt(amountDeposited);
        System.out.println(depositAmount);

        int withdrawAmount = (int) (0.2 * depositAmount);
        System.out.println(withdrawAmount);

        String amount = String.valueOf(withdrawAmount);
        withDrawlButton.click();
        withdrawAmountInput.sendKeys(amount);
        System.out.println(amount);
        Thread.sleep(4000);
        withdrawSubmitButton.click();

    }


}





