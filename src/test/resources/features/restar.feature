Feature: Restar
  Yo como profesor de matematicas
  Quiero restar
  Para no errar en el calculo

  Scenario Outline: Restar numeros enteros

    Given quiero restar
    When resto <primerNumero> menos <SegundoNumero>
    Then deberia ver el resultado de la resta es <resultado>
    Examples:
    |primerNumero|SegundoNumero|resultado|
    |4           |2            |2        |
    |2           |2            |0        |