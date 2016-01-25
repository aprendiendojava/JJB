package com.wpsnetwork.consola;

import com.wpsnetwork.entidades.Memorando;

public class Main {

	public static void main(String[] args) {
	int numarticulos=3;	
	Memorando memo =new Memorando("Las Edades Del Hombre",numarticulos);
	String[] articulo= new String [numarticulos] ;

	
	articulo[0] = "Articulo 1eeeee";
	articulo[1] = "Articulo 2";
	articulo[2] = "iiiiiiii";
	memo.setNumeroArticulos(numarticulos);
	

	
	//articulo[0] es un String
    memo.setArticulo(0, articulo[0]);
    memo.setArticulo(1, articulo[1]);

	System.out.println(memo);
//	System.out.println(memo.getArticulo(0));
//	System.out.println(memo.getArticulo(1));
	String textoaprocesar= "rti";
	for (int n=0;n<numarticulos;n++){
	if (memo.articulosQueCumplenCon(articulo[n],textoaprocesar) ){
		System.out.println("Esto "+articulo[n]+" contiene "+textoaprocesar);}
	else
		System.out.println("Esto NOOOOO "+articulo[n]+" contiene "+textoaprocesar);
	
	}
	}
	

}
