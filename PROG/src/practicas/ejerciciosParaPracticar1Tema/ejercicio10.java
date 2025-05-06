package ejerciciosParaPracticar1Tema;

import java.util.Scanner;

public class ejercicio10 {
	
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrece el primero numero");
		int num1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		int num2 = entrada.nextInt();
		
		System.out.println("Ingrese el tercer numero");
		int num3 = entrada.nextInt();
		
	/* && es un operador logico que siempre va devolver true es decir si num1 es 10 y num2 es 5 y num3 es 4, va comparar
	 * 1 compraracion 
	 * if (num1 >= num 2 seria true && num1 >= num3 true)
	 * else if (num2 >= num1 seria false && num2 >=num3 seria true)
	 *                     num1 >= num2 seria true. 
	 *  else( num3 cuando ninguna de las condiciones es true)
	 *   
	 * resumen: el valor que devolveria seria num1 que siempre sera el numero mayor. que lo compara en if.
	 */
		if (num1 >= num2 && num1 >= num3) {
			
			System.out.println("El numero mayor es: " + num1);
			
		} else if (num2 >= num1 && num2 >= num3) {
			
			System.out.println("El numero mayor es " + num2);
			
		} else {
			
			System.out.println("el numero mayor es " + num3);
		}
		
	}
	
}
