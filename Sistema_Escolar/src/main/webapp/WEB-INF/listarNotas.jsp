<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Notas</title>
    </head>
    <body>
        <a href="agregarNotas.jsp">Agregar Notas</a>
        <h1>Listar Notas</h1> 
        <table border="1">
            <tr>
                <th>Notas</th>
            </tr>
            <c:forEach items="${notas}" var="nota">
                <tr>
                    <td><a href="notas?accion=consultar&id=${nota.id_nota}">${nota.nota}</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
