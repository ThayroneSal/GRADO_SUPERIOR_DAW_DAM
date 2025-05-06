package sesion20250326;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarColeccion {

    public static void main(String[] args) {
        // Crear una lista de enteros
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(5);
        listaEnteros.add(3);
        listaEnteros.add(9);
        listaEnteros.add(1);

       // Muestro la lista desordenada
       System.out.println("Lista desordenada:\n" + listaEnteros);

        // Ordenar la lista de enteros
        Collections.sort(listaEnteros);

        // Muestro la lista ordenada
        System.out.println("\nLista ordenada:\n" + listaEnteros);
        
    }
}
 