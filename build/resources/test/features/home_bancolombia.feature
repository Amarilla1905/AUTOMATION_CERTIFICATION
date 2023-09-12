Feature: Certification

  i as certifier of the Bancolombia
  i want to access azure
  to perform the certification process

  @BancolombiaLogin

  Scenario: Login Bancolombia

    Given that the user is successfully logged in
    When we fill in the test plan fields
    |id |
    | 1 |
    Then we can create the test plan successfully
