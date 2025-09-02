Feature: Operações da Calculadora
  Scenario: Somar dois números
    Given que eu tenho os números 2 e 3
    When eu somo os dois números
    Then o resultado deve ser 5

  Scenario: Dividir dois números
    Given que eu tenho os números 4 e 2
    When eu divido o primeiro pelo segundo
    Then o resultado deve ser 2