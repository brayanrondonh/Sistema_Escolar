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
        <h1 id="titulo">Evaluar Alumno</h1>
        <form action="notas" method="post">
        <div id="cuadroPrincipal">
            <div class="contenedores_registros">
		<div class="secciones_registro_principal">
                    <div id="carnet">
			<div id="vista_previa1">

			</div>
                    </div>
                    <div class="informacion_registro">
			<h3>Datos del Alumno</h3>
                        <input type="hidden" name="accion" value="agregar">
                        <input type="hidden" name="idAlumno" value="${alumno.id_alumno}">
			<label for="primer_nombre">Primer Nombre</label>
                        <input type="text" name="primer_nombre" placeholder="Primer nombre" readonly="readonly" value="${alumno.primer_nombre}">
	            	<label for="segundo_nombre">Segundo Nombre</label>
                        <input type="text" name="segundo_nombre" placeholder="Segundo nombre" readonly="readonly" value="${alumno.segundo_nombre}">
	            	<label for="primer_apellido">Primer Apellido</label>
                        <input type="text" name="primer_apellido" placeholder="Primer apellido" readonly="readonly" value="${alumno.primer_apellido}">
	            	<label for="segindo_apellido">Segundo Apellido</label>
                        <input type="text" name="segundo_apellido" placeholder="Segundo apellido" readonly="readonly" value="${alumno.segundo_apellido}">
	            	<label for="dni">Dni</label>
                        <input type="text" name="dni" placeholder="DNI" readonly="readonly" value="${alumno.dni}">
	            	<label for="fecha_nacimiento">Fecha de nacimiento</label>
                        <input type="text" name="fecha_nacimiento" placeholder="dd/mm/aaaa" readonly="readonly" value="${alumno.fecha_nacimiento}">
	            	<label for="correo">Correo</label>
                        <input type="text" name="correo" placeholder="Correo" readonly="readonly" value="${alumno.correo}">
	            	<label for="telefono">Telefono</label>
                        <input type="text" name="telefono" placeholder="Telefono" readonly="readonly" value="${alumno.telefono}">
	            	<label for="docente">Docente</label>
	            	<select name="docente" id="registro_nota">
                            <c:forEach items="${docentes}" var="docente">
                                <option value="${docente.id_docente}">${docente.nombre} ${docente.apellido}</option>
                            </c:forEach>
	            	</select>
	            	<label for="materia">Materia</label>
                            <select name="materia" id="registro_nota">
                                <c:forEach items="${materias}" var="materia">
                                    <option value="${materia.id_materia}">${materia.materia}</option>
                                </c:forEach>	            		
                            </select>
                        <label for="nota">Nota</label>
                        <input type="number" name="nota" placeholder="nota" max="20" min="0">
                    </div>
		</div>
            </div>
            <div class="contenedores_registros botones">
		<a href="notas"><input type="button" name="atras" value="Atras"></a>
		<input type="submit" name="guardar" value="Registrar">
            </div>
	</div>
    </form>
    </div>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>