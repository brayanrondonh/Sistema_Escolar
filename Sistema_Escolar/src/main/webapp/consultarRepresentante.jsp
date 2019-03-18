<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Consultar Representante</h3>
        <form action="representantes" method="post">
            <input type="hidden" name="accion" value="actualizar">
            <input type="hidden" name="idRepresentante" value="${representante.id_representante}">
            Nombre: <input type="text" name="nombre" value="${representante.nombre}"><br><br>
            Apellido: <input type="text" name="apellido" value="${representante.apellido}"><br><br>
            DNI: <input type="text" name="dni" value="${representante.dni}"><br><br>
            Parentesco: <input type="text" name="parentesco" value="${representante.parentesco}"><br><br>
            Correo: <input type="text" name="correo" value="${representante.correo}"><br><br>
            Telefono: <input type="text" name="telefono" value="${representante.telefono}"><br><br>
            <input type="submit" name="eliminar" value="Eliminar">
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
</html>