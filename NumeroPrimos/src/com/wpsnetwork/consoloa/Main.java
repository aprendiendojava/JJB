package com.wpsnetwork.consoloa;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {

	
	private static final Logger logger = LogManager.getLogger(Main.class.getName());
	

		
	
	

	
	public static void main(String[] args) {
		
		 //Escribir varios mensajes
		logger.trace("Este es un mensaje de trace");
		logger.debug("Este es un mensaje de debug");
		logger.info("Este es un mensaje de info");
		logger.warn("Este es un mensaje de warning");
		logger.error("Este es un mensaje de error");
		logger.fatal("Este es un mensaje fatal");
		
		// TODO Auto-generated method stub
     System.out.println(calculaPrimo(20,22));
	}

	
	public static int calculaPrimo(int minimo, int maximo) {           
		int primo = minimo;           
		if (primo<=1)return 0;   

		boolean esPrimo = false;            
		do {               
			esPrimo=false;               
			int superior=(int) Math.sqrt(primo);  
			
			int n;               
			for (n = 2; n<superior;n+=1) {                  
				if (primo%n==0) {                     
					break;                  
					}               
				}               
			if (n>=superior){                  
				esPrimo = true; 
				//primo=0;
				} 
			else{                  
				primo++;               
				}            
			}
		while (!esPrimo && primo<maximo);            
		return esPrimo? primo : 0;  
		
		
		

		} 
	
	
	
}
