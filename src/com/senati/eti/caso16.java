package com.senati.eti;
import java.util.Scanner;


//importar 
import java.text.DecimalFormat;
public class caso16 {

	public static void main(String[] args) {
//Ingrese las Horas Trabajadas y la Tarifa por Hora, calcule el sueldo,	
//el bono (5% del sueldo), el total y el equivalente en dólares (TC 3.24) del total.
		//variables
		int horast;
		double tarifap;
		//entrada de datos
		Scanner sc=new Scanner(System.in);
		//decimal format
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.print("ingrese las horas trabajadas: ");
		horast=sc.nextInt();
		System.out.print("ingrese tarifa de horas: ");
		tarifap=sc.nextDouble();
		//calcular sueldo
		double sueldo=(horast*tarifap);
		//el bono de  5% = 0.05
		double bono=(sueldo*0.05);
		//total 
		double total=(sueldo+bono);
		//conver en dolares
		double dolar=(total/3.24);
		//mostrar en pantalla o salida de datos
		System.out.println("sueldo: "+sueldo);
		System.out.println("bono: "+bono);
		System.out.println("total: "+total);
		System.out.println("dolar: "+df.format(dolar));
	}

}
