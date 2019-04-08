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
			<label for="primer_nombre">Primer Nombre</label>
			<input type="text" name="primer_nombre" placeholder="Primer nombre">
	            	<label for="segundo_nombre">Segundo Nombre</label>
	            	<input type="text" name="segundo_nombre" placeholder="Segundo nombre">
	            	<label for="primer_apellido">Primer Apellido</label>
	            	<input type="text" name="primer_apellido" placeholder="Primer apellido">
	            	<label for="segindo_apellido">Segundo Apellido</label>
	            	<input type="text" name="segundo_apellido" placeholder="Segundo apellido">
	            	<label for="dni">Dni</label>
	            	<input type="text" name="dnia" placeholder="DNI">
	            	<label for="fecha_nacimiento">Fecha de nacimiento</label>
	            	<input type="date" name="fecha_nacimiento" placeholder="dd/mm/aaaa">
	            	<label for="correo">Correo</label>
	            	<input type="text" name="correo" placeholder="Correo">
	            	<label for="telefono">Telefono</label>
	            	<input type="text" name="telefono" placeholder="Telefono">
	            	<input type="hidden" name="accion" value="agregar">
                    </div>
                </div>
            </div>
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
            		<label for="nombre">Nombre</label>
            		<input type="text" name="nombre" placeholder="Nombre">
            		<label for="apellido">Apellido</label>
            		<input type="text" name="apellido" placeholder="Apellido">
            		<label for="dni">DNI</label>
            		<input type="text" name="dnip" placeholder="DNI">
                        <label for="parentesco">Parentesco</label>
            		<input type="text" name="parentesco" placeholder="Parentesco">
            		<label for="correo">Correo</label>
            		<input type="text" name="correop" placeholder="Correo">
            		<label for="telefono">Telefono</label>
            		<input type="text" name="telefonop" placeholder="Telefono">
                    </div>
		</div>
            </div>
            <div class="contenedores_registros botones">
            	<a href="control"><input type="button" name="atras" value="Atras"></a>
		<input type="submit" name="guardar" value="Registrar">
            </div>
	</div>
	</form>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>