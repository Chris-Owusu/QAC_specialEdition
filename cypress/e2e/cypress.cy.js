describe("cypress", () => {
  it("tests cypress", () => {
    cy.viewport(212, 720);
    cy.visit("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    cy.get("div.borderM").click();
    cy.get("div:nth-of-type(2) > button").click();
    cy.get("div > div > div.ng-scope button:nth-of-type(1)").click();
    cy.get("div:nth-of-type(1) > input").click();
    cy.get("div:nth-of-type(1) > input").type("philip");
    cy.get("div:nth-of-type(2) > input").click();
    cy.get("div:nth-of-type(2) > input").type("odzor");
    cy.get("div:nth-of-type(3) > input").click();
    cy.get("div:nth-of-type(3) > input").type("00233");
    cy.get("div > div > div.ng-scope > div > div.ng-scope button").click();
    cy.get("button:nth-of-type(3)").click();
    cy.get("tr:nth-of-type(8) > td:nth-of-type(1)").click();
    cy.get("tr:nth-of-type(8) > td:nth-of-type(2)").click();
    cy.get("button.home").click();
    cy.get("div > div > div.ng-scope div:nth-of-type(1) > button").click();
    cy.get("#userSelect").click();
    cy.get("#userSelect").type("8");
    cy.get("div > div > div.ng-scope button").click();
    cy.get("strong > span").click();
    cy.get("body > div > div > div.ng-scope > div").click();
    cy.get("button.home").click();
    cy.get("button.home").click();
    cy.get("button.home").click();
    cy.get("div:nth-of-type(2) > button").click();
    cy.get("div > div > div.ng-scope button:nth-of-type(2)").click();
    cy.get("#userSelect").type("8");
    cy.get("#currency").click();
    cy.get("#currency").type("Pound");
    cy.get("div > div > div.ng-scope > div > div.ng-scope button").click();
    cy.get("button:nth-of-type(3)").click();
    cy.get("input").click();
    cy.get("div.center > button:nth-of-type(1)").click();
    cy.get("div:nth-of-type(3) > input").click();
    cy.get("button.home").click();
    cy.get("div > div > div.ng-scope div:nth-of-type(1) > button").click();
    cy.get("#userSelect").click();
    cy.get("#userSelect").type("8");
    cy.get("div > div > div.ng-scope button").click();
    cy.get("div > div > div.ng-scope button:nth-of-type(1)").click();
    cy.get("td:nth-of-type(1)").click();
    cy.get("td:nth-of-type(1) > a").click();
    cy.get("td:nth-of-type(3) > a").click();
    cy.get("div.fixedTopBox > button:nth-of-type(1)").click();
    cy.get("div > div > div.ng-scope button:nth-of-type(2)").click();
    cy.get("input").click();
    cy.get("input").type("20");
    cy.get("div.ng-scope > div > div.container-fluid button").click();
    cy.get("div:nth-of-type(3) > button:nth-of-type(1)").click();
    cy.get("div.fixedTopBox > button:nth-of-type(1)").click();
    cy.get("button:nth-of-type(3)").click();
    cy.get("input").click();
    cy.get("input").type("20");
    cy.get("div.ng-scope > div > div.container-fluid button").click();
    cy.get("button.home").click();
    cy.get("div:nth-of-type(2) > button").click();
    cy.get("button:nth-of-type(3)").click();
    cy.get("tr:nth-of-type(8) button").click();
  });
});
