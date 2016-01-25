package com.wpsnetwork.entidades;

import java.sql.Date;

import java.util.ArrayList;

import com.wpsnetwork.interfaces.CalucularPrecio;

public  final  class Alquiler  {
 
 private java.util.Date fechacontrato=  new java.util.Date();
 private double preciofinal;
 private double iva =1.21;
 ArrayList<Alquiler> lista = new ArrayList<>();


 

//constructores hago uno para particulares y otro para empresas

 public Alquiler(Particular particular, Piso piso){ 
	    this.preciofinal =  getPrecioAlquiler( (preciobaseopera,  descuento) ->  iva*(preciobaseopera-(preciobaseopera*descuento)),piso.getPrecio(),0) ;
 }

 public Alquiler(Empresa empresa, Piso piso){  
	    this.preciofinal =  getPrecioAlquiler( (preciobaseopera,  descuento) ->  iva*(preciobaseopera-(preciobaseopera*descuento)),piso.getPrecio(),.01) ;
}
 
 public void  guardaDatosAlquiler(Alquiler a){
		lista.add(a);
	} 
 public Alquiler  dameDatosAlquiler(int index ){
	return lista.get(index);
	} 
 

 public double  getPrecioAlquiler(CalucularPrecio o,double preciobase, double descuento){
		return o.operacion(preciobase, descuento);
	} 
//Getter and Setter


public Date getFechacontrato() {
	return (Date) fechacontrato;
}
public void setFechacontrato(java.util.Date fechacontrato) {
	this.fechacontrato = fechacontrato;
}

public double getPreciofinal() {
	return preciofinal;
}
public void setPreciofinal(double preciofinal) {
	this.preciofinal = preciofinal;
}

@Override
public String toString() {
	return " [precio final=" + getPreciofinal() + "]";
}
}


 
 

 


