package ActCola;
public interface ColaInterfaz<T> {

    //Añade un nuevo elemnto en la cola (encolar)

    void encolar (T elemento);

    // Eliminina y devuelve el primer elemento de la cola (desencolar)

    T desencolar();

    // Devuelve el primer elemento de la cola sin eliminarlo (getFist o peek)

    T getFirst();

    // muestra todos los elementos de la cola en orden

    void mostrarElementos();



}
