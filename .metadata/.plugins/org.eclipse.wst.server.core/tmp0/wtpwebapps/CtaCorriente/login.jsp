<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>:::... Inicio de Sesión de Usuario ...:::</title>

</head>
<body>
	<div style="text-align: center">
		<h2>Inicio de Sesión de Usuario</h2>
			<h3>________________________________________________________________________________________________</h3>
		<form action="login" method="post" id="loginForm">
			<label for="usuario">Usuario:</label>
			<input name="usuario" size="30" value = "miguel"/>
			<br><br>
			<label for="password">Clave:</label>
			<input type="password" name="password" size="30" value="123" />
			<br>${message}
			<br><br>			
			<button type="submit">Ingresar</button>

		</form>
	</div>
	    <center>
		 <h3>________________________________________________________________________________________________</h3>
    	 <h5>* Por favor debe completar ambos campos, son obligatorios.</h5>
   	    </center>
</body>

<style>
body{
	font-family: arial, helvetica;
	background: #DCDCDC;
}
</style>
</html>
