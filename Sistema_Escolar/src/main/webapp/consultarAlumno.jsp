<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Regitro del Alumno</title>
    <script type="text/javascript" src="js/modernizr.js"></script>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div id="#all">
    	<h1 id="titulo">Registro del Alumno</h1>
	<form action="control" method="post">
	<div id="cuadroPrincipal">
            <div class="contenedores_registros">
		<div class="secciones_registro_principal">
                    <div id="carnet">
                        <div id="vista_previa1">

			</div>
			<div class="div_file">
                            <p class="texto_cargar_archivo">Cargar Imagen</p>
                            <input type="file" name="carnet_alumno"  accept="image/png, .jpeg, .jpg" id="btn_imagen1">
			</div>
                    </div>
                    <div class="informacion_registro">
                        <h3>Datos del Alumno</h3>
                        <input type="hidden" name="accion" value="modificar">
                        <input type="hidden" name="idAlumno" value="${alumno.id_alumno}">
			<label for="primer_nombre">Primer Nombre</label>
			<input type="text" placeholder="Primer nombre" name="primerNombre" value="${alumno.primer_nombre}">
	            	<label for="segundo_nombre">Segundo Nombre</label>
	            	<input type="text" placeholder="Segundo nombre" name="segundoNombre" value="${alumno.segundo_nombre}">
                        <label for="primer_apellido">Primer Apellido</label>
                        <input type="text" placeholder="Primer apellido" name="primerApellido" value="${alumno.primer_apellido}">
	            	<label for="segindo_apellido">Segundo Apellido</label>
                        <input type="text" placeholder="Segundo apellido" name="segundoApellido" value="${alumno.segundo_apellido}">
                        <label for="dni">Dni</label>
	            	<input type="text" name="dni" placeholder="DNI" value="${alumno.dni}">
	            	<label for="fecha_nacimiento">Fecha de nacimiento</label>
	            	<input type="date" name="fechaNacimiento" value="${alumno.fecha_nacimiento}">
	            	<label for="correo">Correo</label>
	            	<input type="text" name="correo" placeholder="Correo" value="${alumno.correo}">
	            	<label for="telefono">Telefono</label>
	            	<input type="text" name="telefono" placeholder="Telefono" value="${alumno.telefono}">
                    </div>
		</div>
            </div>
            <div class="contenedores_registros botones">
		<input type="submit" name="eliminar" value="Eliminar">
                <input type="submit" name="modificar" value="Modificar">
            </div>
        </div>
	</form>
    </div>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>