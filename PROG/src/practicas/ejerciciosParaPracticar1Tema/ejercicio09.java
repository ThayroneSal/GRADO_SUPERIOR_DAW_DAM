package ejerciciosParaPracticar1Tema;

import java.util.Scanner;

public class ejercicio09 {

	
	public static void main (String[]args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrece la edad");
		int edad = entrada.nextInt();
		
		
		if (edad >= 18) {
			
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		
	}
	
}
