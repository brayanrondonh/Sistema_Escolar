<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><!DOCTYPE html>
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
	<form action="representantes" method="post">
        <div id="cuadroPrincipal">
            <div class="contenedores_registros">
		<div class="secciones_registro_principal">
                    <div id="carnet">
			<div id="vista_previa2">

			</div>
			<div class="div_file">
                            <p class="texto_cargar_archivo">Cargar Imagen</p>
                            <input type="file" name="carnet_alumno" accept="image/png, .jpeg, .jpg" id="btn_imagen2">
			</div>
                    </div>
                    <div class="informacion_registro">
			<h3>Datos del Representante</h3>
			<input type="hidden" name="accion" value="actualizar">
                        <input type="hidden" name="idRepresentante" value="${representante.id_representante}">
            		<label for="nombre">Nombre</label>
            		<input type="text" name="nombre" placeholder="Nombre" value="${representante.nombre}">
            		<label for="apellido">Apellido</label>
            		<input type="text" name="apellido" placeholder="Apellido" value="${representante.apellido}">
            		<label for="dni">DNI</label>
            		<input type="text" name="dni" placeholder="DNI" value="${representante.dni}">
            		<label for="parentesco">Parentesco</label>
            		<input type="text" name="parentesco" placeholder="Parentesco" value="${representante.parentesco}">
            		<label for="correo">Correo</label>
            		<input type="text" name="correo" placeholder="Correo" value="${representante.correo}">
            		<label for="telefono">Telefono</label>
            		<input type="text" name="telefono" placeholder="Telefono" value="${representante.telefono}">
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