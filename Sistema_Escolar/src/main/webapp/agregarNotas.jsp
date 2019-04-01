<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Notas</title>
    </head>
    <body>
        <h1>Agregar Notas</h1><br>
        <form action="notas" method="post">
            <input type="hidden" name="accion" value="agregar">
            Notas: <input type="text" name="nota"><br><br>
            <input type="submit" value="Registrar">
        </form>        
    </body>
</html>
