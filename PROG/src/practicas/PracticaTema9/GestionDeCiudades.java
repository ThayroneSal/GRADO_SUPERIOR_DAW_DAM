package PracticaTema9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class GestionDeCiudades {

public static void main(String[] args) {

    // Crear un conjunto para almacenar las ciudades, he usado Set para evitar duplicado.
    Set<String> ciudades = new HashSet<String>();
    Scanner scanner = new Scanner(System.in);
    int opcion;
//Crear un menu para gestionar las ciudades, he usado un bucle (while) para que el menu se repita hasta que el usuario decida salir.
    while (true) {
    System.out.println("\n--- OPCIONES DEL MENU --- ");
    System.out.println("1. Agregar una ciudad ");
    System.out.println("2. Mostrar todas las ciudades ");
    System.out.println("3. Buscar una ciudad ");
    System.out.println("4. Eliminar una ciudad ");
    System.out.println("5. Salir del programa ");
    System.out.println("Seleccione una opción: ");
    opcion = scanner.nextInt(); //Nota para un futuro: Para que el usuario elija una opcion debe usar el nextInt()porque las opciones son numericas y no el nextLine() que es String, he estado muchisimo tiempo intentando que funcionara y no me daba cuenta de que el error era por eso.
    scanner.nextLine(); // para limpiar el buffer del scanner después de leer un entero.

    switch (opcion) {
        case 1:
        System.out.print("\n Introduce el nombre de la ciudad: ");
        String ciudad = scanner.nextLine();
        
        // Primeramente he intentado hacer de esta manera pero no se porque no funcionaba, he dejado el comentario para que lo veas: y si puedes explicarmelo mejor.
            //if(!ciudades.add(ciudad)){
            // System.ou.printIn("Error: La ciudad ya exitse en la lista.")}
            
        // He usado el método contains() para verificar si la ciudad ya existe en el conjunto.
            if(ciudades.contains(ciudad)) {
                System.out.println("Error: La ciudad ya existe en la lista.");
        } else {
            ciudades.add(ciudad);
            System.out.println("Ciudad agregada correctamente.");
        }
            break;

            case 2:
        // de esta manera me estaba petando el programa, no se porque, he dejado el comentario para que lo veas: y si puedes explicarmelo mejor.
        //     if (ciudades.isEmpty()){
        //         System.out.println("No hay ciudades. \n");
        //     } else {
        //         Iterator<String> ciudads = ciudades.iterator();
        //         while (ciudads.hasNext());{
        //         System.out.println("- " + ciudads.next());
        //     }
        // }

        // Mostrar todas las ciudades y he usado un bucle for-each para recorrer el conjunto de ciudades.
            if(ciudades.isEmpty()) {
                System.out.println("\nNo hay ciudades en la lista.");
            } else {
                System.out.println("\n--- LISTA DE CIUDADES ---");
                for (String ciudads : ciudades) {
                    System.out.println("- " + ciudads);
                }
            }
            break;

            case 3:
            System.out.print("\nIngrese el nombre de la ciudad a buscar: ");
            String ciudadB = scanner.nextLine();
        // He usado el método contains() para verificar si la ciudad existe en el conjunto.
            if(ciudades.contains(ciudadB)) {
                System.out.println("La ciudad '" + ciudadB + "' está en la lista.");
            } else {
                System.out.println("La ciudad '" + ciudadB + "' no existe en la lista.");
            }
        break;

        // He usado el método remove() para eliminar la ciudad del conjunto.
            case 4:
            System.out.print("\nIngrese el nombre de la ciudad a eliminar: ");
            String ciudadE = scanner.nextLine();
            
            if(ciudades.remove(ciudadE)) {
                System.out.println("Ciudad eliminada correctamente.");
            } else {
                System.out.println("Error: La ciudad no existe en la lista.");
            }
            break;

        // salir del programa, he usado el return para salir del bucle y cerrar el escáner.
            case 5:
            System.out.println("SAliendo del sistema... ");

            scanner.close(); // Cerrar el escáner al final del programa
            return;

        default:
            System.out.println("Opción no válida. Intenta de nuevo.\n");

             }
        }

    }

}
