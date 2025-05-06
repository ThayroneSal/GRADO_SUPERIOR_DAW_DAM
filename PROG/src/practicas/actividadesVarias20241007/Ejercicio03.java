package actividadesVarias20241007;

import java.util.Scanner;

public class Ejercicio03 {

	
	/*Tabla de Multiplicar
    * Escribe un programa que solicite al usuario un número entero y luego muestre la tabla de multiplicar de ese número,
    * del 1 al 10. Cada línea de la salida debe mostrar la operación en el formato X * i = resultado.
	*/
	
		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);

		    
		        System.out.print("Ingrese un número entero: ");
		        int numero = scanner.nextInt();

		      
		        System.out.println("Tabla de multiplicar de " + numero + ":");
		        
		        for (int i = 1; i <= 10; i++) {
		        	
		            int resultado = numero * i; 
		            
		            System.out.println(numero + " * " + i + " = " + resultado); 
		        }

		        scanner.close();
		    }
		}	
