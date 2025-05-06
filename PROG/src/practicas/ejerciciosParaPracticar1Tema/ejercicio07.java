package ejerciciosParaPracticar1Tema;

import java.util.Scanner;

public class ejercicio07 {

	
	/* sintaxis del codigo do while 
	 *   do {
     * Código a ejecutar
     *  } while (condición);
	 */
	
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String contraseña;
		
		do { 
			
			System.out.println("Ingrese la contraseña:");
			contraseña = entrada.next();
			
		} while (!contraseña.equals ("1234")); /* Después de que el usuario ingresa una contraseña, 
se evalúa la condición del bucle: !contraseña.equals("1234").
Aquí, ! es el operador lógico "no", y equals es un método que compara dos cadenas (en este caso, la cadena ingresada
por el usuario y "1234").
Si la contraseña ingresada no es igual a "1234", entonces la condición será verdadera (true) y el bucle continuará. */
		
		System.out.println("EL numero es correcto");
	}
}

/*Resumen del codigo
*El código solicita repetidamente al usuario que ingrese una contraseña.
*Utiliza un bucle do-while, lo que garantiza que al menos una solicitud se realice antes de verificar
* si debe continuar pidiendo más entradas.
*La comparación de cadenas se realiza utilizando el método .equals(), y se usa ! para invertir el resultado,
* permitiendo así seguir solicitando hasta obtener la respuesta correcta.
* */
