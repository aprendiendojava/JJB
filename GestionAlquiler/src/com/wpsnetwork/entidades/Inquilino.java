package com.wpsnetwork.entidades;

public class Inquilino {
	
private String nombre;

public Inquilino(String nombre) {
	setNombre(nombre);
}

//Getter and Setter
public String getNombre() {
	return this.nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return " [Nombre=" + nombre + "]";
}


}
