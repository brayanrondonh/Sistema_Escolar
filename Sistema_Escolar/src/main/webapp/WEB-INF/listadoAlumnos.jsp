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
        <ul>
            <c:forEach items="${alumnos}" var="alumno">
                <li>${alumno.primer_nombre}</li>
            </c:forEach>
        </ul>
    </body>
</html>
