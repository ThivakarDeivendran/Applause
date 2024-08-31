Feature: Douglas Application

  I want to verify the perfume product get filter out in Douglas Application

  Background: 
    Given User Launch the Browser
    When User Navigate into URL
    Then User Validate the title of Application
    And User click "Perfume" Tab in the Application

  Scenario: User validate the product based on filters
    Given User select the sale from the highlights dropdown
    When User Enter the brand Name in the brand dropdown
    And User select the productType in the ProductType dropdown
    And User select gender from the forWhom Dropdown
    Then User validate the listOfProducts and print the Name
    And User clear the filters button
    And User Close the Browser

  Scenario: User validate the product based on filters
    Given User select the Gift in the highlights dropdown
    When User Enter the ProductTypeName in the productTypedropdown
    And User select gender from the forWhom Dropdown
    Then User validate the listOfProducts and print the Name
    And User clear the filters button
    And User Close the Browser

  Scenario: User validate the product based on filters
    Given User select the Limited from the highlights dropdown
    When User Enter the brand NameLimited in the brand dropdown
    And User select the productType in the ProductType dropdown
    And User select gender from the forWhom Dropdown
    Then User validate the listOfProducts and print the Name
    And User clear the filters button
    And User Close the Browser
