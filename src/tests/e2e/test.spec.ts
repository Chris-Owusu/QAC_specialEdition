import { test } from '@playwright/test'
const now = new Date();

test.describe('', () => {
  test.beforeEach(async ({ page, baseURL }) => {
    
   
  })

  test('', async ({ page }) => {
    await page.goto('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login');
  
  await Promise.all([
    page.waitForNavigation(/*{ url: 'https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager' }*/),
    page.click('text=Bank Manager Login')
  ]);
  await Promise.all([
    page.waitForNavigation(/*{ url: 'https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/openAccount' }*/),
    page.click('text=Open Account')
  ]);
  await Promise.all([
    page.waitForNavigation(/*{ url: 'https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust' }*/),
    page.click('text=Add Customer')
  ]);
  await page.click('[placeholder="First Name"]');
  await page.fill('[placeholder="First Name"]', `${now}`);
  await page.click('[placeholder="Last Name"]');
  await page.fill('[placeholder="Last Name"]', 'John');
  await page.click('[placeholder="Post Code"]');
  await page.fill('[placeholder="Post Code"]', '123');
  page.once('dialog', dialog => {
    console.log(`Dialog message: ${dialog.message()}`);
    dialog.dismiss().catch(() => {});
  });
  await page.click('form[role="form"] >> text=Add Customer');
  
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
  

  await page.fill('[placeholder="amount"]', '400');
  
  await page.click('form[role="form"] button:has-text("Withdraw")');
  
  await page.click('text=1600');
   
  })
})