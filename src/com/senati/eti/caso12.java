package com.senati.eti;

public class caso12 {
	public static void main(String[] args) {
		//En la frase: 'ESCUELA DE TECNOLOGÍA E INFORMÁTICA', 
		//extraiga y muestre la primera ('ESCUELA'), tercera ('TECNOLOGÍA') 
		//y quinta ('INFORMÁTICA') palabra.
		
		String frase="escuela de tecnologia e informatica";
		
		System.out.println("palabra 1: "+frase.substring(0,7));
		System.out.println("palabra 2: "+frase.substring(11,21));
		System.out.println("palabra 3: "+frase.substring(24,35));
		
	}

}
