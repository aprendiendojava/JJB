package com.wpsnetwork.entidades;
import java.util.Vector;

import com.wpsnetwork.entidades.Carta;
public final class Mano {
	private int numerocartas;
	private int puntostotales;
	private Carta[] manodecartas;
	
//constructor
	public Mano(int numerocartas) {
		//this.numerocartas = numerocartas;
		
	} 


	
	public void Repartir(Carta[] manodecartas) {
		
		this.manodecartas =manodecartas;
		this.numerocartas = manodecartas.length ;
	}
	public int puntuacion() {
		int numcartasrecorro=0;	
		while (numcartasrecorro<numerocartas){
			
			 puntostotales= puntostotales+manodecartas[numcartasrecorro].puntuacion;
			numcartasrecorro++;};

		return puntostotales;
		
	}
		public String 	dimequecarta() {
		String dimequecarta="";
		dimequecarta=manodecartas[0]+",";
		
		return dimequecarta;
	
	}
	
	@Override
	public String toString() {
		int numcartasrecorro=0;
		String devolver="";		
		while (numcartasrecorro<numerocartas)
			{devolver=devolver+manodecartas[numcartasrecorro]+",";
			numcartasrecorro++;};


		return 	devolver;
				
	}




	
	
}
