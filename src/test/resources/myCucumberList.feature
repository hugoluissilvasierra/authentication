Feature: List

  Scenario: List

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso mi correo electronico: "hugoluissilvasierra@gmail.com"
    And ingreso mi password: 123456
    And realizo click en el boton login
    Then deberia ingresar a la aplicacion
    And los siguientes controles deberian ser mostrados
      | admin    |
      | compras  |
      | ventas   |
      | facturas |

