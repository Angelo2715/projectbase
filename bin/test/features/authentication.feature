# author: LuisDominguez
# language: es
# se procede a crear la estructura, prosa y gramatica del gherkin en español, por buenas practicas.
# esto depende mucho de nuestro cliente

@authenticationLogin
Característica: Autenticación exitosa

  Yo como TAE(Test automation engineer)
  Quiero realizar una prueba de autenticación al sitio web
  Para comprobar la robustes y control de errores del aplicativo web, funcione correctamente


  Antecedentes:
    Dado "luis" abre el sitio web de pruebas

  @authenticationSuccess
  Escenario: Autenticación de usuario exitosa.
    Cuando ingresa las credenciales
    Entonces visualizara el home y espera una validacion
    Y hace clic en agregar
    Entonces completa el formulario

