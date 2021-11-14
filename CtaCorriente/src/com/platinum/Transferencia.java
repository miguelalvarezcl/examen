
package com.platinum;

	public class Transferencia {
	    protected int id;
	    protected String rutpersona;
	    protected int idusuario;
	    protected int idcuenta;
	    protected int montotransferencia;
	    protected int cuentatransferencia;
	    protected String tipocuenta;
	 
	    public Transferencia() {
	    }
	 
	    public Transferencia(int id) {
	        this.id = id;
	    }
	 
	    public Transferencia(int id,String rutpersona,int idusuario,int idcuenta,int montotransferencia,int cuentatransferencia,String tipocuenta) {
	        this(rutpersona,idusuario,idcuenta,montotransferencia,cuentatransferencia,tipocuenta);
	        this.id = id;
	    }
	     
	    public Transferencia(String rutpersona,int idusuario,int idcuenta,int montotransferencia,int cuentatransferencia,String tipocuenta) {
	        this.rutpersona = rutpersona;
	        this.idusuario = idusuario;
	        this.idcuenta = idcuenta;
	        this.montotransferencia = montotransferencia;
	        this.cuentatransferencia = cuentatransferencia;
	        this.tipocuenta = tipocuenta;

	        
	    }
	 
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getRutpersona() {
	        return rutpersona;
	    }
	 
	    public void setRutpersona(String rutpersona) {
	        this.rutpersona = rutpersona;
	    }

	    public int getIdusuario() {
	        return idusuario;
	    }
	 
	    public void setIdusuario(int idusuario) {
	        this.idusuario = idusuario;
	    }
	    
	    public int getIdcuenta() {
	        return idcuenta;
	    }
	 
	    public void setIdcuenta(int idcuenta) {
	        this.idcuenta = idcuenta;
	    }
	    
	    public int getMontotransferencia() {
	        return montotransferencia;
	    }
	 
	    public void setMontotransferencia(int montotransferencia) {
	        this.montotransferencia = montotransferencia;
	    }	    
	    
	    public int getCuentatransferencia() {
	        return cuentatransferencia;
	    }
	 
	    public void setCuentatransferencia(int cuentatransferencia) {
	        this.cuentatransferencia = cuentatransferencia;
	    }	  	    
	    
	    public String getTipocuenta() {
	        return tipocuenta;
	    }
	 
	    public void setTipocuenta(String tipocuenta) {
	        this.tipocuenta = tipocuenta;
	    }
   
	    
	}