package com.wpsnetwork.consoloa;

public class Main {

	public static void main(String[] args) {
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
