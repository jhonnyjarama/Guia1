package com.senati.eti;
import java.util.Scanner;
import java.lang.Number;

public class caso9 {

	public static void main(String[] args) {
		// Ingrese los dos lados de un rectángulo, calcule y 
		// muestre su área y perímetro.
		
		Scanner sc=new Scanner(System.in);
		int lado1=0 , lado2=0;
		System.out.print("ingresa el lado 1 del rectangulo: ");
		lado1=sc.nextInt();
		System.out.print("ingrese el lado 2 del rectangulo: ");
		lado2=sc.nextInt();
		
		
		int area=(lado1*lado2);
		int perimetro=(6*2)+(8*2);
		
		
		System.out.println("el area: "+area);
		System.out.println("el perimetro: "+perimetro);

	}

}
