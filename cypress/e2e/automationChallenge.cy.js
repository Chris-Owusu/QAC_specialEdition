describe('Banking Project Tests', function() {
  it('should create a customer, open account, make transactions, and delete customer', function() {
    cy.visit('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login');

    
    // Create a customer
    cy.get('button[ng-click="manager()"]').click();
    cy.get('button[ng-click="addCust()"]').click();
    cy.get('input[ng-model="fName"]').type('Philip');
    cy.get('form[name="myForm"]').type('Odzor');
    cy.get('input[ng-model="postCd"]').type('12345');
    cy.get('button[type="submit"]').click();


  });
});
