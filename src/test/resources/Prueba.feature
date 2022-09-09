Feature: Escenarios de pureba Jenkins

  Scenario: buscar una palabra en Google
    Given que puedo abrir el navegado
    When busco la palabra "futbol" en Google
    Then  puedo ver el resultado de la busqueda
