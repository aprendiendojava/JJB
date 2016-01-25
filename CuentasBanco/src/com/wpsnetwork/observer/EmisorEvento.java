package com.wpsnetwork.observer;


import java.util.ArrayList;
import java.util.List;

public class EmisorEvento {
	private List<Observer> oyentes = new ArrayList<>();
	
	public void addObserver(Observer o){
		oyentes.add(o);
	}
	
	//Manda el evento
	private void update(){
		for(Observer o : oyentes)
			o.update();
	}
	
	//Manda el evento
	private void update(String mensaje){
		for(Observer o : oyentes)
			o.update(mensaje);
	}
	

	public void mensaje(String texto){
		this.update(texto);
	}
}
