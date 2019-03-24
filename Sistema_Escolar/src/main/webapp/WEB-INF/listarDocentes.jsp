<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="agregarDocentes.jsp">Agregar Docentes</a><br><br>
        <h1>Listar Docentes</h1>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>DNI</th>
                <th>Correo</th>
                <th>Telefono</th>
            </tr>
            <c:forEach items="${docentes}" var="doc">
                <tr>
                    <td><a href="docentes?accion=consultar&id_docente=${doc.id_docente}">${doc.nombre}</a></td>
                    <td>${doc.apellido}</td>
                    <td>${doc.dni}</td>
                    <td>${doc.correo}</td>
                    <td>${doc.telefono}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
