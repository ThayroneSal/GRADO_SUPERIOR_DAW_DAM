package actividadesVarias20241007;

import java.util.Scanner;

public class Ejercicio04_menuInteractivo {

	/*Menú Interactivo
     *Diseña un programa que muestre un menú interactivo con tres opciones:
     *1 Saludar
     *2 Despedirse
     *3 Salir
     *El programa debe permitir al usuario elegir una opción y responder en consecuencia 
     *(por ejemplo, “¡Hola!” o “Adiós”). Este menú debe seguir apareciendo hasta que el usuario seleccione la opción “Salir”.
     *Si el usuario selecciona una opción inválida, el programa debe mostrar un mensaje de error e invitar a elegir nuevamente.
      */
	
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        do {
		            System.out.println("Menú:");
		            System.out.println("1. Saludar");
		            System.out.println("2. Despedirse");
		            System.out.println("3. Salir");
		            System.out.print("Seleccione una opción (1-3): ");

		            opcion = scanner.nextInt();
		            
		            switch (opcion) {
		                case 1:
		                    System.out.println("¡Hola!");
		                    break;
		                case 2:
		                    System.out.println("Adiós!");
		                    break;
		                case 3:
		                    System.out.println("Saliendo del programa...");
		                    break;
		                default:
		                    System.out.println("Error: Opción no válida. Por favor, elija nuevamente.");
		                    break;
		            }

		            System.out.println();

		        } while (opcion != 3);
		    
		        scanner.close();
		    }
		}
		
