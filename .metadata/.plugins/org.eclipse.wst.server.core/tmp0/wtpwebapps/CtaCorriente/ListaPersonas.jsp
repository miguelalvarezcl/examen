<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>
    <center>
        <h2>Administración de Personas</h2>
        		<h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/newpersona">Crear Persona</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/listPersonabd">Listar Personas</a>

        </h3>
    </center>
    <div align="center">
        <table border="0" cellpadding="5">
            <h3>Lista de Personas (Clientes)</h3>
            <tr>
                <th>Rut</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Dirección</th>
                <th>Correo</th>
                <th>Teléfono</th>
                <th>Acciones</th>
                
            </tr>
            <c:forEach var="personabd" items="${listPersonabd}">
                <tr>
                    <td><c:out value="${personabd.rut}" /></td>
                    <td><c:out value="${personabd.nombre}" /></td>
                    <td><c:out value="${personabd.apellido}" /></td>
                    <td><c:out value="${personabd.direccion}" /></td>
                    <td><c:out value="${personabd.correo}" /></td>
                    <td><c:out value="${personabd.telefono}" /></td>

                    <td>
                        <a href="/CtaCorriente/editpersona?rut=<c:out value='${personabd.rut}' />">Editar</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/CtaCorriente/deletepersona?rut=<c:out value='${personabd.rut}' />">Eliminar</a>                     
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