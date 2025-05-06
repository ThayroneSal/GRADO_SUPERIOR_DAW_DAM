package com.ejercicios.tema2;

public class Ejercicio_09 {
	
	
	
	/*
	 *  Objetivo: Practicar el intercambio de valores entre dos variables sin usar una tercera variable.
     * Instrucciones:
     * 1. Declara dos variables int llamadas a y b con los valores 7 y 9 respectivamente.
     * 2. Intercambia los valores de a y b sin usar una variable temporal.
     * 3. Imprime los valores de a y b después del intercambio
	 */
	
	
	
	public static void main (String[] args) {
		
		int a = 7;                          /* pregunta al profesor si esta forma es correcta */
		int b = 9;
		
		 System.out.println (("El valor de 'a' antes del intercambio es:") +a );
		 System.out.println (("El valor de 'b' antes del intercambio es:") +b );
		 System.out.println (("Valor de 'a' después del intercambio es:") +(a = b - 2));
		 System.out.println (("Valor de 'b' después del intercambio es:") +(b = a + 2));
		 
		
	}
	

}
