<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>:::... Banco Platinum ...:::</title>
</head>
<body>
	<div style="text-align: center">
		<h1>BANCO PLATINUM</h1>
		<h3>________________________________________________________________________________________________</h3>

	</div>
		<ul class="menu">
			<li><a href="http://localhost:49670/CtaCorriente/">|  USUARIOS  |</a></li>
			<li><a href="http://localhost:49670/CtaCorriente/listPersonabd">|   PERSONAS   |</a></li>
			<li><a href="http://localhost:49670/CtaCorriente/listCuentabd">| CUENTAS CORRIENTES |</a></li>
			<li><a href="http://localhost:49670/CtaCorriente/listTransferencia">| TRANSFERENCIAS |</a></li>

		</ul>	
	<div style="text-align: center">
		<h3>________________________________________________________________________________________________</h3>

	</div>
</body>
</html>
<style>
body{
	font-family: arial, helvetica;
	background: #DCDCDC;
}


.menu{
	list-style: none;
	padding: 0;
	background: #A9A9A9;
	width: 100%;
	max-width: 1000px;
	margin: auto;
}

.menu li a{
	text-decoration: none;
	color: white;
	padding: 20px;
	display: block;
}

.menu li{
	display: inline-block;
	text-align: center;
}

.menu li a:hover{
	background: #C0C0C0;
}


</style>