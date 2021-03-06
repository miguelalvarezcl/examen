<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>
    <center>
        <h2>Administrar Usuarios del Sistema</h2>
        <h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/new">Crear usuario</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/list">Listar usuarios</a>
            &nbsp;&nbsp;&nbsp;
        </h3>
    </center>
    <div align="center">
        <table border="0" cellpadding="5">
            <h3>Lista de Usuarios de Sistema</h3>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Password</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="usuariobd" items="${listUsuariobd}">
                <tr>
                    <td><c:out value="${usuariobd.id}" /></td>
                    <td><c:out value="${usuariobd.nombreusuario}" /></td>
                    <td><c:out value="${usuariobd.password}" /></td>

                    <td>
                        <a href="/CtaCorriente/edit?id=<c:out value='${usuariobd.id}' />">Editar</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/CtaCorriente/delete?id=<c:out value='${usuariobd.id}' />">Eliminar</a>                     
                    </td>
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