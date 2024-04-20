// @ts-check
const { test, expect } = require('@playwright/test');

test("End to to test",async({page})=>{

    await page.goto('/');
    const titlePage = await page.title();
    const pageTitle = "My Shop";
    expect(await titlePage === pageTitle).toBeTruthy()

    await page.locator(".login").click()
    await page.locator("input#email_create").fill("amoJohn  @gmail.com")
    await page.locator("button#SubmitCreate").click()

    const titlePage1 = await page.title();
    const pageTitle1 = "Login - My Shop";
    expect(await titlePage1 === pageTitle1).toBeTruthy()

    const mrCheckbox =  await page.locator("input[name='id_gender']")
    mrCheckbox.check()
    const firstName = await page.locator("#customer_firstname")
    firstName.fill("Amos")
    const lastName =await page.locator("#customer_lastname")
    lastName.fill("Amo")
    const password =await page.locator("#passwd")
    password.fill("Admin@123")
    const day = await page.locator("select#days")
    day.selectOption("25")
    const month = await page.locator("#months")
    month.selectOption("12")
    const year = await page.locator("#years")
    year.selectOption("2000")
    const registerBtn = await page.locator("button#submitAccount")
    await registerBtn.isEnabled()
    await registerBtn.click()
})