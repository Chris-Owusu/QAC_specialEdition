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
    //cy.assert(alert).contains('Customer added successfully with customer id :6')


    // assert customer detail exists
    
//Login Customer
    cy.get('button[ng-click="home()"]').click()
    cy.get('button[ng-click="customer()"]').click()
    cy.get('select#userSelect').select('Philip Odzor',{force:true})
    cy.get('button[type="submit"]').click()
    //cy.get('span[ng-show="noAccount"]').should('contain.text', 'Welcome Philip Odzor !! Please open an account with us.')
    
    cy.get('button[ng-click="home()"]').click()
    cy.get('button[ng-click="manager()"]').click()
    cy.get('button[ng-click="openAccount()"]').click();
    cy.get('select#userSelect').select('Philip Odzor',{force:true})
    cy.get('select#currency').select('Dollar',{force:true})
    cy.get('button[type="submit"]').click();
    //assertion

    cy.get('button[ng-click="home()"]').click()
    cy.get('button[ng-click="customer()"]').click()
    cy.get('select#userSelect').select('Philip Odzor',{force:true})
    cy.get('button[type="submit"]').click()
    cy.get('button[ng-click="deposit()"]').click();
    cy.get('input[type="number"]').type('1000');
    cy.get('button[type="submit"]').click();
        //assertion

    cy.get('button[ng-click="withdrawl()"]').click()
    cy.get('input[type="number"]').type('3000');
    //assertion




  });
});
