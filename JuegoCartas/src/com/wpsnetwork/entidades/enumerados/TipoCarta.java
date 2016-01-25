package com.wpsnetwork.entidades.enumerados;

public enum TipoCarta {
	OROS("Oros"), COPAS("Copas"), ESPADAS("Espadas"), BASTOS("Bastos"); 
	private String cadena;
	
	private TipoCarta(String cadena){
		this.cadena = cadena;
	}
	
	@Override
	public String toString(){
		return cadena;
	}

}
