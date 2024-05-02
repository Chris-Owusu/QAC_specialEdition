const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
      
    },
    baseUrl: "https://als.amalitech-dev.net/login",
    // baseUrl: "http://localhost:3001/",
    chromeWebSecurity: false,
    defaultCommandTimeout: 10000,
    pageLoadTimeout: 120000,
    projectId: "als",
    viewportWidth: 1920,        
    viewportHeight: 1080,
    experimentalStudio: true,
    testIsolation: false
  }
});
