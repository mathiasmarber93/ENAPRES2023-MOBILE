@enapres @CP01
Feature: CP01 - Validar inicio de sesion
  Background: Validar el inicio de sesion con credenciales validas e invalidas

  Scenario: CP0101 - Ingresar credenciales invalidas
    Given el usuario ingresa credenciales invalidas
    Then la app deberia mostrar un mensaje de error

  Scenario: CP0102 - Ingresar credenciales validas
    Given el usuario ingresa credenciales validas
    Then la app deberia mostrar un mensaje de bienvenida


