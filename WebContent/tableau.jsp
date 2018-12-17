<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tableau des récompenses</title>
</head>
<body>

	<table>
		<tr>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Discipline</th>
			<th>Recompense</th>
		</tr>
		<c:forEach items="${athlete}" var="a">
			<tr>
				<td>${a.nom}</td>
				<td>${a.prenom}</td>

				<c:forEach items="${a.disciplines}" var="d">

					<td>${d.discipline}</td>
				</c:forEach>

				<c:forEach items="${a.recompenses}" var="r">

					<td>${r.recompense}</td>
				</c:forEach>

			</tr>
		</c:forEach>
	</table>


	<%-- <div class="input-group mb-3">
		<div class="input-group-prepend">
			<label class="input-group-text" for="inputGroupSelect01">Disciplines</label>
		</div>
		<select class="custom-select" id="inputGroupSelect01">
		
			<option selected>Choisir une discipline</option>
			<a href="<c:url value="tableau"/>">
			
			<c:forEach items="${disciplines}" var="d">
			
			
			<option value="1">${d.discipines}</option>
			<option value="2">Two</option>
			<option value="3">Three</option>
		</select>
	</div>
	
	<div class="input-group mb-3">
		<div class="input-group-prepend">
			<label class="input-group-text" for="inputGroupSelect01">Recompenses</label>
		</div>
		<select class="custom-select" id="inputGroupSelect01">
			<option selected>Choisir une récompense</option>
			
			<c:forEach items="${recompenses}" var="r">
		
			<option value="1">${r.recompense}</option>
			<option value="2">Course de 100mtr</option>
			<option value="3">Saut à la perche</option>
		</select>
	</div> --%>


</body>
</html>