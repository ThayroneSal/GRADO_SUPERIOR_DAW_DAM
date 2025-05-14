package simulacroDelExamenFinal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimulacroExamenFinal {

    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("\n---INTRODUZ EL NOMBRE ÚNICO Y PARA SALIR (fin) ---");
        String nombre = scanner.nextLine();

        // Observación: si usamos .equalsIgnoreCase("fin") hace que "fin", "Fin" o "FIN" terminen el programa

        if (nombre.equals("fin")) {
            break;
        }

        if (arrayList.contains(nombre)){
            System.out.println("\n ERROR: El nombre ya existe");

        }else if (arrayList.add(nombre)) {
            System.out.println("\n El nombre se adiciono correctamente.");
        }

    }
    System.out.println("\n---Lista de nombres únicos---");
    for (String nombre1 : arrayList) {
        System.out.println("- " + nombre1);
        }

        scanner.close();
    }
}
