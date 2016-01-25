package com.wpsnetwork.entidades;

public  class Particular extends Inquilino{
private String nif;

//Constructor
public Particular(String nombre,String nif) {
	super(nombre);
	setNif(nif);
}


//Getter y Setter
public String getNif() {
	return nif;
}

public void setNif(String nif) {
	this.nif = nif;
}


@Override
public String toString() {
	return " [nif=" + nif + "]";
}


}
