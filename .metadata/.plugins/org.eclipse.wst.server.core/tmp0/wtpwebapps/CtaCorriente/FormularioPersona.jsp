<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>:::... Banco Platinum ...:::</title>
</head>
<body>

    <center>
        <h2>Administración de Personas</h2>
        <h3>________________________________________________________________________________________________</h3>
        <h3>
            <a href="/CtaCorriente/newpersona">Nueva persona</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/CtaCorriente/listPersonabd">Listar personas</a>      
        </h3>
    </center>
    <div align="center">
        <c:if test="${personabd != null}">
            <form action="updatepersona" method="post">
        </c:if>
        <c:if test="${personabd == null}">
            <form action="insertpersona" method="post">
        </c:if>
        <table border="0" cellpadding="5">
            <caption>
                <h3>
                    <c:if test="${personabd != null}">
                        Editar persona
                    </c:if>
                    <c:if test="${personabd == null}">
                        Agregar Persona al Sistema (Cliente)
                    </c:if>
                </h3>
            </caption>
            
					<c:if test="${personabd != null}">
                        <tr>
                			<th>Rut: </th>
                		<td>
                    		<input type="text" name="rut" size="45" readonly
                            value="${personabd.rut}"
                        	/>
                		</td>
            			</tr> 
                    </c:if>
                    <c:if test="${personabd == null}">
                        <tr>
                			<th>Rut: </th>
                		<td>
                    		<input type="text" name="rut" size="45" 
                            value="${personabd.rut}"
                        	/>
                		</td>
            			</tr> 

                    </c:if>            
            
            
            
      
            <tr>
                <th>Nombre: </th>
                <td>
                    <input type="text" name="nombre" size="45"
                            value="${personabd.nombre}"
                        />
                </td>
            </tr>
            <tr>
                <th>Apellido: </th>
                <td>
                    <input type="text" name="apellido" size="45"
                            value="${personabd.apellido}"
                    />
                </td>
            </tr>

            <tr>
                <th>Direccion: </th>
                <td>
                    <input type="text" name="direccion" size="45"
                            value="${personabd.direccion}"
                    />
                </td>
            </tr>
            
            <tr>
                <th>Correo: </th>
                <td>
                    <input type="text" name="correo" size="45"
                            value="${personabd.correo}"
                    />
                </td>
            </tr>            

            <tr>
                <th>Telefono: </th>
                <td>
                    <input type="text" name="telefono" size="45"
                            value="${personabd.telefono}"
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
    	</center>   
</body>
</html>

<style>
body{
	font-family: arial, helvetica;
	background: #DCDCDC;
}
</style>