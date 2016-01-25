package com.wpsnetwork.observer;


public class ReceptorEvento implements Observer {

	@Override
	public void update() {
		System.out.println("Evento ");
	}

	@Override
	public void update(String mensaje) {
		System.out.println("Evento " + mensaje);
	}

}