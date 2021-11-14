package com.platinum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 

public class CuentabdDAO {
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public CuentabdDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
     
    public boolean insertCuentabd(Cuentabd cuentabd) throws SQLException {
        String sql = "INSERT INTO ctacorrient (rutcliente,monto, ejecutivo) VALUES (?,?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, cuentabd.getRutcliente());
        statement.setString(2, cuentabd.getMonto());
        statement.setString(3, cuentabd.getEjecutivo());
       
        
        
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
 public List<Cuentabd> listAllCuentabd() throws SQLException {
        
        List<Cuentabd> listCuentabd = new ArrayList<>();
        
        String sql = "SELECT * FROM ctacorrient";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String rutcliente = resultSet.getString("rutcliente");
            String monto = resultSet.getString("monto");
            String ejecutivo = resultSet.getString("ejecutivo");
             
            Cuentabd cuentabd = new Cuentabd(id, rutcliente, monto,ejecutivo);
            listCuentabd.add(cuentabd);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCuentabd;
    }    
     
    public boolean deleteCuentabd(Cuentabd cuentabd) throws SQLException {
        String sql = "DELETE FROM ctacorrient where id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);

        statement.setInt(1, cuentabd.getId()); 
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;     
    }
     

     
    public Cuentabd getCuentabd(int id) throws SQLException {
        Cuentabd cuentabd = null;
        String sql = "SELECT * FROM ctacorrient WHERE id = ?";
         
        connect();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, id);
         
        ResultSet resultSet = statement.executeQuery();
         
        if (resultSet.next()) {
            String rutcliente = resultSet.getString("rutcliente");
            String monto = resultSet.getString("monto");
            String ejecutivo = resultSet.getString("ejecutivo");
            
             
            cuentabd = new Cuentabd(id, rutcliente, monto,ejecutivo);
        }
         
        resultSet.close();
        statement.close();
         
        return cuentabd;
    }
    
    
    
    public boolean updateCuentabd(Cuentabd cuentabd) throws SQLException {
        String sql = "UPDATE ctacorrient SET rutcliente = ?, monto = ?,ejecutivo = ?";
        sql += " WHERE id = ?";
        connect();
        System.out.println(sql);
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);

        statement.setString(1, cuentabd.getRutcliente());
        statement.setString(2, cuentabd.getMonto());
        statement.setString(3, cuentabd.getEjecutivo());
        
        statement.setInt(4, cuentabd.getId());       
        
        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;     
    }      
    
    
    
}
