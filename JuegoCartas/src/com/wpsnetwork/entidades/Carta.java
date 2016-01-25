package com.wpsnetwork.entidades;

import com.wpsnetwork.entidades.enumerados.TipoCarta;

public final class Carta {

	private int numero;
	private String nombrecarta;
	public int puntuacion;
	private TipoCarta palo;

	
	//Construnctor
	public Carta(TipoCarta palo, int numero) {
		this.palo = palo;
		this.numero = numero;
		
		if((numero>1) &&( numero<8 ) ){
			this.puntuacion = numero;
			this.nombrecarta= Integer.toString(numero);
		}
		
		
		else{
	 
		  				switch(numero){		  					
		 					case 1:
		 						this.puntuacion = 11;
		 						this.nombrecarta="As";
		 						break;
		 					case 8:
		 						this.puntuacion = 10;
		 						this.nombrecarta="Sota";
		 						break;
		 					case 9:
		 						this.puntuacion = 10;
		 						this.nombrecarta="Caballo";
		 						break;
		 					case 10:
		 						this.puntuacion = 10;
		 						this.nombrecarta="Rey";
		 			
		 				
		  				}		
		}
		
	}

	

	//Getters
/*	public String getPalo() {
		return palo;
	}
*/
	public int getNumero() {
		return numero;
	}


	public int getPuntuacion() {
		return puntuacion;
	}

	public TipoCarta getPalo() {
		return palo;
	}



	@Override
	public String toString() {
		
		return  nombrecarta +" De "+palo+ "-->"+puntuacion ;	
		}
	
}
