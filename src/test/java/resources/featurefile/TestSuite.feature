Feature: TestSuite Test
  As a User I want to Select Desktop Option from the Computer Menu into NopCommerce Website

  @Smoke
  Scenario: User Should add the selected product successfully

    Given   I am on the HomePage
    When    I mouse hover on Computer Link
    And     I click on Desktop Link
    Then    I should navigate to Desktop Page Successfully
    And     I click on Add to Cart Button
    And     I should navigate to Build Your Own Computer Page Successfully
    And     I select 2.2 GHz Intel Pentium Dual-Core E2200 "<value>"
    And     I select 8GB [+$60.00] "<value>"
    And     I select HDD radio 400 GB [+$100.00] "<value>"
    And     I select OS radio Vista Premium [+$60.00] "<value>"
    And     I  check two check boxes Microsoft Office [+$50.00] and I check Total Commander [+$5.00]
    And     Verify the price $1475.00 "<verifyPrice>"
    And     I click on ADD TO CART Button
#    Then    Verify the Message, The product has been added to your shopping cart on Top green Bar "<verifyMessage1>"
    And     Close the bar clicking on the cross button
