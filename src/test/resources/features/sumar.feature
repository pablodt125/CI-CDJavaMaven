Feature: Sumar
  Yo como profesor de matematicas
  Quiero sumar
  Para no errar en el calculo

  Scenario: Sumar dos numeros enteros
    Given quiero sumar
    When sumo 2 mas 2
    Then deberia ver el resultado es 4
