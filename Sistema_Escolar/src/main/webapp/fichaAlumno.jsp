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
			<input type="text" name="primer_nombre" placeholder="Primer nombre">
	            	<label for="segundo_nombre">Segundo Nombre</label>
                        <input type="text" name="segundo_nombre" placeholder="Segundo nombre">
	            	<label for="primer_apellido">Primer Apellido</label>
	            	<input type="text" name="primer_apellido" placeholder="Primer apellido">
	            	<label for="segindo_apellido">Segundo Apellido</label>
	            	<input type="text" name="segundo_apellido" placeholder="Segundo apellido">
	            	<label for="dni">Dni</label>
	            	<input type="text" name="dni" placeholder="DNI">
	            	<label for="fecha_nacimiento">Fecha de nacimiento</label>
	            	<input type="date" name="fecha_nacimiento" placeholder="dd/mm/aaaa">
	            	<label for="correo">Correo</label>
	            	<input type="text" name="correo" placeholder="Correo">
	            	<label for="telefono">Telefono</label>
	            	<input type="text" name="telefono" placeholder="Telefono">
                    </div>
		</div>
            </div>
            <div class="table-responsive materias_alumno">
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
                        <tr>
                            <th>1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                            <td>@mdo</td>
                            <td>@mdo</td>
                            <td>@mdo</td>
                            <td>@mdo</td>
                            <td>@mdo</td>
			</tr>
                    </tbody>
		</table>
            </div>
            <div class="contenedores_registros botones">
		<a href="listado_alumnos.html"><input type="button" name="atras" value="Atras"></a>
            </div>
            </div>
        </form>
	</div>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>