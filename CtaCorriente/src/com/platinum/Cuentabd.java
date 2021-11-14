
package com.platinum;

	public class Cuentabd {
	    protected int id;
	    protected String rutcliente;
	    protected String monto;
	    protected String ejecutivo;
	 
	    public Cuentabd() {
	    }
	 
	    public Cuentabd(int id) {
	        this.id = id;
	    }
	 
	    public Cuentabd(int id, String rutcliente, String monto, String ejecutivo) {
	        this(rutcliente, monto,  ejecutivo);
	        this.id = id;
	    }
	     
	    public Cuentabd(String rutcliente, String monto, String ejecutivo) {
	        this.rutcliente = rutcliente;
	        this.monto = monto;
	        this.ejecutivo = ejecutivo;
	        
	    }
	 
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getRutcliente() {
	        return rutcliente;
	    }
	 
	    public void setRutcliente(String rutcliente) {
	        this.rutcliente = rutcliente;
	    }
	 
	    public String getMonto() {
	        return monto;
	    }
	 
	    public void setMonto(String monto) {
	        this.monto = monto;
	    }

	    
	    public String getEjecutivo() {
	        return ejecutivo;
	    }
	 
	    public void setEjecutivo(String ejecutivo) {
	        this.ejecutivo = ejecutivo;
	    }
	    
	    
	}