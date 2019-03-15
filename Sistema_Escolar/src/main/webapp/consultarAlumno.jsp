<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Alumno</title>
    </head>
    <body>
        <h3>Consultar Alumno</h3>
        
        <form method="post" action="control">
            <input type="hidden" name="accion" value="modificar">
            <input type="hidden" name="idAlumno" value="${alumno.id_alumno}">
            Primer Nombre: <input type="text" name="primerNombre" value="${alumno.primer_nombre}"><br><br>
            Segundo Nombre: <input type="text" name="segundoNombre" value="${alumno.segundo_nombre}"><br><br>
            Primer Apellido: <input type="text" name="primerApellido" value="${alumno.primer_apellido}"><br><br>
            Segundo Apellido: <input type="text" name="segundoApellido" value="${alumno.segundo_apellido}"><br><br>
            DNI: <input type="text" name="dni" value="${alumno.dni}"><br><br>
            Fecha de Nacimineto: <input type="date" name="fechaNacimiento" value="${alumno.fecha_nacimiento}"><br><br>
            Correo: <input type="text" name="correo" value="${alumno.correo}"><br><br>
            Telefono: <input type="text" name="telefono" value="${alumno.telefono}"><br><br>
            <input type="submit" name="eliminar" value="Eliminar">
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
</html>
