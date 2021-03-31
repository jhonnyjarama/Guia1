package com.senati.eti;
import java.util.Scanner;
public class caso14 {

	public static void main(String[] args) {
		int iNumero ;
		Scanner sc =new Scanner(System.in);
		System.out.print("ingrese un numero: ");
		iNumero=sc.nextInt();
		
		
		int iSumatorio = 0;
		int iContador = iNumero;
				
		while (iContador != 0) {
			iSumatorio = iSumatorio + iContador;
		    iContador--;
		    }
				
		System.out.println("El sumatorio de " + iNumero + " es " + iSumatorio);

	}

}
