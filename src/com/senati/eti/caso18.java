package com.senati.eti;
import java.util.Scanner;
public class caso18 {

	public static void main(String[] args) {
		// Calcule el área de un triángulo.
		//variable 
		int area , base , altura;
		//entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese base: ");
		base=sc.nextInt();
		System.out.print("ingrese altura: ");
		altura=sc.nextInt();
		//operar area
		area=((base*altura)/2);
		//mostrar en pantalla o salida de datos
		System.out.println("el area es: "+area);
		
	}

}
