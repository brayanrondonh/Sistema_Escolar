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
        <form action="materias" method="post">
            <div id="cuadroPrincipal">
		<div class="contenedores_registros">
                    <div class="secciones_registro_principal registro_materias">
			<div class="informacion_registro">
                            <h3>Registro de Materias</h3>
                            <input type="hidden" name="accion" value="agregar">
                            <label for="materia">Materia</label>
                            <input type="text" name="materia" placeholder="Materia">
			</div>
                    </div>
		</div>
		<div class="contenedores_registros botones">
                    <a href="materias"><input type="button" name="atras" value="Atras"></a>
                    <input type="submit" value="Registrar">
		</div>
            </div>
	</form>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>


















<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Materias</h1>
        <form action="materias" method="post">
            <input type="hidden" name="accion" value="agregar">
            Materia: <input type="text" name="materia">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>-->