<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Connecté</title>
</head>
<body>

	<h3>Connection réussie - Bienvenue Admin</h3>
	
	<a href="<c:url value="tableau"/>">Tableau des récompenses</a>
	<!-- <button type="button" class="btn btn-primary">Tableau des récompenses</a> -->
	
	<a href="<c:url value="home"/>">Deconnexion</a>
<!-- 	<button type="button" class="btn btn-primary">Deconnexion</a>
 -->
</body>
</html>