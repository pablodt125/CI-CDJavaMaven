Feature: Contar Caracteres
  Yo como escritor
  Quiero contar caracteres
  Para conocer el numero de caracteres de una palabra

  Scenario: Contar caracteres de un palabra

    Given quiero contar caracteres
    When cuento los caracteres de la palabra Mama
    Then deberia ver que el numero de caracteres es 4