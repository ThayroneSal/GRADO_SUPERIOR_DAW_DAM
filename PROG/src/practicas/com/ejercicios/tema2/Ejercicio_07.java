package com.ejercicios.tema2;

public class Ejercicio_07 {
	
	
	/*
	 *  Objetivo: Practicar la conversión entre tipos de datos numéricos y cadenas (String).
     * Instrucciones:
     * 1. Declara una variable int llamada numero con el valor 42.
     * 2. Convierte numero a una cadena y almacénalo en una variable numeroCadena.
     * 3. Declara una variable String llamada texto con el valor "123".
     * 4. Convierte texto a un número entero y almacénalo en una variable textoEntero.
     * 5. Imprime ambos resultados 
	 */
	
	public static void main (String [] args) {
	 
		int numero = 42;
		String numeroCadena = Integer.toString(numero);
		System.out.println("El numero en texto es" +numeroCadena);
		 
		String texto = "123";
		int textoEntero = Integer.parseInt(texto);
		System.out.println("EL texto en numero entero es" +textoEntero);
		
		/* perdir un repaso de estos ejercicios*/
		
		
		
	}
	

}
