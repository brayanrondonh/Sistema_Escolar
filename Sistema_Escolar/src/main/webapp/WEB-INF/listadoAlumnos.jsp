<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="agregarAlumnos.jsp">Agregar Alumnos</a>
        <h1>Listado de Alumnos</h1>
            <table border="1">
                <tr>
                    <th>Primer Nombre</th>
                    <th>Segundo Nombre</th>
                    <th>Apellido Paterno</th>
                    <th>Apellido Materno</th>
                    <th>DNI</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Edad</th>
                    <th>Email</th>
                    <th>Telefono</th>
                </tr>
                <c:forEach items="${alumnos}" var="alumno">
                <tr>
                    <td><a href="control?accion=consultar&idAlumno=${alumno.id_alumno}">${alumno.primer_nombre}</a></td>
                    <td>${alumno.segundo_nombre}</td>
                    <td>${alumno.primer_apellido}</td>
                    <td>${alumno.segundo_apellido}</td>
                    <td>${alumno.dni}</td>
                    <td>${alumno.fecha_nacimiento}</td>
                    <td>${alumno.edad}</td>
                    <td>${alumno.correo}</td>
                    <td>${alumno.telefono}</td>
                </tr>
                </c:forEach>
            </table>
    </body>
</html>
