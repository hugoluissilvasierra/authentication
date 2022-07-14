Feature: Map

  Scenario: Map

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso a la aplicacion usando
      | email    | hugo@hugo.com  |
      | password   | 123456 |
    Then deberia ingresar a la aplicacion


    