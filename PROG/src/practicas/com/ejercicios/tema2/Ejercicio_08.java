package com.ejercicios.tema2;

public class Ejercicio_08 {
	
	
	/*
	 *  Objetivo: Practicar la declaración de variables y realizar operaciones matemáticas simples.
     * Instrucciones:
     * 1. Declara dos variables double llamadas ancho y alto con los valores 4.5 y 3.2 respectivamente.
     * 2. Calcula el área (ancho * alto) y el perímetro (2 * (ancho + alto)) del rectángulo.
     * 3. Imprime los resultados 
	 */
	
	
	public static void main (String[] args) {
	
		double ancho = 4.5;
		double alto = 3.2;
		
		System.out.println(("El area es:") +ancho * alto);
		System.out.println(("El perimetro es:") +2*(ancho + alto));
		
		
		double ancho1 = 4.5;                    /* lo he hecho de dos maneras pregunta al profe la manera mas usada*/
		double alto1 = 3.2;
		
		double area = ancho1 * alto1;
		double perimetro = 2 * (ancho + alto);
				
		
		System.out.println(("El area es:") +area);
		System.out.println(("EL perimetro es:") +perimetro);
		
	}

}
