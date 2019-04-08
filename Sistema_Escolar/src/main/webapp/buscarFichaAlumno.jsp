<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Regitro de Materias</title>
    <script type="text/javascript" src="js/modernizr.js"></script>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
    <div id="#all">
	<h1 id="titulo">Fichas de Alumnos</h1>
        <form action="control" method="post">
            <div id="cuadroPrincipal">
		<div class="contenedores_registros">
                    <div class="secciones_registro_principal registro_materias">
			<div class="informacion_registro">
                            <h3>Ingrese DNI del Alumno</h3>
                            <input type="hidden" name="accion" value="buscarFicha">
                            <label for="dni">DNI</label>
                            <input type="text" name="dni" placeholder="DNI">
			</div>
                    </div>
		</div>
		<div class="contenedores_registros botones">
                    <a href="control"><input type="button" name="atras" value="Atras"></a>
                    <input type="submit" value="Buscar">
		</div>
            </div>
	</form>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>