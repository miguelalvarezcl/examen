<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>
    <center>
        <h2>Administración de Cuentas Corrientes</h2>
        <h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/newcuenta">Nueva Cuenta</a>
            &nbsp;&nbsp;&nbsp;

        </h3>
    </center>
    <div align="center">
        <table border="0" cellpadding="5">
            <h3>Lista de Cuentas Corrientes</h3>
            <tr>
                <th>Id</th>
                <th>Rut Cliente</th>
                <th>Monto</th>
                <th>Ejecutivo</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="cuentabd" items="${listCuentabd}">
                <tr>
                    <td><c:out value="${cuentabd.id}" /></td>
                    <td><c:out value="${cuentabd.rutcliente}" /></td>
                    <td><c:out value="${cuentabd.monto}" /></td>
                    <td><c:out value="${cuentabd.ejecutivo}" /></td>


                    <td>
                        <a href="/CtaCorriente/editcuenta?id=<c:out value='${cuentabd.id}' />">Editar</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/CtaCorriente/deletecuenta?id=<c:out value='${cuentabd.id}' />">Eliminar</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>  
        <center>
        <h4>
                <h3>________________________________________________________________________________________________</h3>
            <a href="/CtaCorriente/home.jsp">Volver al Inicio</a> 
        </h4>
    </center> 
</body>
</html>

<style>
body{
	font-family: arial, helvetica;
	background: #DCDCDC;
}
</style>