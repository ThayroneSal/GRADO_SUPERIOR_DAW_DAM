package simulacroDelExamenFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VolverHacer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> nombres = new ArrayList<>();

        while (true) {

            System.out.print("Introduzca el nombre que desee, o 'fin' para salir: ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) { break;
                
            }

            if (!nombres.contains(nombre)) {
                nombres.add(nombre);
                
            } else {
                System.out.println("ERROR: El nombre introducido ya existe.");
            }
        }

        System.out.println("\nLista de nombres:");

        for (String nombre1 : nombres){
            System.out.println("- " + nombre1);
        }
        scanner.close();
    }
}
