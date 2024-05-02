import { test } from '@playwright/test'
const now = new Date();

test.describe('', () => {
  test.beforeEach(async ({ page, baseURL }) => {
    
   
  })

  test.only('', async ({ page }) => {
    // Go to https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
  await page.goto('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login');
  // Click text=Bank Manager Login
  await Promise.all([
    page.waitForNavigation(/*{ url: 'https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager' }*/),
    page.click('text=Bank Manager Login')
  ]);
  // Click text=Open Account
  await Promise.all([
    page.waitForNavigation(/*{ url: 'https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/openAccount' }*/),
    page.click('text=Open Account')
  ]);
  // Click text=Add Customer
  await Promise.all([
    page.waitForNavigation(/*{ url: 'https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust' }*/),
    page.click('text=Add Customer')
  ]);
  // Click [placeholder="First Name"]
  await page.click('[placeholder="First Name"]');
  // Fill [placeholder="First Name"]
  await page.fill('[placeholder="First Name"]', `${now}`);
  // Click [placeholder="Last Name"]
  await page.click('[placeholder="Last Name"]');
  // Fill [placeholder="Last Name"]
  await page.fill('[placeholder="Last Name"]', 'John');
  // Click [placeholder="Post Code"]
  await page.click('[placeholder="Post Code"]');
  // Fill [placeholder="Post Code"]
  await page.fill('[placeholder="Post Code"]', '123');
  // Click form[role="form"] >> text=Add Customer
  page.once('dialog', dialog => {
    console.log(`Dialog message: ${dialog.message()}`);
    dialog.dismiss().catch(() => {});
  });
  await page.click('form[role="form"] >> text=Add Customer');
  // Click text=Open Account
  await page.click('text=Open Account');
  
  await page.selectOption('select[name="userSelect"]', '6');
  
  await page.selectOption('select[name="currency"]', 'Dollar');
  
  page.once('dialog', dialog => {
    console.log(`Dialog message: ${dialog.message()}`);
    dialog.dismiss().catch(() => {});
  });
  await page.click('text=Process');
  
  await page.click('text=Home');
  
   page.click('text=Customer Login')
  
  
  await page.selectOption('select[name="userSelect"]', '6');
  
   page.click('text=Login')
 
 
  await page.click('text=Deposit');
  
  await page.click('[placeholder="amount"]');
  
  await page.fill('[placeholder="amount"]', '2000');

  await page.click('form[role="form"] button:has-text("Deposit")');

  await page.click('text=Deposit Successful');
  
  await page.click('text=Withdrawl');
  
  await page.click('[placeholder="amount"]');
 
  await page.fill('[placeholder="amount"]', '200');
  
  await page.click('form[role="form"] button:has-text("Withdraw")');
  
  await page.click('text=1800');
   
  })
})