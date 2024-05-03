import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddCustomerTests extends BaseTest
{
    @Test
    public void addNewCustomer() throws InterruptedException {
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
     goHome();
     CustomerPage customerPage = homePage.clickCustomerLoginButton();
     customerPage.chooseCustomer("Abdul Razak");
     TransactionsPage transactionsPage = customerPage.loginCustomer();
     transactionsPage.depositMoney();
     transactionsPage.withdrawAmount();
     Assert.assertEquals(transactionsPage.balance(), "7200");
     transactionsPage.myHome();
     homePage.clickManagerLoginButton();
     customerListPage = managerPage.clickCustomerListButton();
     customerListPage.searchCustomer("Abdul");
     customerListPage.deleteCustomer();
     goHome();

    }


}
