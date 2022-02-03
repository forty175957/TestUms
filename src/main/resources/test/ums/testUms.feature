Feature: testUms
  Scenario: testiamo il login
    Given L'username è "cicciopasticcio"
    And La password è "prova123"
    When Premo su login
    Then Riceverò a schermo la stinga di benvenuto