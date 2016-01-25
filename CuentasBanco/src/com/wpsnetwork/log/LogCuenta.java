package com.wpsnetwork.log;

import java.util.Date;

import com.wpsnetwork.entidades.CuentaCorriente;
import com.wpsnetwork.observer.EmisorEvento;
import com.wpsnetwork.observer.ReceptorEvento;

public class LogCuenta {


	private static LogCuenta instancia = new LogCuenta();

	private LogCuenta() {
	
		
	}
	
	public static LogCuenta getInstance(CuentaCorriente cuenta){
		Date fecha =new Date();
		//Patrón observer
		ReceptorEvento oyente = new ReceptorEvento();
		EmisorEvento emisor = new EmisorEvento();
		
		emisor.addObserver(oyente);

		emisor.mensaje(fecha.toString()+"\n"+
		"ID:"+cuenta.getId()+"\n"+
		"TITULAR:"+cuenta.getNombre()+"\n"+
		"SALDO FINAL:"+cuenta.getSaldo()+"\n");
		return instancia;
	}

}

