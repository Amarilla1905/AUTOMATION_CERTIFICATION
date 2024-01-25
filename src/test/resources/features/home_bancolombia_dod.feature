Feature: Certification DoD

  i as certifier of the Bancolombia
  i want to access azure
  to perform the certification process of DOD

  Scenario: Create DoD
    Given that the user is successfully logged in page of DoD
    When we fill in the DoD fields
      | id |
      | 1  |
    Then we can create the DoD successfully

