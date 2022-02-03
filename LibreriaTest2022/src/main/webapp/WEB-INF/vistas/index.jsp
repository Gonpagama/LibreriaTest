<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LIBRERIA TEST</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
	<a href="/libro/nuevo" class="btn btn-success">Agregar Nuevo</a>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>TITULO</th>
					<th>EDITORIAL</th>
					<th>AUTOR</th>
					<th>GENERO</th>
					<th>EDICION</th>
					<th>IDIOMA</th>
					<th>ISBN</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="libro" items="${libros}">
					<tr>
						<td>${libro.id}</td>
						<td>${libro.titulo}</td>
						<td>${libro.editorial}</td>
						<td>${libro.autor}</td>
						<td>${libro.genero}</td>
						<td>${libro.edicion}</td>
						<td>${libro.idioma}</td>
						<td>${libro.isbn}</td>
						<td>
						<a href="/libro/editar/${libro.id}" class="btn btn-warning">Editar</a> 
						<a href="/libro/eliminar/${libro.id}" class="btn btn-danger">Eliminar</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
<div class="container mt-4">
	<a href="/catalogo/nuevo" class="btn btn-success">Agregar Nuevo</a>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>TITULO</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="catalogo" items="${catalogos}">
					<tr>
						<td>${catalogo.id}</td>
						<td>${catalogo.titulo}</td>

						<td>
						<a href="/catalogo/editar/${catalogo.id}" class="btn btn-warning">Editar</a> 
						<a href="/catalogo/eliminar/${catalogo.id}" class="btn btn-danger">Eliminar</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>