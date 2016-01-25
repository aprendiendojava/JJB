package com.wpsnetwork.entidades;

import java.util.Arrays;

import com.wpsnetwork.interfaces.IProcesa;

public class Memorando {
private String titulo;
private int numeroArticulos; 
private String[] articulo ;

//Constructores
public Memorando(String titulo, int numeroArticulos) {
	this.titulo = titulo;
	this.numeroArticulos = numeroArticulos;
	//Cuando construyo doy dimension al array en funcion de numero de articulos 
	articulo	= new String [numeroArticulos]		;
}
public Memorando( int numeroArticulos) {
	this.numeroArticulos = numeroArticulos;
	//Cuando construyo doy dimension al array en funcion de numero de articulos 
	articulo	= new String [numeroArticulos]		;
}
//Getter and Setter
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getNumeroArticulos() {
	return numeroArticulos;
}
public void setNumeroArticulos(int numeroArticulos) {
	this.numeroArticulos = numeroArticulos;
}



public String getArticulo(int posicion) {
	if (posicion>numeroArticulos){/*lanzar exception*/}
	return articulo[posicion] ;
	
}
public void setArticulo(int posicion,String articulo) {
	if (posicion>numeroArticulos){/*lanzar exception*/}
	this.articulo[posicion] = articulo;
}


///////Medodos propios

public boolean articulosQueCumplenCon (String art,String textoavalidar) {


	if( articulosCon( textoopera ->   art.contains(textoopera),textoavalidar ))return true;
	else return false;
}
public boolean articulosCon (IProcesa validacion,String textoavalidar) {
	return validacion.valida(textoavalidar);
	
}
/*
public boolean articulosCon (Articulo art,String textoavalidar) {
	if (art.getContenido().contains(textoavalidar)) return true;
	else
	return false;
	//return valida(art.getContenido() -> art.getContenido().contains);
	// this.preciofinal =  getPrecioAlquiler( (preciobaseopera,  descuento) ->  iva*(preciobaseopera-(preciobaseopera*descuento)),piso.getPrecio(),0) ;
}*/

@Override
public String toString() {
	return "Memorando [titulo=" + titulo + ", numeroArticulos=" + numeroArticulos + ", articulo="
			+ Arrays.toString(articulo) + "]";
}




}
