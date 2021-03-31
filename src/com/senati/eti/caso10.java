package com.senati.eti;
import java.text.DecimalFormat;//para disminuir los defcimales
import javax.swing.JOptionPane;
import java.lang.Math;

public class caso10 {

	public static void main(String[] args) {
		//Ingrese el radio de un círculo, calcule y muestre su área. 
		//Considere el valor de PI en 3.1416.
		
		float rad;
		//el joption pane es un estring por ende lo convertimos a  float 
		rad = Float.parseFloat(JOptionPane.showInputDialog("ingrese el radio: "));
		
		
		 double area=((Math.PI*Math.pow(rad, 2)));
		 double per=(2*Math.PI*rad);
		 //primera manera
		 System.out.println("el area es: "+area);
		 System.out.println("el perimetro: "+per);
		 //segunda
		
		 
		 JOptionPane.showMessageDialog(null,"el area es: "+area);
		 JOptionPane.showMessageDialog(null,"el perimetro es: "+per);
		 
		

	}

}
