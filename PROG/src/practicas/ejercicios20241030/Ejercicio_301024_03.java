package ejercicios20241030;

import java.util.Scanner;

public class Ejercicio_301024_03 {

	  // Enunciado:
      // Escribe un programa que solicite al usuario un número entero positivo.
      // Luego, el programa debe imprimir todos los números del 1 hasta ese número.
      // Usa un bucle for para imprimir los números uno por uno en líneas separadas.
	
	public static void main(String[]args) {
		
		 Scanner entrada = new Scanner(System.in);
	      System.out.println("Dame cuantos numeros quieres: ");
	      int limite = entrada.nextInt();
	      
	      /*
	       *  for ( inicializacion ; Condicion; Incremento)
	       */
	      
	      for(int i = 1; i<=limite; i++) {
		System.out.println(i);
	      }
		
		entrada.close();
		
	}
	
}
