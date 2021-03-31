package com.senati.eti;
import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
		//Lea dos números decimales, calcule y muestre las siguientes 
		//operaciones: promedio de los dos números, aumente el primer 
		//número en 20%, disminuya el segundo número en 30%.
		
		Scanner sc = new Scanner(System.in);
		
		float n1=0;
		float n2=0;
		
		System.out.println("ingresa el primer numero: ");
		n1= sc.nextFloat();
		System.out.println("ingresa el segundo numero: ");
		n2= sc.nextFloat();
		
		//operando
		float prom=((n1+n2)/2);
		//aumentando en 20%
		double j =n1* 0.2;
		double aum = n1+j;
		//disminuyendo
		double p=n2*0.3;
		double men= n2-p;
		
		
		System.out.println("el promedio: "+prom);
		System.out.println("el numero aumentado en 20%: "+aum);
		System.out.println("el numero disminuido en 30% :"+men);
		
		

	}

}
