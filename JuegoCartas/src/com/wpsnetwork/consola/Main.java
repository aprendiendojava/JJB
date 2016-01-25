package com.wpsnetwork.consola;

import com.wpsnetwork.entidades.Carta;
import com.wpsnetwork.entidades.Mano;
import com.wpsnetwork.entidades.Baraja;
import com.wpsnetwork.entidades.enumerados.TipoCarta;

public class Main /**/{
	public static  void main(String[]args){
		
		/* 
		Carta carta1 = new Carta( TipoCarta.OROS,1);
	
		//System.out.println(c1);
		
		Carta[] manoArray =new Carta[4];
		
		manoArray[0]= carta1;
		manoArray[1]= new Carta( TipoCarta.OROS,8);
		manoArray[2]= new Carta( TipoCarta.OROS,9);
		manoArray[3]= new Carta( TipoCarta.OROS,10);	
			
		Mano mano =new Mano(manoArray.length);
		mano.Repartir(manoArray);
		System.out.println(mano);
		
		int p=mano.puntuacion();
		System.out.println(p);
		*/
		
		Baraja partida =new Baraja();
		//int n =partida.reparte();
		String dimequecarta=partida.mano(40);
		System.out.println(dimequecarta);
		
		
		
	}
}
