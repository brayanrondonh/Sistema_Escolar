<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumnos</title>
    </head>
    <body>
        <h1>Agregar Alumnos</h1>
        
        <form action="control" method="post">
            Primer Nombre: <input type="text" name="primer_nombre"><br><br>
            Segundo Nombre: <input type="text" name="segundo_nombre"><br><br>
            Primer Apellido: <input type="text" name="primer_apellido"><br><br>
            Segundo Apellido: <input type="text" name="segundo_apellido"><br><br>
            Dni: <input type="text" name="dni"><br><br>
            Fecha de nacimiento: <input type="date" name="fecha_nacimiento"><br><br>
            Correo: <input type="text" name="correo"><br><br>
            Telefono: <input type="text" name="telefono"><br><br>
            <input type="hidden" name="accion" value="agregar">
            <input type="submit" value="Guardar">
        </form>        
    </body>
</html>
