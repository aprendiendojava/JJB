package com.wpsnetwork.entidades;

public class Piso {
	private int planta;
	private int numero;
	private double preciobase;
	//construnctor
	public Piso(int planta, int numero, double preciobase) {
		setPlanta  (planta);
		setNumero ( numero);
		setPrecio ( preciobase);
	}
	
	//Setter and Getter
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getPrecio() {
		return preciobase;
	}
	public void setPrecio(double preciobase) {
		this.preciobase = preciobase;
	}

	@Override
	public String toString() {
		return " [planta=" + planta + "numero"+numero+"preciobase"+preciobase+"]";
	}

}
