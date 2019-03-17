<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Representante</title>
    </head>
    <body>
        <h3>Agregar Representante</h3>
        <form action="representantes" method="post">
            <input type="hidden" name="accion" value="agregar">
            Nombre: <input type="text" name="nombre"><br><br>
            Apellido: <input type="text" name="apellido"><br><br>
            DNI: <input type="text" name="dni"><br><br>
            Parentesco: <input type="text" name="parentesco"><br><br>
            Correo: <input type="text" name="correo"><br><br>
            Telefono: <input type="text" name="telefono"><br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
