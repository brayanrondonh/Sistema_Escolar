<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consultar Materias</h1>
        <form action="materias" method="post">
            <input type="hidden" name="accion" value="actualizar">
            <input type="hidden" name="id" value="${materia.id_materia}">
            <input type="text" name="materia" value="${materia.materia}"><br><br>
            <input type="submit" name="eliminar" value="Eliminar">
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
</html>
