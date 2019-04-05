<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Regitro de Materias</title>
	<script type="text/javascript" src="js/modernizr.js"></script>
	<link rel="stylesheet" type="text/css" href="css/normalize.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
							<input type="text" name="primer_nombre" placeholder="Primer nombre" readonly="readonly">
	            			<label for="segundo_nombre">Segundo Nombre</label>
	            			<input type="text" name="segundo_nombre" placeholder="Segundo nombre" readonly="readonly">
	            			<label for="primer_apellido">Primer Apellido</label>
	            			<input type="text" name="primer_apellido" placeholder="Primer apellido" readonly="readonly">
	            			<label for="segindo_apellido">Segundo Apellido</label>
	            			<input type="text" name="segundo_apellido" placeholder="Segundo apellido" readonly="readonly">
	            			<label for="dni">Dni</label>
	            			<input type="text" name="dni" placeholder="DNI" readonly="readonly">
	            			<label for="fecha_nacimiento">Fecha de nacimiento</label>
	            			<input type="date" name="fecha_nacimiento" placeholder="dd/mm/aaaa" readonly="readonly">
	            			<label for="correo">Correo</label>
	            			<input type="text" name="correo" placeholder="Correo" readonly="readonly">
	            			<label for="telefono">Telefono</label>
	            			<input type="text" name="telefono" placeholder="Telefono" readonly="readonly">
	            			<label for="docente">Docente</label>
	            			<select name="docente" id="registro_nota">
	            				<option value="#">-- Seleccione un docente --</option>
	            				<option value="Lenguaje">Lenguaje</option>
	            				<option value="Matématica">Matéematica</option>
	            				<option value="Física">Física</option>
	            				<option value="Química">Química</option>
	            				<option value="Informática">Informática</option>
	            				<option value="Logíca">Logíca</option>
	            				<option value="Metodología">Metodología</option>
	            			</select>
	            			<label for="materia">Materia</label>
	            			<select name="materia" id="registro_nota">
	            				<option value="#">-- Seleccione una materia --</option>
	            				<option value="Lenguaje">Lenguaje</option>
	            				<option value="Matématica">Matéematica</option>
	            				<option value="Física">Física</option>
	            				<option value="Química">Química</option>
	            				<option value="Informática">Informática</option>
	            				<option value="Logíca">Logíca</option>
	            				<option value="Metodología">Metodología</option>
	            			</select>
	            			<label for="nota">Nota</label>
	            			<input type="text" name="nota" placeholder="nota">
						</div>
					</div>
				</div>
				<div class="contenedores_registros botones">
					<a href="listado_notas.html"><input type="button" name="" value="Atras"></a>
					<input type="submit" name="guardar" value="Registrar">
				</div>
			</div>
		</form>
	</div>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>




































<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Notas</title>
    </head>
    <body>
        <h1>Agregar Notas</h1><br>
        <form action="notas" method="post">
            <input type="hidden" name="accion" value="agregar">
            Notas: <input type="text" name="nota"><br><br>
            <input type="submit" value="Registrar">
        </form>        
    </body>
</html>
