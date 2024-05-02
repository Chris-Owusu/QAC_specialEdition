// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })

// Import of Pages
import UserLogin from '../e2e/Admin/Login/Admin-login';



// New Pages declaration
const login = new UserLogin();



// General Commands
Cypress.Commands.add('dataCy', (dcValue) => {
   cy.get(`[data-cy=${dcValue}]`);
});

Cypress.Commands.add('hover', (value) => {
    cy.dataCy(value).first().realHover();
})


// Navigate to Login Page
Cypress.Commands.add('navigateToLogin', () => {
    cy.visit('/')
})


// Login As User
Cypress.Commands.add('login', (email,password) => {
    login.enterEmail(email);
    login.enterPassword(password);
    login.clickSignIn();
})



// Admin Commands




// Instructor Commands




// Learners Commands















import 'cypress-file-upload';
import "cypress-real-events";
import '@testing-library/cypress/add-commands';