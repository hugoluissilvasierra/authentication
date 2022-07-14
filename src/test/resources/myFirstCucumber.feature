Feature: Login

  Scenario: Como usuario quiero ingresar a la aplicación usando email y pwd para revisar mis archivos

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso mi correo electronico: "hugoluissilvasierra@gmail.com"
    And ingreso mi password: 123456
    And realizo click en el boton login
    Then deberia ingresar a la aplicacion

