<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Regitro de Materias</title>
    <script type="text/javascript" src="js/modernizr.js"></script>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div id="#all">
	<h1 id="titulo">Listado de Docentes</h1>
        <div id="cuadroPrincipal">
            <div class="table-responsive">
		<table class="table">
                    <thead class="thead-light">
			<tr>
                            <th scope="col">Nombre</th>
                            <th scope="col">Apellido</th>
                            <th scope="col">DNI</th>
                            <th scope="col">Email</th>
                            <th scope="col">Telefono</th>
			</tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${docentes}" var="doc">
                        <tr>
                            <td><a href="docentes?accion=consultar&id_docente=${doc.id_docente}">${doc.nombre}</a></td>
                            <td>${doc.apellido}</td>
                            <td>${doc.dni}</td>
                            <td>${doc.correo}</td>
                            <td>${doc.telefono}</td>
                        </tr>
                        </c:forEach>
                    </tbody>
		</table>
            </div>
            <div class="contenedores_registros botones">
                <a href="index.html"><input type="button" name="atras" value="Atras"></a>
		<a href="agregarDocentes.jsp"><input type="button" name="atras" value="Agregar Docentes"></a>
            </div>
	</div>
    </div>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>