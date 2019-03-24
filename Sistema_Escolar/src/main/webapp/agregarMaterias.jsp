<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Materias</h1>
        <form action="materias" method="post">
            <input type="hidden" name="accion" value="agregar">
            Materia: <input type="text" name="materia">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
