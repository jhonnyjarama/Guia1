package com.senati.eti;
import java.util.*;
public class caso24 {

	public static void main(String[] args) {
		// Ingrese tres montos, luego calcule y muestre: ▪ La quinta parte del 
		//primer monto más el 20% del segundo monto. ▪ La mitad del aumento en 60% del 
		//tercer monto. ▪ Disminuya en 8% la suma de los tres montos.
		//variableDisminuya en 8% la suma de los tres montos.
		//variable
		double monto1, monto2,monto3;
		//entrada de datos 
		Scanner sc =new Scanner(System.in);
		System.out.println("ingrese el monto 1: ");
		monto1=sc.nextInt();
		System.out.println("ingrese el monto 2: ");
		monto2=sc.nextInt();
		System.out.println("ingrese el monto 3: ");
		monto3=sc.nextInt();
		//resolvbiendo
		//1
		double p=((monto1/5)+(0.20*monto2));
		//2   
		double j=((monto3 * 1.6)/2);
		//3
		double d=((monto1+monto2+monto3 )* 0.92);
		//mostramos en pantalla
		System.out.println("La quinta parte del primer monto más el 20% del segundo monto es: "+p);
		System.out.println("La mitad del aumento en 60% del tercer monto es: "+j);
		System.out.println("Disminuya en 8% la suma de los tres montos es: "+d);
	}	
}

