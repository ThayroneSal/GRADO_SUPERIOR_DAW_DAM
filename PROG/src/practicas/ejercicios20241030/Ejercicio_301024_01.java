package ejercicios20241030;

import java.util.Scanner;

public class Ejercicio_301024_01 {

	  // Enunciado:
    // Escribe un programa que solicite al usuario ingresar un número entero.
    // Si el número es positivo, el programa debe mostrar "El número es positivo".
    // Si es negativo, debe mostrar "El número es negativo".
    // Si el número es cero, debe mostrar "El número es cero".
	
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	      System.out.println("Dame un número: ");
	      
	      int numero = entrada.nextInt();
	      
	      if (numero>0) {
	      System.out.println("El número es positivo.");
	      } else if (numero<0) {
	      System.out.println("El número es negativo.");
	     } else {
	      System.out.println("El número es 0.");
	     }	
			
	}

}
