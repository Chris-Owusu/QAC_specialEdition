import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.CustomerListPage;
import pages.ManagerPage;
import pages.OpenAccountPage;

public class AddCustomerTests extends BaseTest
{
    @Test
    public void addNewCustomer()
    {
     ManagerPage managerPage =  homePage.clickManagerLoginButton();
     AddCustomerPage addCustomerPage = managerPage.clickAddCustomerButton();
     addCustomerPage.enterCustomerDetails("Abdul", "Razak", "5634");
     addCustomerPage.submitCustomerInfo();
     OpenAccountPage openAccountPage = managerPage.clickOpenAccountButton();
     openAccountPage.selectCustomer("Abdul Razak");
     openAccountPage.selectCurrency("Dollar");
     openAccountPage.process();
     CustomerListPage customerListPage = managerPage.clickCustomerListButton();
     customerListPage.searchCustomer("Abdul");
     Assert.assertEquals(customerListPage.getSearchedResult(), "Abdul");
    }


}
// home > ManagerPage > add customer Page