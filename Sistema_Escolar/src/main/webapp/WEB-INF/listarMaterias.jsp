<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Regitro de Materias</title>
    <script type="text/javascript" src="js/modernizr.js"></script>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <link href="css/estilos.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div id="#all">
        <h1 id="titulo">Listado de Materias</h1>
            <div id="cuadroPrincipal">
                <div class="table-responsive materias">
                    <table class="table">
                        <thead class="thead-light">
                            <tr>
                                <th scope="col">Materias</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${materias}" var="materia">
                        <tr>
                            <th><a href="materias?accion=consultar&id=${materia.id_materia}">${materia.materia}</a></th>
                        </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="contenedores_registros botones">
                    <a href="index.html"><input type="button" name="atras" value="Atras"></a>
                    <a href="agregarMaterias.jsp"><input type="button" name="atras" value="Agregar Materias"></a>
                </div>
            </div>
    </div>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
</body>
</html>