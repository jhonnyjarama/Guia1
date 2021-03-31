package com.senati.eti;
import java.util.Scanner;
public class caso19 {
	public static void main(String[] arg) {
		//Calcule el perímetro de un triángulo.
		//variables
		int lado1,lado2,lado3, perimetro;
		//entrada de datos
		Scanner sc =new Scanner(System.in);
		System.out.println("ingresa el lado1: ");
		lado1=sc.nextInt();
		System.out.println("ingresa el lado2: ");
		lado2=sc.nextInt();
		System.out.println("ingresa el lado3: ");
		lado3=sc.nextInt();
		//operando el perimetro
		perimetro=(lado1+lado2+lado3);
		//salida de datos o mostrar pantalla
		System.out.println("el perimetro es: "+perimetro);
	}

}
