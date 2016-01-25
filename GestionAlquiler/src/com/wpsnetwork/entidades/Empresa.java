package com.wpsnetwork.entidades;

public  class Empresa extends Inquilino{
private String cif;
	
public Empresa(String nombre,String cif) {
		super(nombre);
		setCif(cif);
	}

public String getCif() {
	return cif;
}

public void setCif(String cif) {
	this.cif = cif;
}




@Override
public String toString() {
	return " [cif=" + cif + "]";
}
}
