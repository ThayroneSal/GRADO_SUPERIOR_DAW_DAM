package ActPila;

import java.util.ArrayList;

public class PilaArrayList<T> implements PilaInterfaz<T> {
    private ArrayList<T> elementos;

    public PilaArrayList() {
        this.elementos = new ArrayList<>();
    }

    // Método para añadir un elemento al tope (final del ArrayList)
    @Override
    public void push(T elemento) {
        elementos.add(elemento); // ArrayList.add() añade al final (TOPE)
        System.out.println("Push (Apilado): " + elemento);
    }

    // Método para eliminar y devolver el elemento del tope (final del ArrayList)
    @Override
    public T pop() {
        if (elementos.isEmpty()) {
            throw new RuntimeException("Error: La pila está vacía. No se puede hacer pop.");
        }
        // ArrayList.remove(size - 1) elimina y devuelve el ÚLTIMO elemento
        T tope = elementos.remove(elementos.size() - 1); 
        System.out.println("Pop (Desapilado): " + tope);
        return tope;
    }

    // Método para devolver el elemento del tope sin eliminarlo
    @Override
    public T peek() {
        if (elementos.isEmpty()) {
            throw new RuntimeException("Error: La pila está vacía. No hay tope.");
        }
        // ArrayList.get(size - 1) devuelve el ÚLTIMO elemento sin removerlo
        return elementos.get(elementos.size() - 1); 
    }

    // Método para mostrar todos los elementos
    @Override
    public void mostrarElementos() {
        System.out.println("Elementos de la Pila (Tope <- ... -> Base): " + elementos);
    }
}
