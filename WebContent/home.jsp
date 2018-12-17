<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Accueil</title>
</head>

<body>

	<h1>Bienvenue</h1>

	<c:if test = "${empty login}">
	
	<a href = "<c:url value="home"/>">
	<button type="button">Connexion</button>
	</a>
		
	</c:if>
	
</body>
</html>