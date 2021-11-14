
package com.platinum;

public class Personabd {
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String correo;
    protected String telefono;
 
    public Personabd() {
    }
 
    public Personabd(String rut) {
        this.rut = rut;
    }
 
    public Personabd(String rut, String nombre, String apellido,String direccion,String correo,String telefono) {
        this(nombre, apellido,direccion, correo, telefono);
        this.rut = rut;
    }
     
    public Personabd(String nombre, String apellido,String direccion,String correo,String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        
        
    }
 
    public String getRut() {
        return rut;
    }
 
    public void setRut(String rut) {
        this.rut = rut;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCorreo() {
        return correo;
    }
 
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

}