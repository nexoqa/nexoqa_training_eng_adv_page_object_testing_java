Feature: Check the correct behavior of the register features in the Ecommerce

  Scenario: Register new user
    Given the user wants to access to the ecommerce
    And the user wants to register in the ecommerce
    When the user fill the register form
    Then the use is on the my account page

