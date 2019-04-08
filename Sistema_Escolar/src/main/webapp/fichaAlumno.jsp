<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h1 id="titulo">Listado de Alumnos</h1>
	<form action="control" method="post">
        <div id="cuadroPrincipal">
            <div class="contenedores_registros">
                <div class="secciones_registro_principal">
                    <div id="carnet">
			<div id="vista_previa1">

			</div>
                    </div>
                    <div class="informacion_registro">
                        <h3>Datos del Alumno</h3>
			<label for="primer_nombre">Primer Nombre</label>
                        <input type="text" name="primer_nombre" placeholder="Primer nombre" value="${alumno.primer_nombre}" readonly="readonley">
	            	<label for="segundo_nombre">Segundo Nombre</label>
                        <input type="text" name="segundo_nombre" placeholder="Segundo nombre" value="${alumno.segundo_nombre}" readonly="readonley">
	            	<label for="primer_apellido">Primer Apellido</label>
                        <input type="text" name="primer_apellido" placeholder="Primer apellido" value="${alumno.primer_apellido}" readonly="readonley">
	            	<label for="segindo_apellido">Segundo Apellido</label>
                        <input type="text" name="segundo_apellido" placeholder="Segundo apellido" value="${alumno.segundo_apellido}" readonly="readonley">
	            	<label for="dni">Dni</label>
                        <input type="text" name="dni" placeholder="DNI" value="${alumno.dni}" readonly="readonley">
	            	<label for="fecha_nacimiento">Fecha de nacimiento</label>
                        <input type="text" name="fecha_nacimiento" placeholder="dd/mm/aaaa" value="${alumno.fecha_nacimiento}" readonly="readonley">
                        <label for="correo">Edad</label>
                        <input type="text" name="edad" placeholder="Edad" value="${alumno.edad}" readonly="readonley">
	            	<label for="correo">Correo</label>
                        <input type="text" name="correo" placeholder="Correo" value="${alumno.correo}" readonly="readonley">
	            	<label for="telefono">Telefono</label>
	            	<input type="text" name="telefono" placeholder="Telefono" value="${alumno.telefono}" readonly="readonley">
                    </div>
		</div>
            </div>
            <div class="table-responsive materias_alumno">
		<table class="table">
                    <thead class="thead-light">
			<tr>
                            <th scope="col">Materia</th>
                            <th scope="col">Evaluación</th>
                            <th scope="col">Docente</th>
			</tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${notas}" var="nota">
                            <tr>
                            <th>${nota.getMaterias().getMateria()}</th>
                            <th>${nota.nota}</th>
                            <th>${nota.getDocentes().getNombre()} ${nota.getDocentes().getApellido()}</th>
			</tr>
                        </c:forEach>
                    </tbody>
		</table>
            </div>
            <div class="contenedores_registros botones">
		<a href="control"><input type="button" name="atras" value="Atras"></a>
            </div>
            </div>
        </form>
	</div>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>