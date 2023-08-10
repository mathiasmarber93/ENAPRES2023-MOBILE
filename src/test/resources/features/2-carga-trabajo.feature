@enapres @CP02
Feature: CP02 - Gestionar marco de trabajo
  Background: Validar que realice la carga del marco de trabajo

    @uploadFile
    Scenario: CP0201 - Validar carga de marco de trabajo
      Given el usuario ingresa credenciales validas
      When navega al modulo cargar configuracion
      And selecciona el archivo .zip
      Then la app deberia mostrar un mensaje de importacion exitosa
