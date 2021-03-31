package com.senati.eti;
import java.util.Scanner;
public class caso21 {

	public static void main(String[] args) {
		// Disminuya el valor de un gasto en 12%.
		//variables
		double valor ,total,dismi;
		//entrada de datos
		Scanner sc=new Scanner(System.in);
		System.out.print("ingrese el valor: ");
		valor=sc.nextInt();
		//disminuyendo
		dismi=(valor*0.88);//100%-12%
		//salida de datos o mostrar pantalla
		System.out.println("el valor disminuido en 12% es: "+dismi);
		

	}

}
