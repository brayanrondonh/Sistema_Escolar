<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Docentes</title>
    </head>
    <body>
        <form action="docentes" method="post">
            <input type="hidden" name="accion" value="agregar">
            Nombre: <input type="text" name="nombre"><br><br>
            Apellido: <input type="text" name="apellido"><br><br>
            DNI: <input type="text" name="dni"><br><br>
            Correo: <input type="text" name="correo"><br><br>
            Telefono: <input type="text" name="telefono"><br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
