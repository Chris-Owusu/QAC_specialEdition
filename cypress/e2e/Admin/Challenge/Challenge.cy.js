// Import of pages
import Challenge from "./Page";


describe("Challenge", () => {
  // New Pages Declaration
  const challenge = new Challenge;
  let myData;

  before(() => {
    cy.clearCookies();
    cy.clearLocalStorage();
    cy.clearAllSessionStorage();

    cy.fixture("Data").then((data) => {
      myData = data[0];
    });

    cy.navigateToLogin();
  });

  it("Verify that Admin can login", () => {
      // Login as Bank Manager
      cy.findByText('Bank Manager Login').click();

      // Create customer account
      cy.findByText('Add Customer').click();
      cy.findByPlaceholderText('First Name').type('Matthew');
      cy.findByPlaceholderText('Last Name').type('Bansford');
      cy.findByPlaceholderText('Post Code').type('00233');
      cy.findAllByText('Add Customer').eq(1).click();

      // Assert Customer
      cy.findByText('Customers').click();
      cy.findByText('Matthew').should('exist');

      // Click Home button
      cy.findByText('Home').click();

      // Login as customer
      cy.findByText('Customer Login').click();
      cy.get('#userSelect').last().select('Matthew Bansford')
      cy.findByText('Login').click();

      cy.findByText('Home').click();
      cy.findByText('Bank Manager Login').click();
      cy.findByText('Open Account').click();
      cy.get().last().select('Matthew Bansford')
      cy.get('#userSelect').first().select('Matthew Bansford')
      cy.get('#userSelect').last().select('Dollar')
      cy.findByText('Process').click();
    });
  })