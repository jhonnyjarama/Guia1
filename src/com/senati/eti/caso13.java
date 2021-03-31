package com.senati.eti;
import java.util.Scanner;
public class caso13 {

	public static void main(String[] args) {
		//Ingrese un nombre y un apellido, luego muestre los valores concatenados.
		String nombre , apellido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingresa el nombre: ");
		nombre=sc.nextLine();
		System.out.print("ingresa el apellido: ");
		apellido=sc.nextLine();
		
		System.out.println("nombre: "+nombre);
		System.out.println("apellido: "+apellido);
		System.out.println("**********respuesta*********");
		System.out.println("nombre y apellido: "+nombre+" "+apellido);

	}

}
