package actividadesVarias20241007;

public class Ejercicio_FondoDeColor {
	
    public static void main(String[] args) {
        // Ejercicio 4: Mensajes destacados
        // Muestra mensajes importantes con fondo de color y texto resaltado
        // usando combinaciones de códigos ANSI.
    	
    	final String FONDO_ROJO = "\u001B[41m";
    	final String RESET = "\u001B[0m";
    	System.out.println(FONDO_ROJO + "\u001B[33m"+"¡ALERTA, INTRUSO!"+RESET);
    	
    	
    }
}


