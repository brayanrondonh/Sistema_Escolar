<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Docentes</title>
    </head>
    <body>
        <h3>Consultar Docentes</h3>
        <form action="docentes" method="post">
            <input type="hidden" name="accion" value="actualizar">
            <input type="hidden" name="id" value="${docentes.id_docente}"><br><br>
            Nombre: <input type="text" name="nombre" value="${docentes.nombre}"><br><br>
            Apellido: <input type="text" name="apellido" value="${docentes.apellido}"><br><br>
            DNI: <input type="text" name="dni" value="${docentes.dni}"><br><br>
            Correo: <input type="text" name="correo" value="${docentes.correo}"><br><br>
            Telefono: <input type="text" name="telefono" value="${docentes.telefono}"><br><br>
            <input type="submit" name="eliminar" value="Eliminar">
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
</html>
