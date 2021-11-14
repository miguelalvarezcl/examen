package com.platinum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

	public Usuario checkLogin(String usuario, String password) throws SQLException, 
			ClassNotFoundException {
		String jdbcURL = "jdbc:mysql://localhost:3306/cuentas_clientes";
		String dbUser = "root";
		String dbPassword = "";

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		String sql = "SELECT * FROM usuario WHERE nombreusuario = ? and password = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, usuario);
		statement.setString(2, password);

		ResultSet result = statement.executeQuery();

		Usuario user = null;

		if (result.next()) {
			user = new Usuario();
			user.setNombreusuario(result.getString("nombreusuario"));
			//user.setNombreusuario(email);
		}

		connection.close();

		return user;
	}
}
