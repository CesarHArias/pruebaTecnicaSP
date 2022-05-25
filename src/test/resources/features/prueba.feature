#autor: Cesar

  Feature: Check job offers
    As a user looking for work
    I want to enter the Sophos Solutions website
    To consult the available job offers

  Scenario: Check available job offers
    Given a user enters the Sophos Solutions website
    When the user enters the Trabaje con nosotros section
    Then the user sees the available offers