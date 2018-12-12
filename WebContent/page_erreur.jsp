<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Page not found</title>
</head>
<body>
	<c:if test="${!empty login}"></c:if>
	<script>alert('login ou mot de passe incorrect');</script>
	
</body>
</html>