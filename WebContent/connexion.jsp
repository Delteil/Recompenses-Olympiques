<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Connexion</title>
</head>
<body>
	
	<fieldset>
		<form method="post" action=connexion>
			<legend>Connexion</legend>
			<br/>
			<label for="login"> Login </label>
			<input type="text" name = "login" />
			<br /> 
			<label for="motdepasse">Mot de passe </label>
			<input type="password" name="motdepasse" />
				<br/> 
				
			<input type="submit" />
				<br/>
		</form>
	</fieldset>
</body>
</html>