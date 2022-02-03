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
		<form action="/catalogo/agregar" method="POST" class="col-sm-5">
		<div class="card">
			<div class="card-header">
				<h4>Agregar Catalogo</h4>
			</div>
			<div class="card-body">
				<div class="from-group">
					<label>TITULO</label> <input type="text" name="titulo"
						class="form-control">
				</div>

			</div>
			<div class="card-footer">
				<input type="submit" value="Guardar" class="btn btn-secondary">
				<a href="/catalogo/listar" class="btn btn-dark">Regresar</a>
			</div>
		</div>
		</form>
	</div>
</body>
</html>