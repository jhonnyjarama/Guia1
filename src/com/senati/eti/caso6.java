package com.senati.eti;
import java.lang.Math;
public class caso6 {

	public static void main(String[] args) {
		//6: Calcule las siguientes operaciones: 5 elevado a 
		//la potencia de 3, Ra�z cuadrada de 81, Ra�z c�bica de 125,
		//Ra�z cuarta de 256 m�s Ra�z cuadrada de 25.
		
		int rpta1=(int)Math.pow(5,3);
		float rpta2=(float)Math.sqrt(81);
		float rpta3=(float)Math.cbrt(125);
		double rpta4=Math.pow(256, 1/4.0)+Math.pow(25, 1/2.0);	//raiz cuarta =1/4.0
		System.out.println("respuesta 1: "+rpta1);
		System.out.println("respuesta 2: "+rpta2);
		System.out.println("respuesta 3: "+rpta3);
		System.out.println("respuesta 4: "+rpta4);
	}
}
