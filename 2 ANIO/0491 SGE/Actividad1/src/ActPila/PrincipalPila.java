package ActPila;

public class PrincipalPila {
    public static void main(String[] args) {
        // Crear una Pila de tipo Integer
        PilaArrayList<Integer> miPila = new PilaArrayList<>();

        System.out.println("\n--- PRUEBA DE PILA (LIFO) ---");

        // 1. Push (Apilar) elementos (10, 20, 30)
        miPila.push(10); // Primero en entrar (BASE)
        miPila.push(20);
        miPila.push(30); // Último en entrar (TOPE)
        
        System.out.print("Estado actual: ");
        miPila.mostrarElementos(); // [10, 20, 30]

        System.out.println("Elemento en el Tope (sin quitar): " + miPila.peek()); // Debe ser 30
        
        // 2. Pop (Desapilar) (LIFO: sale el último que entró)
        miPila.pop(); // Sale 30 (LIFO)
        miPila.pop(); // Sale 20
        
        System.out.print("Estado actual: ");
        miPila.mostrarElementos(); // Debe quedar solo [10]
        
        System.out.println("Nuevo elemento en el Tope: " + miPila.peek()); // Debe ser 10
        
        // 3. Desapilar el último
        miPila.pop(); // Sale 10
        
        System.out.print("Estado final: ");
        miPila.mostrarElementos(); // Pila vacía
    }
}
