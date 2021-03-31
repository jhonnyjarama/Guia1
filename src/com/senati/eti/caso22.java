package com.senati.eti;
import java.util.Scanner;
public class caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del alumno: ");
        String name = sc.nextLine();
        
        System.out.print("Ingrese la nota 1 del alumno: ");
        float n1 = sc.nextFloat();
        
        System.out.print("Ingrese la nota 2 del alumno: ");
        float n2 = sc.nextFloat();
        
        System.out.print("Ingrese la nota 3 del alumno: ");
        float n3 = sc.nextFloat();
        
        
        float promedio = (float) (n1*0.2 + n2 *0.3 + n3*0.5);
        
        System.out.println("\n---------------------");
        System.out.println("Resultados " );
        System.out.println("---------------------");
        System.out.println("\nNombre del alumno: " + name);
        System.out.println("\nPromedio del alumno: "+promedio);
    }

 
		        

		
	}


