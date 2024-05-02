class Admin {
  clickAddContent() {
     cy.get('#addContent')
     .click()
     
    //  Asserting Button Click
     cy.findByText('Add general content')
     .should('be.visible')
  }
  
  enterVideoTitle() {
    cy.findByPlaceholderText('Enter title')
    .type('New Video')
    .should('be.visible')
  }

  uploadVideo() {
    cy.get('#media')
    .selectFile('cypress/fixtures/AdminVideo.mp4')

    // Click upload button
    cy.findByText('Upload')
    .click({force:true})
  }

  viewContent() {
    // Close Modal
    // cy.get('title')
    // .should('contain.text','Close')
    // .first()
    // .click({force:true})
    // Click view content button
    cy.get('#viewContent')
    .click({force:true})
  }

  deleteVideo() {

  }
   
}
export default Admin;