Feature: Object

  Scenario: Object

    Given tengo acceso a todo.ly
    And me registro a la pagina
      | name | phone     | address    | ci       |
      | hugo | 123456789 | Santa Cruz | 98754341 |
    Then deberia ingresar a la aplicacion


    