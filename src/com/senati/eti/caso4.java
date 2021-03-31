package com.senati.eti;
import java.util.Scanner;
public class caso4 {
	public static void main(String[] args) {
//Lea dos números decimales, calcule y muestre las operaciones básicas:
// suma, resta, producto, división y resto entero de ambos valores.
		//entrada de datos 
		Scanner sc =new Scanner(System.in);
		float n1 = 0; 
		float n2 = 0;		
		System.out.println("ingresa el primer numero: ");
		n1 = sc.nextFloat();
		System.out.println("ingresa el segundo numero: ");
		n2 = sc.nextFloat();
		//hallando
		float suma=n1+n2;
		float resta=n1-n2;
		float mult=n1*n2;
		float div=n1/n2;
		float rent=n1-n2;
		
		System.out.println("la suma es: "+suma);
		System.out.println("la resta es: "+resta);
		System.out.println("la multiplicacion es: "+mult);
		System.out.println("la division es: "+div);
		System.out.println("la resta entero es: "+rent);

	}

}
