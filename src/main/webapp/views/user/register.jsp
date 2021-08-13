<%--
  Created by IntelliJ IDEA.
  User: abrah
  Date: 8/13/2021
  Time: 8:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registrar</title>
    <link rel="stylesheet" href="${context}/assets/plugins/bootstrap/css/bootstrap.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
</head>
<body>
<form action="${context}/ServletUser" method="GET">
    <input type="hidden" value="create" name="action">
    <label>Nombre:</label>
    <input class="form-control" type="text" name="nameUser" />
    <br>
    <label>Primer Apellido:</label>
    <input class="form-control" type="text" name="primerApelliod" />
    <br>
    <label>Segundo Apellido</label>
    <input class="form-control" type="text" name="segundoApellido" />
    <br>
    <label>Pokémon</label>
    <input class="form-control" type="text" name="pokemon" />

    <button type="button" class="btn btn-secondary"><i class="fas fa-times"></i> Cancelar</button>
    <button type="submit" class="btn btn-success"><i class="fas fa-plus"></i> Agregar</button>
</form>

<script src="${context}/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="${context}/assets/dist/js/main.js"></script>
</body>
</html>
