import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.ManagerPage;

public class AddCustomerTests extends BaseTest
{
    @Test
    public void addNewCustomer()
    {
     ManagerPage managerPage =  homePage.clickManagerLoginButton();
     AddCustomerPage addCustomerPage = managerPage.clickAddCustomerButton();
     addCustomerPage.enterCustomerDetails("Abdul", "Razak", "5634");
     addCustomerPage.submitCustomerInfo();
    }
}
// home > ManagerPage > add customer Page