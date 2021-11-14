<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>

    <center>
        <h2>Administración de Usuarios</h2>
<h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/new">Nuevo Usuario</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/list">Listar Usuarios</a>
                  
        </h3>
    </center>
    <div align="center">
        <c:if test="${usuariobd != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${usuariobd == null}">
            <form action="insert" method="post">
        </c:if>
        <table border="0" cellpadding="5">
            <caption>
                <h3>
                    <c:if test="${usuariobd != null}">
                        Editar usuario
                    </c:if>
                    <c:if test="${usuariobd == null}">
                        Crear Nuevo Usuario
                    </c:if>
                </h3>
            </caption>
                <c:if test="${usuariobd != null}">
                    <input type="hidden" name="id" value="${usuariobd.id}" />
                </c:if>           
            <tr>
                <th>Nombre: </th>
                <td>
                    <input type="text" name="nombreusuario" size="45"
                            value="${usuariobd.nombreusuario}"
                        />
                </td>
            </tr>
            <tr>
                <th>Clave: </th>
                <td>
                    <input type="text" name="password" size="45"
                            value="${usuariobd.password}"
                    />
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Guardar" />
                </td>
            </tr>
        </table>
        </form>
    </div>  
    <center>
	<h3>________________________________________________________________________________________________</h3>
    <h5>* Por favor debe completar ambos campos, son obligatorios.</h5>
    </center>
</body>
</html>

<style>
body{
	font-family: arial, helvetica;
	background: #DCDCDC;
}
</style>