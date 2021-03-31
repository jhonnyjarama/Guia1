package com.senati.eti;
import java.util.Scanner;
public class caso23 {
	public static void main(String[] args) {
  	    //entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese Nombre del producto: ");
		String Num = sc.nextLine();
		System.out.print("Ingrese el precio: ");
		float p = sc.nextFloat();
		System.out.print("Ingrese el cantidad: ");
		int can = sc.nextInt();
		//resolviendo
		float imp = p * can;
		double igv =  (imp * 0.18);
		double desc = (imp * 0.03);
		double total = imp - desc + igv;
		//salida de datos
		System.out.println("RESULTADOS......");
		System.out.println("Ingrese el nombre del producto es......" + Num);
		System.out.println("El importe es......" + imp);
		System.out.println("El IGV es......" + igv);
		System.out.println("El descuento es......" + desc);
		System.out.println("El total es......" + total);
		}
	}
