<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>

    <center>
        <h2>Administración de Cuentas Corrientes</h2>
        <h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/newcuenta">Crear Nueva Cuenta</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/listCuentabd">Listar Cuentas</a>
             
        </h3>
    </center>
    <div align="center">
        <c:if test="${cuentabd != null}">
            <form action="updatecuenta" method="post">
        </c:if>
        <c:if test="${cuentabd == null}">
            <form action="insertcuenta" method="post">
        </c:if>
        <table border="0" cellpadding="5">
            <caption>
                <h3>
                    <c:if test="${usuariobd != null}">
                        Editar cuenta
                    </c:if>
                    <c:if test="${usuariobd == null}">
                        Agregar Cuenta Corrientes al Sistema
                    </c:if>
                </h3>
            </caption>
                <c:if test="${cuentabd != null}">
                    <input type="hidden" name="id" value="${cuentabd.id}" />
                </c:if>           
            <tr>
                <th>Rut Cliente: </th>
                <td>
                    <input type="text" name="rutcliente" size="45"
                            value="${cuentabd.rutcliente}"
                        />
                </td>
            </tr>
            <tr>
                <th>Monto: </th>
                <td>
                    <input type="text" name="monto" size="45"
                            value="${cuentabd.monto}"
                    />
                </td>
            </tr>
            <tr>
                <th>Ejecutivo: </th>
                <td>
                    <input type="text" name="ejecutivo" size="45"
                            value="${cuentabd.ejecutivo}"
                    />
                </td>
            </tr>


            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Grabar" />
                </td>
            </tr>
        </table>
        </form>
    </div> 
            <center>
        <h4>
            <h3>________________________________________________________________________________________________</h3>
            <h5>* Por favor debe completar todos los campos, son obligatorios.</h5>
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