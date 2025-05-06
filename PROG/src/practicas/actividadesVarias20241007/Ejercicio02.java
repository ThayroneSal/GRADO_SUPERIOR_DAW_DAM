package actividadesVarias20241007;

import java.util.Scanner;

public class Ejercicio02 {
	
	
	/*Calculadora Básica
	*Crea un programa que solicite al usuario ingresar dos números y un símbolo de operación (+, -, *, /).
	*El programa debe realizar la operación especificada entre los dos números y mostrar el resultado.
	*Si el usuario ingresa un símbolo que no sea válido, el programa debe mostrar un mensaje de error.
	*/
	
	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el primer número: ");
		        double numero1 = scanner.nextDouble();

		        System.out.print("Ingrese el segundo número: ");
		        double numero2 = scanner.nextDouble();

		        System.out.print("Ingrese un símbolo de operación (+, -, *, /): ");
		        char operacion = scanner.next().charAt(0); 

		        double resultado;

		        switch (operacion) {
		            case '+':
		                resultado = numero1 + numero2;
		                System.out.println("El resultado de " + numero1 + " + " + numero2 + " es: " + resultado);
		                break;
		            case '-':
		                resultado = numero1 - numero2;
		                System.out.println("El resultado de " + numero1 + " - " + numero2 + " es: " + resultado);
		                break;
		            case '*':
		                resultado = numero1 * numero2;
		                System.out.println("El resultado de " + numero1 + " * " + numero2 + " es: " + resultado);
		                break;
		            case '/':
		                if (numero2 != 0) { 
		                    resultado = numero1 / numero2;
		                    System.out.println("El resultado de " + numero1 + " / " + numero2 + " es: " + resultado);
		                } else {
		                    System.out.println("Error: No se puede dividir entre cero.");
		                }
		                break;
		            default:
		                System.out.println("Error: Símbolo de operación no válido.");
		                break;
		        }
		        scanner.close();		
		
	}

}
