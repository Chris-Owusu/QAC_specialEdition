// @ts-check
const { test, expect } = require('@playwright/test');


test('QA', async ({ page }) => {
  await page.goto('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login');
  await page.getByRole('button', { name:'Bank Manager Login'}).click();
  await page.getByRole("button", {name: 'Add Customer'}).click()
  await page.locator('[ng-model="fName"]').fill('Albert')
  await page.locator('[placeholder="Last Name"]').fill('Hughes')
  await page.locator('[placeholder="Post Code"]').fill('1234')
  await page.locator('[type="submit"]').click()
  page.on('dialog', dialog => {
    expect(dialog.message()).toEqual('Account created successfully with account Number :1016')
    dialog.accept()
  })
  await page.getByRole('button', {name: 'Open Account'}).click()
  await page.locator('[name="userSelect"]').click()
  await page.locator('#userSelect').selectOption('6');
  await page.locator('[name="currency"]').selectOption('Dollar');
  await page.getByRole('button', { name: 'Process' }).click();

  page.on('dialog', dialog => {
    expect(dialog.message()).toEqual('Account created successfully with account Number :1016')
    dialog.accept()
  })
  await page.getByRole('button', {name: 'Customers'}).click()
  await page.locator('[placeholder="Search Customer"]').fill('Albert')
  await page.getByRole('button', {name: 'Delete'}).click()
});


