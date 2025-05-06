package ejercicios20241030;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_301024_05 {

	
	// Enunciado:
    // Escribe un programa que solicite al usuario adivinar un número entre 1 y 100.
    // El programa generará un número aleatorio entre 1 y 100.
    // Luego, el usuario intentará adivinar el número introduciendo diferentes valores.
    // El programa debe decirle al usuario si el número es "demasiado bajo", "demasiado alto" o "correcto".
    // El bucle termina cuando el usuario acierta el número.
	
	public static void main (String[]args) {
		
		Random random = new Random();
		
		 Scanner scanner = new Scanner(System.in);
		
		int numeroSecreto = random.nextInt (100)+1;
		int intento;
		
		System.out.println("Bienvenido, intenta adivinar el numero aleatorio que he generado");
		
		 do {
			 System.out.println("Introduce tu intento");
			 intento = scanner.nextInt();
			 
			 if (intento<numeroSecreto) {
				 System.out.println("Demasiado bajo, intenta de nuevo");
			 } else if (intento>numeroSecreto) {
				 System.out.println("Demasiado Alto, Intenta de nuevo");
			 } else {
					 System.out.println("Has adivinado el numero.");
				 }
		 } while (intento != numeroSecreto);
		 
			 scanner.close();
				 
			 }
	
		 }
		 

