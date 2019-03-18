<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de Representantes</h1>
        <a href="agregarRepresentante.jsp">Agregar Representante</a><br><br>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>DNI</th>
                <th>Parentesco</th>
                <th>Correo</th>
                <th>Telefono</th>
            </tr>
            <c:forEach items="#{representantes}" var="rep">
                <tr>
                    <td><a href="representantes?accion=consultar&idRepresentante=${rep.id_representante}">${rep.nombre}</a></td>
                    <td>${rep.apellido}</td>
                    <td>${rep.dni}</td>
                    <td>${rep.parentesco}</td>
                    <td>${rep.correo}</td>
                    <td>${rep.telefono}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
