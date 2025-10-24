package ActCola;
public interface ColaInterfaz<T> {

    //Añade un nuevo elemnto en la cola (encolar)

    public void encolar (T elemento);

    // Eliminina y devuelve el primer elemento de la cola (desencolar)

    public T desencolar();

    // Devuelve el primer elemento de la cola sin eliminarlo (getFist o peek)

    public T getFirst();

    // muestra todos los elementos de la cola en orden

    public void mostrarElementos();



}
