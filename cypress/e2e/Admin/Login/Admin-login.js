class UserLogin {
   enterEmail(email) {
      cy.findByPlaceholderText("Enter your email")
      .type(email)
      .should('be.visible')
   }

   enterPassword(password) {
    cy.findByPlaceholderText("Enter your password")
    .type(password)
    .should('be.visible')
   }

   clickSignIn() {
    cy.findByText("Sign in")
    .click()
    
    // Assert Admin Login
    cy.findByText("Home")
    .should('be.visible')

    cy.findByText("My Learning")
    .should('be.visible')

    cy.findByText("Discussion Forum")
    .should('be.visible')
   }
}
export default UserLogin;

