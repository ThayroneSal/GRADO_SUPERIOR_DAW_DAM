package ActPila;

public interface PilaInterfaz<T> {

    //Añade un nuevo elemnto en la pila (push o apilar)

    void push (T elemento);

    // Elimina y devuelve el elemento en el tope de la pila

    T pop();

    // Devuelve el elemento en el tope de la pila sin eliminarlo

    T peek();

    // muestra todos los elementos de la pila

    void mostrarElementos();



}