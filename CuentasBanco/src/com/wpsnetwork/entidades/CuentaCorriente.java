package com.wpsnetwork.entidades;

import java.util.Date;

import com.wpsnetwork.exceptions.NumeroRojosException;
import com.wpsnetwork.log.LogCuenta;
import com.wpsnetwork.observer.EmisorEvento;
import com.wpsnetwork.observer.ReceptorEvento;

public class CuentaCorriente {
	private int id;//- Identificador de la cuenta corriente  
	private String nombre;//- Nombre del titular   
	private double saldo;//- Cantidad de dinero que contiene 
	public int getId() {
		return id;
	}
//Constructor
	public CuentaCorriente(int id, String nombre, double saldo) {
		setId(id);
		setNombre(nombre);
		setSaldo( saldo);
	}
//Getter and Setter
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
//metodosPropios
	public void modificacionSaldo(double variacionsaldo) throws NumeroRojosException{
		
		double saldofinal=getSaldo()+variacionsaldo;
	   // Log log new Log();
	//	
		if(saldofinal<0){
			try{
			throw new NumeroRojosException("OPERACION DENEGADA:"+"\n"+"variacion del saldo: 0"+"\n"+"La Cuenta no puede entrar en Numeros Rojos");
			}
			catch (NumeroRojosException e){System.out.println(e.getMessage()); }
		}
		else{
			ReceptorEvento oyente = new ReceptorEvento();
			EmisorEvento emisor = new EmisorEvento();
			
			emisor.addObserver(oyente);

			emisor.mensaje("OPERACION REALIZADA: variacion del saldo: "+ variacionsaldo + "\n");	
		setSaldo(saldofinal);}
	}
}
