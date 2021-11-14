package com.platinum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 

public class UsuariobdDAO {
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public UsuariobdDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
     
    public boolean insertUsuariobd(Usuariobd usuariobd) throws SQLException {
        String sql = "INSERT INTO usuario (nombreusuario, password) VALUES (?, ?)";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, usuariobd.getNombreusuario());
        statement.setString(2, usuariobd.getPassword());
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
    public List<Usuariobd> listAllUsuariosbd() throws SQLException {
        List<Usuariobd> listUsuario = new ArrayList<>();
         
        String sql = "SELECT * FROM usuario";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombreusuario = resultSet.getString("nombreusuario");
            String password = resultSet.getString("password");

             
            Usuariobd usuariobd = new Usuariobd(id, nombreusuario, password);
            listUsuario.add(usuariobd);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listUsuario;
    }
     
    public boolean deleteUsuariobd(Usuariobd usuariobd) throws SQLException {
        String sql = "DELETE FROM usuario where id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, usuariobd.getId());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;     
    }
     
    public boolean updateUsuariobd(Usuariobd usuariobd) throws SQLException {
        String sql = "UPDATE usuario SET nombreusuario = ?, password = ?";
        sql += " WHERE id = ?";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, usuariobd.getNombreusuario());
        statement.setString(2, usuariobd.getPassword());
        statement.setInt(3, usuariobd.getId());
        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;     
    }
     
    public Usuariobd getUsuariobd(int id) throws SQLException {
        Usuariobd usuariobd = null;
        String sql = "SELECT * FROM usuario WHERE id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
         
        ResultSet resultSet = statement.executeQuery();
         
        if (resultSet.next()) {
            String nombreusuario = resultSet.getString("nombreusuario");
            String password = resultSet.getString("password");
            
             
            usuariobd = new Usuariobd(id, nombreusuario, password);
        }
         
        resultSet.close();
        statement.close();
         
        return usuariobd;
    }
}