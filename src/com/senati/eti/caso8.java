package com.senati.eti;
import java.util.Scanner;
import java.lang.Math;
public class caso8 {

	public static void main(String[] args) {
		//Ingrese el lado de un cuadrado, calcule y 
		//muestre su área y perímetro.
		
		Scanner sc= new Scanner(System.in);
		float lado=0;
		System.out.print("ingresa lado de cuadrado: ");
		lado =sc.nextFloat();
		
		float area=(int)Math.pow(lado, 2);
		float perimetro= lado*4;
		System.out.println("el area es: "+area);
		System.out.println("el perimetro: "+perimetro);
		
	}

}
