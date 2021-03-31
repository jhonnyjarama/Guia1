package com.senati.eti;
import java.lang.Math;
import java.text.DecimalFormat;
public class caso7 {

	public static void main(String[] args) {
		DecimalFormat sc = new DecimalFormat("#.0");
	  float rp =  (float) (( ((17*2) + (float)Math.pow(3,2)-6) / 5 ) +(float) -2 *(4.7+(1.2*-2)));
	
	  
		System.out.println("Resultado: "+ sc.format(rp));			
	}

}
