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
		<form action="/libro/agregar" method="POST" class="col-sm-5">
			<div class="card">
				<div class="card-header">
					<h4>Agregar Libro</h4>
				</div>
				<div class="card-body">
					<div class="from-group">
						<label>TITULO</label> <input type="text" name="titulo"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>EDITORIAL</label> <input type="text" name="editorial"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>AUTOR</label> <input type="text" name="autor"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>GENERO</label> <input type="text" name="genero"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>EDICION</label> <input type="text" name="edicion"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>IDIOMA</label> <input type="text" name="idioma"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>ISBN</label> <input type="text" name="isbn"
							class="form-control" required>
					</div>
					<div class="from-group">
						<label>CATALOGO</label>
						<div class="form-check">
							<input type="radio" class="form-check-input" id="radio1"
								name="catalogo" value="true" checked>SI <label
								class="form-check-label" for="radio1"></label>
						</div>
						<div class="form-check">
							<input type="radio" class="form-check-input" id="radio2"
								name="catalogo" value="false">NO <label
								class="form-check-label" for="radio2"></label>
						</div>
					</div>
				</div>
				<div class="card-footer">
					<input type="submit" value="Guardar" class="btn btn-secondary">
					<a href="/libro/listar" class="btn btn-dark">Regresar</a>
				</div>
			</div>
		</form>
	</div>
</body>
</html>