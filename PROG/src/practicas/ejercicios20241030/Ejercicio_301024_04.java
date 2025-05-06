package ejercicios20241030;

import java.util.Scanner;

public class Ejercicio_301024_04 {

	// Enunciado:
    // Escribe un programa que muestre un menú de opciones para convertir unidades:
    // 1. Kilómetros a millas
    // 2. Grados Celsius a Fahrenheit
    // 3. Kilogramos a libras
    // 4. Salir
    // El programa debe solicitar al usuario la cantidad a convertir y mostrar el resultado.
    // Usa un bucle for para repetir el menú hasta que el usuario elija salir.
	
	public static void main (String[] Args) {
		
		 Scanner scanner = new Scanner(System.in);
	      int opcion;
		 
	      do { 
	    	  System.out.println("Seleccione la opcion:");
	    	  System.out.println("1. Kilometros a Millas");
	    	  System.out.println("2. Grados Celsius a Fahrenheit");
	    	  System.out.println("3. kilogramos a libra");
	    	  System.out.println("4. Salir");
	    	  
	    	  opcion = scanner.nextInt();
	    			  
	    	  switch (opcion) {
	    	  
	    	  case 1:
	    		  System.out.println("Ingrece la distancia en Kilometros:");
	    		  double kilometros = scanner.nextDouble();
	    		  double millas = kilometros*0.621371;
	    		  System.out.println("las millas son: " +millas);
	    		  break;
	    		  
	    	  case 2:
	    		  System.out.println("Ingrese la temperatura en Grados Celsius:");
	    		  double gradosCelsius = scanner.nextDouble();
	    		  double fahrenheit = (gradosCelsius*9/5)+32;
	    	  System.out.println("La temperatura en Fahrenheit es:" +fahrenheit);
	    	  break;
	    	  
	    	  case 3:
	    		  System.out.println("Ingrece el peso en Kilogramos:");
	    		  double kilogramos = scanner.nextDouble();
	    		  double libras = kilogramos*2.20462;
	    	  System.out.println("El peso en libra es: " +libras);
	    		  break;
	    		  
	    	  case 4:
	    		  System.out.println("Saliendo...");
	    		  break;
	    		  
	    		  default: 
	    			  System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
	    	  }
	    	  
	    	  System.out.println();
	    	  
	      } while (opcion>1 || opcion<4);
	       
	       scanner.close ();
	      
	}
	
	}
	  

	
	
		
	
		
		
		

