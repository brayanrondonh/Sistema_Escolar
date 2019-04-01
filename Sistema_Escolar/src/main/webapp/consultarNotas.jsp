<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Notas</title>
    </head>
    <body>
        <h1>Consultar Notas</h1>
        <form action="notas" method="post">
            <input type="hidden" name="accion" value="actualizar">
            <input type="hidden" name="id" value="${nota.id_nota}">
            Nota <input type="text" name="nota" value="${nota.nota}"><br><br>
            <input type="submit" name="eliminar" value="Eliminar">
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
</html>
