package com.wpsnetwork.entidades;

public class Articulo {
	private int articulo;
	private String contenido;
	//Constructor
	public Articulo(int articulo, String contenido) {
		setArticulo (articulo);
		setContenido ( contenido);
	}
	
	//Getter and Setter
	public int getArticulo() {
		return articulo;
	}
	public void setArticulo(int articulo) {
		this.articulo = articulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	

}

