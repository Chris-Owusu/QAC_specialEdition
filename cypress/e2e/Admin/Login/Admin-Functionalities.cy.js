// Import of pages
import Admin from "./Admin-Funtionalities";


describe("Admin Functionalities", () => {
  // New Pages Declaration
  const admin = new Admin;
  let adminData;

  before(() => {
    cy.clearCookies();
    cy.clearLocalStorage();
    cy.clearAllSessionStorage();

    cy.fixture("Data").then((data) => {
      adminData = data[0];
    });

    cy.navigateToLogin();
  });

  it("Verify that Admin can login", () => {
    cy.intercept(
      "POST",
      "https://als-backend.amalitech-dev.net/api/v1/users/login"
    ).as("login");

    cy.login(adminData.adminEmail, adminData.adminPassword)

    cy.wait("@login")
      .its("response")
      .then((response) => {
        expect(response.statusCode).to.eql(200),
          expect(response.statusMessage).to.eql("OK"),
          expect(response.body).to.contain({
            message: "Login successful"
          })
          expect(response.body.user).to.contain({
            role: "admin"
          });
      });
    });

    it("Verify that Admin can upload and delete a video", () => {
      // cy.intercept(
      //   "POST",
      //   "https://als-backend.amalitech-dev.net/api/v1/users/login"
      // ).as("addVideo");
  
      admin.clickAddContent()
      admin.enterVideoTitle()
      admin.uploadVideo()
      cy.wait(25000)
      admin.viewContent()
      admin.deleteVideo()

      // cy.wait("@addVideo")
      //   .its("response")
      //   .then((response) => {
      //     expect(response.statusCode).to.eql(200),
      //       expect(response.statusMessage).to.eql("OK"),
      //       expect(response.body).to.contain({
      //         message: "Login successful"
      //       })
      //       expect(response.body.user).to.contain({
      //         role: "admin"
      //       });
      //   });
      });
  })