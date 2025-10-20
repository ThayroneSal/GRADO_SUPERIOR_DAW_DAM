package ActCola;


import java.util.ArrayList;

public class ColaArrayList<T> implements ColaInterfaz<T> {
    private ArrayList<T> elementos;

    // Constructor que inicializa el ArrayList
    public ColaArrayList() {
        this.elementos = new ArrayList<>();
    }

    // Método para añadir un elemento al final de la cola (FIFO)
    @Override
    public void encolar(T elemento) {
        elementos.add(elemento); // ArrayList.add() añade al final
        System.out.println("Encolado: " + elemento);
    }

    // Método para eliminar y devolver el primer elemento (FIFO)
    @Override
    public T desencolar() {
        if (elementos.isEmpty()) {
            throw new RuntimeException("Error: La cola está vacía. No se puede desencolar.");
        }
        // ArrayList.remove(0) elimina y devuelve el elemento en la primera posición
        T primero = elementos.remove(0); 
        System.out.println("Desencolado: " + primero);
        return primero;
    }

    // Método para devolver el primer elemento sin eliminarlo
    @Override
    public T getFirst() {
        if (elementos.isEmpty()) {
            throw new RuntimeException("Error: La cola está vacía. No hay primer elemento.");
        }
        // ArrayList.get(0) devuelve el elemento en la primera posición sin removerlo
        return elementos.get(0); 
    }

    // Método para mostrar todos los elementos
    @Override
    public void mostrarElementos() {
        System.out.println("Elementos de la Cola (Primero -> Último): " + elementos);
    }
    
    // Método auxiliar (no pedido, pero útil) para saber si está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}