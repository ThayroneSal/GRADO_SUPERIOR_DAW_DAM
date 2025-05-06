package PracticaTema9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ciudades {
    public static void main(String[] args) {

        Set<String> ciudades = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
        System.out.println("\n--- GESTIÓN DE CIUDADES ---");
        System.out.println("1. Agregar ciudad");
        System.out.println("2. Mostrar todas las ciudades");
        System.out.println("3. Buscar ciudad");
        System.out.println("4. Eliminar ciudad");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch(opcion) {
                case 1:
                System.out.print("\nIngrese el nombre de la ciudad: ");
                String ciudad = scanner.nextLine();

                if(ciudades.contains(ciudad)) {
                    System.out.println("Error: La ciudad ya existe en la lista.");
                } else {
                    ciudades.add(ciudad);
                    System.out.println("Ciudad agregada correctamente.");
                }
                    break;
                case 2:
                if(ciudades.isEmpty()) {
                    System.out.println("\nNo hay ciudades en la lista.");
                } else {
                    System.out.println("\n--- LISTA DE CIUDADES ---");
                    for(String ciudade : ciudades) {
                        System.out.println("- " + ciudade);
                    }
                }
                    break;
                case 3:
                System.out.print("\nIngrese el nombre de la ciudad a buscar: ");
                String ciudadB = scanner.nextLine();
                
                if(ciudades.contains(ciudadB)) {
                    System.out.println("La ciudad '" + ciudadB + "' está en la lista.");
                } else {
                    System.out.println("La ciudad '" + ciudadB + "' no existe en la lista.");
                }
                    break;
                case 4:
                System.out.print("\nIngrese el nombre de la ciudad a eliminar: ");
                String ciudads = scanner.nextLine();
                
                if(ciudades.remove(ciudads)) {
                    System.out.println("Ciudad eliminada correctamente.");
                } else {
                    System.out.println("Error: La ciudad no existe en la lista.");
                }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while(opcion != 5);
        
        scanner.close();
    }

}



 // Iterator<String> ciudads = listaCiudades.iterator();
            // while (ciudad.hasNext()){
            //     System.out.println(ciudad.next() + " ");
            // }
            // if (listaCiudades.isEmpty()){
            //     System.out.println("No hay ciudades. \n");
            // }