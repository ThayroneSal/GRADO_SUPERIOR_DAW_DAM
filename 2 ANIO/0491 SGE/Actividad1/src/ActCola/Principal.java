package ActCola;
// Principal.java

public class Principal {
    public static void main(String[] args) {
        // Crear una Cola de tipo String
        ColaArrayList<String> miCola = new ColaArrayList<>();

        System.out.println("--- PRUEBA DE COLA (FIFO) ---");

        // 1. Encolar elementos (A, B, C)
        miCola.encolar("Cliente A"); // Primero en entrar
        miCola.encolar("Cliente B");
        miCola.encolar("Cliente C"); // Último en entrar
        
        System.out.print("Estado actual: ");
        miCola.mostrarElementos();
        
        System.out.println("Primer elemento (sin quitar): " + miCola.getFirst()); // Debe ser 'Cliente A'
        
        // 2. Desencolar (FIFO: sale el primero que entró)
        miCola.desencolar(); // Sale 'Cliente A'
        miCola.desencolar(); // Sale 'Cliente B'
        
        System.out.print("Estado actual: ");
        miCola.mostrarElementos(); // Debe quedar solo 'Cliente C'
        
        System.out.println("Nuevo primer elemento: " + miCola.getFirst()); // Debe ser 'Cliente C'
        
        // 3. Desencolar el último
        miCola.desencolar(); // Sale 'Cliente C'
        
        System.out.print("Estado final: ");
        miCola.mostrarElementos(); // Cola vacía
        
      
    }
}
