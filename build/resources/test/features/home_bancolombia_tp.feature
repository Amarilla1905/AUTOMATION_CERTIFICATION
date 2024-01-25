Feature: Certification TP

  i as certifier of the Bancolombia
  i want to access azure
  to perform the certification process of Test Plan


  Scenario: Create Test Plan
    Given that the user is successfully logged in page of TP
    When we fill in the test plan fields
      |id |
      | 1 |
    Then we can create the test plan successfull




