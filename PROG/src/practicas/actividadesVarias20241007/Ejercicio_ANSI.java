package actividadesVarias20241007;

public class Ejercicio_ANSI {

	public static void main(String[] args) {
        // Ejercicio 2: Texto coloreado con ANSI
        // Utiliza códigos ANSI para imprimir texto en colores como rojo, verde y azul.
        // Usa un código de reset (\u001B[0m) para volver al color predeterminado.
		
		final String RESET = "\u001B[0m";
		final String ROJO = "\u001B[31m";
		final String VERDE = "\u001B[32m";
		final String AZUL = "\u001B[34m";
		
		System.out.println(ROJO+"Hola "+ VERDE + "Mundo "+AZUL+"!"+RESET + " Este es el color RESET");
	}

}
