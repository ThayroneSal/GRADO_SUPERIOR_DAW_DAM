package actividadesVarias20241007;

import java.util.Scanner;

public class Ejercicio01_sumadorDeNumeros {

	
	/*Sumador de Números
	 * Escribe un programa que permita al usuario ingresar una serie de números enteros. 
	 * El programa debe seguir pidiendo números hasta que el usuario ingrese "0".
	 *  Una vez que se ingresa "0", el programa debe mostrar la suma total de todos los números ingresados
	 *   (sin contar el 0 final).
	 */
	
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int numero;
		        int sumaTotal = 0;

		        System.out.println("Ingrese una serie de números enteros (ingrese 0 para terminar):");
		   
		        do {
		            numero = scanner.nextInt();

		            if (numero != 0) {
		                sumaTotal += numero;
		            }

		        } while (numero != 0);
		        System.out.println("La suma total de los números ingresados es: " + sumaTotal);
		        
		        scanner.close();
			
	}

}
