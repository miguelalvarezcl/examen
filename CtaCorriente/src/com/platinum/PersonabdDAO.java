package com.platinum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 

public class PersonabdDAO {
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public PersonabdDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
     
    public boolean insertPersonabd(Personabd personabd) throws SQLException {
        String sql = "INSERT INTO persona (rut,nombre, apellido,direccion,correo,telefono) VALUES (?,?, ?, ?, ?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, personabd.getRut());
        statement.setString(2, personabd.getNombre());
        statement.setString(3, personabd.getApellido());
        statement.setString(4, personabd.getDireccion());
        statement.setString(5, personabd.getCorreo());
        statement.setString(6, personabd.getTelefono());
        
        
        
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
    public List<Personabd> listAllPersonabd() throws SQLException {
        
        List<Personabd> listPersonabd = new ArrayList<>();
        
        String sql = "SELECT * FROM persona";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            String rut = resultSet.getString("rut");
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            String direccion = resultSet.getString("direccion");
            String correo = resultSet.getString("correo");
            String telefono = resultSet.getString("telefono");

             
            Personabd personabd = new Personabd(rut, nombre, apellido,direccion,correo,telefono);
            listPersonabd.add(personabd);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listPersonabd;
    }
     
    public boolean deletePersonabd(Personabd personabd) throws SQLException {
        String sql = "DELETE FROM persona where rut = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, personabd.getRut());
         
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;     
    }
     
    public boolean updatePersonabd(Personabd personabd) throws SQLException {
        String sql = "UPDATE persona SET nombre = ?, apellido = ?,direccion = ?,correo = ?,telefono = ?";
        sql += " WHERE rut = ?";
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, personabd.getNombre());
        statement.setString(2, personabd.getApellido());
        statement.setString(3, personabd.getDireccion());
        statement.setString(4, personabd.getCorreo());
        statement.setString(5, personabd.getTelefono());
        statement.setString(6, personabd.getRut());
        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;     
    }
     
    public Personabd getPersonabd(String rut) throws SQLException {
        Personabd personabd = null;
        String sql = "SELECT * FROM persona WHERE rut = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, rut);
         
        ResultSet resultSet = statement.executeQuery();
         
        if (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            String direccion = resultSet.getString("direccion");
            String correo = resultSet.getString("correo");
            String telefono = resultSet.getString("telefono");
            
             
            personabd = new Personabd(rut, nombre, apellido,direccion,correo,telefono);
        }
         
        resultSet.close();
        statement.close();
         
        return personabd;
    }

    
    
    
       

  
    
    
    
}
