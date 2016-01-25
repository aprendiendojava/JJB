package com.wpsnetwork.junit;

import static org.junit.Assert.*;


import org.junit.Test;

import com.wpsnetwork.consoloa.Main;

public class TesteaNumeroPrimo {

	@Test
	public void test() {
		int numero=(Main.calculaPrimo(1,5));
		assertEquals("Fallo en el Calculo del primer primo", 2, numero);
		
	}

}
