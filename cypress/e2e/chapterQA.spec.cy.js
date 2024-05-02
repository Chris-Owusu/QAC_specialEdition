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
    const form = cy.get('.marTop.ng-scope');
    form.within(()=>{
      form.should('contain','Franklin');
      form.should('contain','Saint');
      form.should('contain','1001021');
    })
    cy.get('[ng-click="home()"]').should('be.visible').click();
    cy.get('[ng-click="customer()"]').should('exist').click();
    cy.get('#userSelect').select()

    
  });
})