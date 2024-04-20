const { expect } = require('@playwright/test');

 {import('@playwright/test').Page} page
exports.Login = class Login{


    constructor(page) {
        this.page = page
        this.emailField = "input[placeholder='Email']"
        this.passwordFiled = "input[placeholder='Password']"
        this.loginBtn = "Sign in"
    }

    async authentication(){
        await this.page.goto("https://ifsam.amalitech-dev.net/login")
    }
}