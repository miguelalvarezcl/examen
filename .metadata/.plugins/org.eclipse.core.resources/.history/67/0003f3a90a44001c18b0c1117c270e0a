<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>Banco Platinum</title>
</head>
<body>
    <center>
        <h1>Mantencion de usuarios</h1>
        <h2>
            <a href="/CtaCorriente/new">Nuevo usuario</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/list">Listar usuarios</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/home.jsp">Inicio</a> 
        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <h2>Lista de usuarios</h2>
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
                        <a href="/CtaCorriente/edit?id=<c:out value='${usuariobd.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/CtaCorriente/delete?id=<c:out value='${usuariobd.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
</body>
</html>