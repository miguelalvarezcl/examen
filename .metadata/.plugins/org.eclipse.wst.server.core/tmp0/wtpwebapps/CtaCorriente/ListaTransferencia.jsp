<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Banco Platinum</title>
</head>
<body>
    <center>
        <h1>Transferencias Electrónicas</h1>
        <h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/newtransferencia">Nueva Transferencia</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/listTransferencia">Listar Transferencias</a>
            &nbsp;&nbsp;&nbsp;
        </h3>
    </center>
    <div align="center">
        <table border="0" cellpadding="5">
            <h3>Lista de Transferencias</h3>
            <tr>
                <th>ID</th>
                <th>Rut Persona</th>
                <th>Usuario</th>
                <th>Cuenta</th>
                <th>Monto</th>
                <th>Cuenta Destino</th>
                <th>Tipo Cuenta</th>                


            </tr>
            <c:forEach var="transferencia" items="${listTransferencia}">
                <tr>
                    <td><c:out value="${transferencia.id}" /></td>
                    <td><c:out value="${transferencia.rutpersona}" /></td>
                    <td><c:out value="${transferencia.idusuario}" /></td>
                    <td><c:out value="${transferencia.idcuenta}" /></td>
                    <td><c:out value="${transferencia.montotransferencia}" /></td>
                    <td><c:out value="${transferencia.cuentatransferencia}" /></td>
                    <td><c:out value="${transferencia.tipocuenta}" /></td>                                                            


                </tr>
            </c:forEach>
        </table>
    </div> 
        <center>
        <h3>________________________________________________________________________________________________</h3>
        <h4>
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