package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class caso15 {

	public static void main(String[] args) {
		//Ingrese una cantidad, un precio, luego calcule el importe, 
		//su equivalente en dólares (TC 3.24) y en euros (TC 3.75).		
		int cantidad;
		double precio;
		
		Scanner sc=new Scanner(System.in);
		//para que se muestre corto el numero decimal
		//(#.0)dependiendo de que quitemos 0 se ira haciendo chico -)
		DecimalFormat df = new DecimalFormat("#.0"); //para que se muestre corto el numero decimal
		System.out.print("ingrese una cantidad: ");
		cantidad=sc.nextInt();
		System.out.print("ingrese un precio: ");
		precio=sc.nextDouble();
		
		double inporte=(cantidad*precio);
		double dolares=(inporte / 3.24);
		double euros=(inporte / 3.75);
		
		
		System.out.println("el inporte es: "+inporte);
		System.out.println("el inporte en dolares: "+df.format(dolares));
		System.out.println("el inporte en euros: "+euros);
	}

}
