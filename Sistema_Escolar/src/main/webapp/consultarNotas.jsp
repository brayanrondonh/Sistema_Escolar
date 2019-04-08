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
	<h1 id="titulo">Registro de Datos</h1>
        <form action="notas" method="post">
            <div id="cuadroPrincipal">
		<div class="contenedores_registros">
                    <div class="secciones_registro_principal registro_materias">
			<div class="informacion_registro">
                            <h3>Registro de Notas</h3>
                            <input type="hidden" name="accion" value="actualizar">
                            <input type="hidden" name="id" value="${nota.id_nota}">
                            <label for="nota">Nota</label>
                            <input type="text" name="nota" placeholder="Materia" value="${nota.nota}">
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