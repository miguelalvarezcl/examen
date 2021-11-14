<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>

    <center>
        <h1>Transferencias</h1>
        <h3>________________________________________________________________________________________________</h3>
    <h3>
            <a href="/CtaCorriente/newtransferencia">Nueva transferencia</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/listTransferencia">Listar transferencias</a>
                     
    </h3>

    </center>
    <div align="center">
        <c:if test="${transferencia != null}">
            <form action="updatetransferencia" method="post">
        </c:if>
        <c:if test="${transferencia == null}">
            <form action="inserttransferencia" method="post">
        </c:if>
        <table border="0" cellpadding="5">
            <caption>
                <h3>
                    <c:if test="${transferencia != null}">
                        Editar transferencia
                    </c:if>
                    <c:if test="${transferencia == null}">
                        Nueva Transferencia
                    </c:if>
                </h3>
            </caption>
                <c:if test="${transferencia != null}">
                    <input type="hidden" name="id" value="${transferencia.id}" />
                </c:if>           
            <tr>
                <th>Rut Persona: </th>
                <td>
                    <input type="text" name="rutpersona" size="45"
                            value="${transferencia.rutpersona}"
                        />
                </td>
            </tr>
            <tr>
                <th>Usuario: </th>
                <td>
                    <input type="text" name="idusuario" size="45"
                            value="${transferencia.idusuario}"
                    />
                </td>
            </tr>
            <tr>
                <th>Cuenta: </th>
                <td>
                    <input type="text" name="idcuenta" size="45"
                            value="${transferencia.idcuenta}"
                    />
                </td>
            </tr>

            <tr>
                <th>Monto: </th>
                <td>
                    <input type="text" name="montotransferencia" size="45"
                            value="${transferencia.montotransferencia}"
                    />
                </td>
            </tr>

            <tr>
                <th>Cuenta Transferencia: </th>
                <td>
                    <input type="text" name="cuentatransferencia" size="45"
                            value="${transferencia.cuentatransferencia}"
                    />
                </td>
            </tr>

            <tr>
                <th>Tipo cuenta: </th>
                <td>
                    <input type="text" name="tipocuenta" size="45"
                            value="${transferencia.tipocuenta}"
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
        <h3>________________________________________________________________________________________________</h3>
        <h5>* Por favor debe completar todos los campos, son obligatorios.</h5>
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