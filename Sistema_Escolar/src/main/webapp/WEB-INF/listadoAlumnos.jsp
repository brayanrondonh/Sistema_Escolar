<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Regitro de Materias</title>
    <script type="text/javascript" src="js/modernizr.js"></script>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div id="#all">
	<h1 id="titulo">Listado de Alumnos</h1>
        <div id="cuadroPrincipal">
            <div class="table-responsive">
		<table class="table">
                    <thead class="thead-light">
			<tr>
                            <th scope="col">Primer nombre</th>
                            <th scope="col">Segundo nombre</th>
                            <th scope="col">Apellido paterno</th>
                            <th scope="col">Apellido materno</th>
                            <th scope="col">DNI</th>
                            <th scope="col">Fecha de nacimiento</th>
                            <th scope="col">Edad</th>
                            <th scope="col">Email</th>
                            <th scope="col">Telefono</th>
			</tr>
                    </thead>
                    <tbody>
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
                    </tbody>
		</table>
            </div>
            <div class="contenedores_registros botones">
		<a href="index.html"><input type="button" name="atras" value="Atras"></a>
                <a href="buscarFichaAlumno.jsp"><input type="button" name="atras" value="Ficha Alumno"></a>
                <a href="agregarAlumnos.jsp"><input type="submit" name="guardar" value="Registrar"></a>
            </div>
	</div>
    </div>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>












































<!--<!DOCTYPE html>
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
                </*c:forEach items="$alumnos}" var="alumno">
                <tr>
                    <td><a href="control?accion=consultar&idAlumno=$alumno.id_alumno}">$alumno.primer_nombre}</a></td>
                    <td>$alumno.segundo_nombre}</td>
                    <td>$alumno.primer_apellido}</td>
                    <td>$alumno.segundo_apellido}</td>
                    <td>$alumno.dni}</td>
                    <td>$alumno.fecha_nacimiento}</td>
                    <td>$alumno.edad}</td>
                    <td>$alumno.correo}</td>
                    <td>$alumno.telefono}</td>
                </tr>
                <//c:forEach>
            </table>
    </body>
</html>-->
