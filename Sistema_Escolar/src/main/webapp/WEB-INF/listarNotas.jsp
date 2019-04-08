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
                            <th scope="col">Alumno</th>
                            <th scope="col">Docente</th>
                            <th scope="col">Materia</th>
                            <th scope="col">Puntaje</th>
			</tr>
                    </thead>
                    <tbody>
			<c:forEach items="${notas}" var="nota">
                        <tr>
                            <td><a href="notas?accion=consultar&id=${nota.id_nota}">${nota.getAlumnos().primer_nombre} ${nota.getAlumnos().primer_apellido}</a></td>
                            <td>${nota.getDocentes().nombre} ${nota.getDocentes().apellido}</td>
                            <td>${nota.getMaterias().materia}</td>
                            <td>${nota.nota}</td>
                        </tr>
                        </c:forEach>
                    </tbody>
		</table>
            </div>
            <div class="contenedores_registros botones">
		<a href="index.html"><input type="button" name="atras" value="Atras"></a>
                <a href="buscarAlumnoNotas.jsp"><input type="button" name="atras" value="Evaluar Alumno"></a>
            </div>
	</div>
    </div>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>