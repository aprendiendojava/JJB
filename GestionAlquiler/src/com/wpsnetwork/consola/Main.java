package com.wpsnetwork.consola;


import java.util.ArrayList;

/**/


import com.wpsnetwork.entidades.Alquiler;

import com.wpsnetwork.entidades.Empresa;
import com.wpsnetwork.entidades.Inquilino;
import com.wpsnetwork.entidades.Particular;
import com.wpsnetwork.entidades.Piso;

public class Main {

	public static  void main(String[]args){	
		
	Particular persona = new Particular("Sancho","0000001A");
	Piso piso =new Piso(1, 1, 450.5);
	Alquiler alquiler =new Alquiler(persona,piso);
	alquiler.guardaDatosAlquiler(alquiler);
	
	

	
	System.out.println(alquiler.dameDatosAlquiler(0));
	

	
	
	Empresa empresa = new Empresa("Consolida SA","A2344523");
	Piso piso2 =new Piso(1, 2, 550.5);
	Alquiler alquiler2 =new Alquiler(empresa,piso2);
	alquiler2.guardaDatosAlquiler(alquiler2);
	System.out.println(alquiler2.dameDatosAlquiler(0));
	
/*	
	Inquilino inquilino =new Inquilino("Tomas");
	Particular persona2 = new Particular(inquilino.getNombre(),"0000001A");
	Piso piso3 =new Piso(1, 3, 475.5);
	Alquiler alquiler3 =new Alquiler(persona2,piso3);
	System.out.println(alquiler3);
	
	
	ArrayList<Alquiler> alquilerArray = new ArrayList<>();
	alquilerArray.add(alquiler);
	alquilerArray.add(alquiler2);
	alquilerArray.add(alquiler3);

	
	
//	System.out.println("q");
*/
	

	
}
}
