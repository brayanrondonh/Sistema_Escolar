<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="agregarMaterias.jsp">Agregar materias</a>
        <h1>Listar Materias</h1>
        <table border="1">
            <tr>
                <th>Materia</th>
            </tr>
            <c:forEach items="${materias}" var="materia">
                <tr>
                    <td><a href="materias?accion=consultar&id=${materia.id_materia}">${materia.materia}</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
