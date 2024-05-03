describe('template spec', () => {
  before('passes', () => {
    cy.visit('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login')
  })

  it('Managers Portal', () => {
    cy.get('[ng-click="manager()"]').should('exist').click();
    cy.get('[ng-click="addCust()"]').should('exist').click();
    cy.get('[ng-model="fName"]').should().type("Franklin");
    cy.get('[ng-model="lName"]').should().type("Saint");
    cy.get('[ng-model="postCd"]').should().type("1001021");
    cy.get('[type=submit').should('have.attr', 'type', "submit").click();
    cy.get('[ng-click="addCust()"]').should('exist').click();
    cy.get('table').then(($table) => {
      // Extract the table data
      const rows = $table.find('tbody tr');
      
      // Perform operations/assertions on table data
      // For example, you can iterate over rows and extract cell data
      rows.each((index, row) => {
        const cells = Cypress.$(row).find('td');
        
        // Log cell data
        cells.each((cellIndex, cell) => {
          cy.log('Cell ' + cellIndex + ': ' + Cypress.$(cell).text());
        });
        
        // Assert or perform operations based on cell data
        // Example assertion
        // cy.wrap(cells).eq(0).should('contain', 'ExpectedData');
      });
    });
    cy.get('[ng-click="home()"]').should('be.visible').click();
    cy.get('[ng-click="customer()"]').should('exist').click();
    cy.get('#userSelect').select()
  })

    
  });
