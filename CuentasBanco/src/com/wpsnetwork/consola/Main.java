package com.wpsnetwork.consola;

import com.wpsnetwork.entidades.CuentaCorriente;
import com.wpsnetwork.exceptions.NumeroRojosException;
import com.wpsnetwork.log.LogCuenta;

public class Main {

	public static void main(String[] args) throws NumeroRojosException {
		CuentaCorriente cuenta =new CuentaCorriente(1,"Pepe",0);
		double variacionsaldo=1;
		cuenta.modificacionSaldo(variacionsaldo);
		LogCuenta.getInstance(cuenta);
		
		cuenta.modificacionSaldo(-3);
		LogCuenta.getInstance(cuenta);
	}

}
