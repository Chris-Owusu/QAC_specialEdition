// @ts-check
import { test, expect } from '@playwright/test';
import { Login } from '../e2e/LoginPage';

test("e2e", async ({page})=>{

    
    const login = new Login(page);
    await login.authentication()
})