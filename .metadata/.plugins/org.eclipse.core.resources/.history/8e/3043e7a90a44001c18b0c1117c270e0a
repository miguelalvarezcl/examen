<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Registro de cuentas</title>
</head>
<body>

    <center>
        <h1>Mantencion de cuentas</h1>
        <h2>
            <a href="/CtaCorriente/newcuenta">Nuevo cuenta</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/listCuentabd">Listar cuentas</a>
             
        </h2>
    </center>
    <div align="center">
        <c:if test="${cuentabd != null}">
            <form action="updatecuenta" method="post">
        </c:if>
        <c:if test="${cuentabd == null}">
            <form action="insertcuenta" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${usuariobd != null}">
                        Editar cuenta
                    </c:if>
                    <c:if test="${usuariobd == null}">
                        Agregar cuenta
                    </c:if>
                </h2>
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
</body>
</html>