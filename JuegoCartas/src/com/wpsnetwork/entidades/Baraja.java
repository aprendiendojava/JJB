package com.wpsnetwork.entidades;

import com.wpsnetwork.entidades.Carta;
import com.wpsnetwork.entidades.Mano;
import com.wpsnetwork.entidades.enumerados.TipoCarta;

import java.util.Vector;

public class Baraja {

//private Carta[] manodecartas;
Vector<Carta> vectorbaraja = new Vector<Carta>();
//private Carta Vector v;
//cosntructor
	public Baraja() {
		iniciarJuego();
		}
	
	
		public void iniciarJuego() {	
		
		int cartacreada=1;
		while (cartacreada<11){
		vectorbaraja.add(new Carta( TipoCarta.OROS,cartacreada));cartacreada++;}
		
		cartacreada=1;
		while (cartacreada<11){
		vectorbaraja.add(new Carta( TipoCarta.COPAS,cartacreada));cartacreada++;}
		
		cartacreada=1;
		while (cartacreada<11){
		vectorbaraja.add(new Carta( TipoCarta.ESPADAS,cartacreada));cartacreada++;}
		cartacreada=1;
		while (cartacreada<11){
		vectorbaraja.add(new Carta( TipoCarta.BASTOS,cartacreada));cartacreada++;}
		java.util.Collections.shuffle(vectorbaraja); 
	}
		 
		public void barajar() {
			java.util.Collections.shuffle(vectorbaraja); 
			
		}

		public String reparte() {
			Carta[] manoArray =new Carta[1];
			manoArray[0]= vectorbaraja.elementAt(0);
			Mano mano= new Mano(1);
			mano.Repartir(manoArray);
			vectorbaraja.removeElementAt(0);
			
			return mano.dimequecarta();
			
				
		}
		public String mano(int numcartasarepartir) {
			String devolver="";
			while (numcartasarepartir>0){
				String dimequecarta=reparte();
				devolver=devolver+dimequecarta+"\n";
				numcartasarepartir--;}
			
			return devolver;
		}
}
