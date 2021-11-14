package com.platinum;

public class Usuariobd {
    protected int id;
    protected String nombreusuario;
    protected String password;
 
    public Usuariobd() {
    }
 
    public Usuariobd(int id) {
        this.id = id;
    }
 
    public Usuariobd(int id, String nombreusuario, String password) {
        this(nombreusuario, password);
        this.id = id;
    }
     
    public Usuariobd(String nombreusuario, String password) {
        this.nombreusuario = nombreusuario;
        this.password = password;
        
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNombreusuario() {
        return nombreusuario;
    }
 
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
}