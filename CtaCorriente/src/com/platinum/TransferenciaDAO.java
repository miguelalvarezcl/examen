package com.platinum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 

public class TransferenciaDAO {
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public TransferenciaDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
     
    public boolean insertTransferencia(Transferencia transferencia) throws SQLException {
        String sql = "INSERT INTO transaccion (rutpersona, idusuario,idcuenta,montotransferencia,cuentatransferencia,tipocuenta) VALUES (?,?, ?,?,?,?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, transferencia.getRutpersona());
        statement.setInt(2, transferencia.getIdusuario());
        statement.setInt(3, transferencia.getIdcuenta());
        statement.setInt(4, transferencia.getMontotransferencia());
        statement.setInt(5, transferencia.getCuentatransferencia());
        statement.setString(6, transferencia.getTipocuenta());
       
        
        
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
     
 public List<Transferencia> listAllTransferencia() throws SQLException {
        
        List<Transferencia> listTransferencia = new ArrayList<>();
        
        String sql = "SELECT * FROM transaccion";
         
        connect();
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String rutpersona = resultSet.getString("rutpersona");
            int idusuario = resultSet.getInt("idusuario");
            int idcuenta = resultSet.getInt("idcuenta");
            int montotransferencia = resultSet.getInt("montotransferencia");
            int cuentatransferencia = resultSet.getInt("cuentatransferencia");
            String tipocuenta = resultSet.getString("tipocuenta");
             
            Transferencia transferencia = new Transferencia(id, rutpersona, idusuario,idcuenta,montotransferencia,cuentatransferencia,tipocuenta);
            listTransferencia.add(transferencia);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listTransferencia;
    }    
     

     

     

    
    
    
    
    
    
    
}
